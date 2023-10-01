package bem;

import bem.Data;
import bem.Item;
import bem.GeradorID;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Emprestimo {
    // Atributos da Classe
	private String id; // Id interna do emprestimo
	private String membroId; // Identificação do membro
	private String itemId; // Identificação do item
    private Data dataEmprestimo;  // Data de emprestimo
    private Data dataVencimento; // Data de vencimento da locação
    private Data dataDevolucao; // Data de devolução
    private boolean devolvido; // Indica se o livro foi novamente devolvido, e o emprestimo encerrado
    private double valorMultaPorDia; // Valor da multa por dia 

    // Construtor da Classe
    public Emprestimo(String membroId, String itemId, double valorMultaPorDia) {
        this.membroId = membroId; 
        this.itemId = itemId;
        this.dataEmprestimo = new Data();
        this.dataVencimento = calcularDataVencimento(membroId);
        this.devolvido = false;
        this.valorMultaPorDia = valorMultaPorDia;
        GeradorID gerador = new GeradorID(); // gerar ID do emprestimo
        this.id = gerador.gerarId();
        List<Emprestimo> emprestimos = new ArrayList<>();
        Emprestimo novoEmprestimo = new Emprestimo("ID_DO_MEMBRO", "ID_DO_ITEM", valorMultaPorDia);
                   
    }

    public enum PerfilMembro {
        ESTUDANTE_GRADUACAO,
        ESTUDANTE_POS_GRADUACAO,
        PROFESSOR,
        FUNCIONARIO
    }
    
    public class RegrasEmprestimo {
        public static int getPrazoEmprestimo(PerfilMembro perfilMembro) {
            switch (perfilMembro) {
                case ESTUDANTE_GRADUACAO:
                    return 15;
                case ESTUDANTE_POS_GRADUACAO:
                    return 20;
                case PROFESSOR:
                    return 30;
                case FUNCIONARIO:
                    return 20;
                default:
                    return 0; // Perfil não reconhecido
            }
        }

        public static int getLimiteEmprestimo(PerfilMembro perfilMembro) {
            switch (perfilMembro) {
                case ESTUDANTE_GRADUACAO:
                    return 3;
                case ESTUDANTE_POS_GRADUACAO:
                    return 5;
                case PROFESSOR:
                    return 7;
                case FUNCIONARIO:
                    return 4;
                default:
                    return 0; // Perfil não reconhecido
            }
        }

        public static double getMultaPorAtraso(PerfilMembro perfilMembro) {
            switch (perfilMembro) {
                case ESTUDANTE_GRADUACAO:
                case ESTUDANTE_POS_GRADUACAO:
                    return 1.0;
                case PROFESSOR:
                    return 0.5;
                case FUNCIONARIO:
                    return 0.75;
                default:
                    return 0.0; // Perfil não reconhecido
            }
        }
    }

    // Calculo da data de venceimento
    private Data calcularDataVencimento(String membroId) {
    	Data dataVencimento = new Data();
    	int prazoDias = 0;
    	 // Determinar o prazo de vencimento com base no tipo de membro
        if (membroId.startsWith("EG")) {
            prazoDias = 15;
        } else if (membroId.startsWith("EP")) {
            prazoDias = 20;
        } else if (membroId.startsWith("P")) {
            prazoDias = 30;
        } else if (membroId.startsWith("F")) {
            prazoDias = 20;
        }

        // Adicionar o prazo de dias ao data de empréstimo
        dataVencimento.adicionarDias(prazoDias);

        return dataVencimento;
    }
    
    // Calculo da multa caso o item não seja devolvido
    public double calcularMulta() {
        if (dataDevolucao == null || dataVencimento == null) {
            return 0.0; // Ainda não foi devolvido ou não há data de vencimento, multa zero
        }

        int diasAtraso = dataDevolucao.diferencaEmDias(dataVencimento);
        
        if (diasAtraso <= 0) {
            return 0.0; // Sem atraso, multa zero
        }

        double multaPorDia = 0.0;

        // Determinar a multa por dia com base no tipo de membro
        if (membroId.startsWith("EG") || membroId.startsWith("EP")) {
            multaPorDia = 1.0; // Estudantes de graduação e pós-graduação
        } else if (membroId.startsWith("P")) {
            multaPorDia = 0.5; // Professores
        } else if (membroId.startsWith("F")) {
            multaPorDia = 0.75; // Funcionários
        }

        return diasAtraso * multaPorDia;
    }
    
    // Método para realizar a devolução do item
    public void realizarDevolucao() {
        dataDevolucao = new Data();
        devolvido = true;
    }
    
    // Método estático para calcular o número de empréstimos de um item específico
    public static int calcularEmprestimos(List<Emprestimo> emprestimos, String itemId) {
        int contador = 0;

        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getItemId().equals(itemId)) {
                contador++;
            }
        }

        return contador;
    }
  
    public class ExcecaoLimiteEmprestimoExcedido extends Exception {
        public ExcecaoLimiteEmprestimoExcedido(String mensagem) {
            super(mensagem);
        }
    }

    public class ExcecaoItemNaoDisponivel extends Exception {
        public ExcecaoItemNaoDisponivel(String mensagem) {
            super(mensagem);
        }
    }
    
    public class ExcecaoMultaPendente extends Exception {
        public ExcecaoMultaPendente(String mensagem) {
            super(mensagem);
        }
    }

    public class Multa {
        private double valor;

        public Multa(double valor) {
            this.valor = valor;
        }

        public double getValor() {
            return valor;
        }
    }
    
    public void realizarEmprestimo(List<Emprestimo> emprestimos, List<Item> itens, PerfilMembro perfilMembro) throws ExcecaoLimiteEmprestimoExcedido, ExcecaoItemNaoDisponivel, ExcecaoMultaPendente {
        int quantidadeEmprestimosAtivos = calcularQuantidadeEmprestimosAtivos(emprestimos, membroId);

        // Verificar limite de empréstimos
        if (quantidadeEmprestimosAtivos >= RegrasEmprestimo.getLimiteEmprestimo(perfilMembro)) {
            throw new ExcecaoLimiteEmprestimoExcedido("Limite de empréstimo excedido para este membro.");
        }

        // Verificar multas pendentes
        if (verificarMultasPendentes(membroId)) {
            throw new ExcecaoMultaPendente("Membro possui multas pendentes e não pode fazer novos empréstimos.");
        }

        // Verificar disponibilidade do item
        if (!verificarDisponibilidadeItem(itemId, itens)) {
            throw new ExcecaoItemNaoDisponivel("O item solicitado não está disponível no momento.");
        }

        // Criar o empréstimo
        Emprestimo emprestimo = new Emprestimo(membroId, itemId, valorMultaPorDia);

        // Adicionar o empréstimo à lista de empréstimos
        emprestimos.add(emprestimo);

        System.out.println("Empréstimo realizado com sucesso.");
    }

    // Método para calcular a quantidade de empréstimos ativos de um membro
    public int calcularQuantidadeEmprestimosAtivos(List<Emprestimo> emprestimos, String membroId) {
        int quantidadeAtivos = 0;

        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getMembroId().equals(membroId) && !emprestimo.isDevolvido()) {
                quantidadeAtivos++;
            }
        }

        return quantidadeAtivos;
    }

    
 // Método para verificar a disponibilidade de um item pelo seu ID
    private boolean verificarDisponibilidadeItem(String itemId, List<Item> itens) {
        for (Item item : itens) {
            if (item.getId().equals(itemId) && !item.verificarDisponibilidade()) {
                return false; // O item está emprestado, não está disponível
            }
        }
        return true; // O item está disponível para empréstimo
    }
    
    private Map<String, Multa> multasPendentes = new HashMap<>();

    // Método para adicionar uma multa a um membro
    public void adicionarMulta(String membroId, double valor) {
        Multa multa = new Multa(valor);
        multasPendentes.put(membroId, multa);
    }

    // Método para verificar se um membro possui multas pendentes
    private boolean verificarMultasPendentes(String membroId) {
        Multa multa = multasPendentes.get(membroId);
        return multa != null && multa.getValor() > 0;
    }

    
       // Getters e Setters
    public String getId() {
        return id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getMembroId() {
        return membroId;
    }

    public void setMembroId(String membroId) {
        this.membroId = membroId;
        this.dataVencimento = calcularDataVencimento(membroId);
    }

    public Data getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Data getDataVencimento() {
        return dataVencimento;
    }

    public Data getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Data dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
}
 

