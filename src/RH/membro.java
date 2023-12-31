package RH;

import bem.GeradorID;
import main.Subject;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import bem.Emprestimo;
import bem.Reserva;
import bem.Data;
import bem.Relatorio;
import bem.Periodo;


public class membro {
	
	public String id; // Identificação interna do membro
	private String nome; // Nome do membro
	private String telefone; // Telefone do membro
	private String CPF; // CPF do membro
	private String endereço; // endereço da residencia do membro
	private String dataInscricao;
	private Perfil perfil;
	private List<Emprestimo> emprestimos; // Lista de empréstimos feitos pelo membro
	private List<Reserva> reservas; // Lista de reservas feitas pelo membro
	private double totalPagamentos;
	private Subject bibliotecaSubject;
	
	
	public membro(String nome, String telefone, String CPF, String endereço, String dataInscricao, Perfil perfil) {
		try {
	        if (nome == null || nome.isEmpty() || telefone == null || telefone.isEmpty() || CPF == null || CPF.isEmpty() || endereço == null || endereço.isEmpty() || dataInscricao == null || dataInscricao.isEmpty()) {
	            throw new ExcecaoLoginInvalido("Dados do membro são inválidos.");
	        }

	        this.nome = nome;
	        this.telefone = telefone;
	        this.endereço = endereço;
	        this.CPF = CPF;
	        this.dataInscricao = dataInscricao;
	        GeradorID gerador = new GeradorID(); // gerar ID do emprestimo
	        this.id = gerador.gerarId();
	        this.perfil = perfil; // Definindo o perfil durante a criação do membro
	        this.emprestimos = new ArrayList<>();
	        this.reservas = new ArrayList<>();
	        this.totalPagamentos = 0.0; // Inicializa o total de pagamentos como zero
	        emprestimos = new ArrayList<>(); // Inicialize a lista de empréstimos
	        this.bibliotecaSubject = new Subject();
	    } catch (ExcecaoLoginInvalido e) {
	        System.err.println("Erro ao criar membro: " + e.getMessage());
	    }
	}
	// Método para adicionar um novo empréstimo à lista de histórico
	public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        bibliotecaSubject.setMensagemNotificacao("Novo item multimídia disponível para empréstimo!");
    }

	public int getEmprestimosNoPeriodo(Periodo periodo) {
	    int contadorEmprestimos = 0;

	    for (Emprestimo emprestimo : emprestimos) {
	        Data dataEmprestimo = emprestimo.getDataEmprestimo();
	        Data dataInicio = periodo.getDataInicio();
	        Data dataFim = periodo.getDataFim();

	        if (dataEmprestimo.after(dataInicio) && dataEmprestimo.before(dataFim)) {
	            contadorEmprestimos++;
	        }
	    }

	    return contadorEmprestimos;
	}
	
	public int getDevolucoesNoPeriodo(Periodo periodo) {
	    int contadorDevolucoes = 0;

	    for (Emprestimo emprestimo : emprestimos) {
	        Data dataDevolucao = emprestimo.getDataDevolucao();

	        if (dataDevolucao != null) { // Certifique-se de que a data de devolução não seja nula
	            Data dataInicio = periodo.getDataInicio();
	            Data dataFim = periodo.getDataFim();

	            if (dataDevolucao.after(dataInicio) && dataDevolucao.before(dataFim)) {
	                contadorDevolucoes++;
	            }
	        }
	    }

	    return contadorDevolucoes;
	}
	
	public double getMultasNoPeriodo(Periodo periodo) {
	    double totalMultas = 0.0;

	    for (Emprestimo emprestimo : emprestimos) {
	        Data dataEmprestimo = emprestimo.getDataEmprestimo();
	        Data dataDevolucao = emprestimo.getDataDevolucao();

	        if (dataEmprestimo != null && dataDevolucao != null) {
	            Data dataInicio = periodo.getDataInicio();
	            Data dataFim = periodo.getDataFim();

	            // Verifica se a data de devolução está dentro do período e se há multa
	            if (dataDevolucao.after(dataInicio) && dataDevolucao.before(dataFim)) {
	                double multa = emprestimo.calcularMulta(); // método para obter o valor da multa
	                totalMultas += multa;
	            }
	        }
	    }

	    return totalMultas;
	}
	
	public void efetuarPagamento(double valor) {
        totalPagamentos += valor;
    }

    public double getTotalPagamentos() {
        return totalPagamentos;
    }
    
	// Enumeração para representar os perfis de membro
	public enum Perfil {
	    ESTUDANTE_GRADUACAO,
	    ESTUDANTE_POS,
	    PROFESSOR,
	    FUNCIONARIO
	}
	
	public int getTotalEmprestimos() {
        int totalEmprestimos = 0;

        for (Emprestimo emprestimo : emprestimos) {
            totalEmprestimos++;
        }

        return totalEmprestimos;
    }

    public double calcularTotalMultas() {
        double totalMultas = 0.0;

        for (Emprestimo emprestimo : emprestimos) {
            totalMultas += emprestimo.calcularMulta();
        }

        return totalMultas;
    }
	
	public static void main(String[] args) {
	}
	
	public String getID() {
		return id;
	}
	public void setId(String id) {
        this.id = id;
    }
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getCPF() {
		return CPF;
	}
	public void setendereço(String endereço) {
		this.endereço = endereço;
	}
	public String getendereço() {
		return endereço;
	}
	public void setDataInscricao(String dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	public String getDataInscricao() {
		return dataInscricao;
	}
	public Perfil getPerfil() {
        return perfil; // Método para acessar o perfil do membro
    }
	public class ExcecaoLoginInvalido extends Exception {
        public ExcecaoLoginInvalido(String mensagem) {
            super(mensagem);
        }
    }
}
