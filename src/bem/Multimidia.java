package bem;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
// Note que a classe multimidia congrega todos os tipos de midia
// ela existia previamente a instrução do lab05. Desse modo, permaneceu
// existindo, mas congregando adicionalmente softwares
// para cumprir os requisitos do lab05.

import bem.Emprestimo.ExcecaoLimiteEmprestimoExcedido;

public class Multimidia {

	private List<DVD> dvds;
    private List<Livro> livros;
    private List<Ebook> ebooks;
    private List<CD> cds;
    private List<Outros> outros;
    private List<Software> softwares;
    private int[] numItem;
    private boolean[][] disponivel;
    private int[][] unidades;
    private int[][] total;
    private int maxItens;
    private int[][] contadorEmprestimos;
    private int[][] contadorReservas;
    private int indice;
    private TipoMultimidia tipo;
    

    public Multimidia(int max_itens, int numTipos) {
    	dvds = new ArrayList<>();
        livros = new ArrayList<>();
        ebooks = new ArrayList<>();
        cds = new ArrayList<>();
        outros = new ArrayList<>();
        softwares = new ArrayList<>();
        disponivel = new boolean[6][max_itens];  // 5 tipos de mídia (DVD, Livro, Ebook, CD, Outros)
        unidades = new int[6][max_itens];
        numItem = new int[6];
        total = new int[6][max_itens];
        this.maxItens = max_itens;
        contadorEmprestimos = new int[numTipos][maxItens];
        contadorReservas = new int[6][max_itens];
        
    }

 // Método genérico para adicionar um item a uma lista
    private <T extends Item> void adicionarItem(List<T> itens, T item, int tipo, int unidade) throws ExcecaoIdExistente {
        if (verificarIdExistente(itens, item.getId())) {
            throw new ExcecaoIdExistente("ID já existe para outro item do tipo " + getNomeTipo(tipo) + ".");
        }
        
        itens.add(item);
        unidades[tipo][numItem[tipo]] = unidade;
        disponivel[tipo][numItem[tipo]] = true;
        total[tipo][numItem[tipo]] = numItem[tipo] + 1;
        numItem[tipo]++;
    }

    // Métodos específicos para adicionar cada tipo de mídia
    public void adicionaDVD(String nome, String diretor, String estudio, String genero, int ano, String edicao, String capa, String sinopse, String elenco, String duracao, String idioma, String conservacao, int unidade, String id) throws ExcecaoIdExistente {
    	try {
            if (ConfereAnoAtual(ano)) {
                throw new ExcecaoDadosInvalidos("Ano do DVD inválido.");
            }
            DVD dvd = new DVD(nome, diretor, estudio, genero, ano, edicao, capa, sinopse, elenco, duracao, idioma, conservacao, id);
            adicionarItem(dvds, dvd, 0, unidade);
        } catch (ExcecaoDadosInvalidos e) {
            System.err.println("Erro ao adicionar DVD: " + e.getMessage());
        }
    }

    public void adicionaCD(String nome, String artista, String gravadora, String genero, int ano, String sinopse, String capa, String faixas, String duracao, String conservacao, int unidade, String id) throws ExcecaoIdExistente {
        try {
            if (ConfereAnoAtual(ano)) {
                throw new ExcecaoDadosInvalidos("Ano do CD inválido.");
            }
            CD cd = new CD(nome, artista, gravadora, genero, ano, sinopse, capa, faixas, duracao, conservacao, id);
            adicionarItem(cds, cd, 3, unidade);
        } catch (ExcecaoDadosInvalidos e) {
            System.err.println("Erro ao adicionar CD: " + e.getMessage());
        }
    }

    public void adicionaEbook(String nome, String autor, String editora, String genero, int ano, String edicao, String capa, String sinopse, String formato, String formatoArquivo, String url, String requisitos, String dataDisponibilidade, int unidade) throws ExcecaoIdExistente {
        try {
            if (ConfereAnoAtual(ano)) {
                throw new ExcecaoDadosInvalidos("Ano do Ebook inválido.");
            }
            Ebook ebook = new Ebook(nome, autor, editora, genero, ano, edicao, capa, sinopse, formato, formatoArquivo, url, requisitos, dataDisponibilidade);
            adicionarItem(ebooks, ebook, 2, unidade);
        } catch (ExcecaoDadosInvalidos e) {
            System.err.println("Erro ao adicionar Ebook: " + e.getMessage());
        }
    }

    public void adicionaLivro(String nome, String autor, String editora, String genero, int ano, String edicao, String capa, String sinopse, String isbn, String local, String conservacao, int unidade) throws ExcecaoIdExistente {
        try {
            if (ConfereAnoAtual(ano)) {
                throw new ExcecaoDadosInvalidos("Ano do Livro inválido.");
            }
            Livro livro = new Livro(nome, autor, editora, genero, ano, edicao, capa, sinopse, isbn, local, conservacao);
            adicionarItem(livros, livro, 1, unidade);
        } catch (ExcecaoDadosInvalidos e) {
            System.err.println("Erro ao adicionar Livro: " + e.getMessage());
        }
    }

    public void adicionaOutros(String nome, String autor, String editora, String genero, int ano, String edicao, String capa, String sinopse, String local, String conservacao, String tipo, String formato, int unidade, String id) throws ExcecaoIdExistente {
        try {
            if (ConfereAnoAtual(ano)) {
                throw new ExcecaoDadosInvalidos("Ano da mídia inválido.");
            }
            Outros outro = new Outros(nome, autor, editora, genero, ano, edicao, capa, sinopse, local, conservacao, tipo, formato, id);
            adicionarItem(outros, outro, 4, unidade);
        } catch (ExcecaoDadosInvalidos e) {
            System.err.println("Erro ao adicionar Outros: " + e.getMessage());
        }
    }

    public void adicionaSoftware(String nome, String autor, String editora, String genero, int ano, String capa, String sinopse, String versao, String licenca, String dataValidade, int unidade, String id) throws ExcecaoIdExistente {
        try {
            if (ConfereAnoAtual(ano)) {
                throw new ExcecaoDadosInvalidos("Ano do Software inválido.");
            }
            Software software = new Software(nome, autor, editora, genero, ano, capa, sinopse, versao, licenca, dataValidade, id);
            adicionarItem(softwares, software, 5, unidade);
        } catch (ExcecaoDadosInvalidos e) {
            System.err.println("Erro ao adicionar Software: " + e.getMessage());
        }
    }



    public void removeSoftware(int indice) {
        if (indice >= 0 && indice < softwares.size()) {
            softwares.remove(indice);
            disponivel[5][indice] = false;
            unidades[5][indice] = 0;
            numItem[5]--;
        }
    }



    // Métodos para remover itens
    public void removeDVD(int indice) {
        if (indice >= 0 && indice < dvds.size()) {
            dvds.remove(indice);
            disponivel[0][indice] = false;
            unidades[0][indice] = 0;
            numItem[0]--;
        }
    }

    public void removeLivro(int indice) {
        if (indice >= 0 && indice < livros.size()) {
            livros.remove(indice);
            disponivel[1][indice] = false;
            unidades[1][indice] = 0;
            numItem[1]--;
        }
    }

    public void removeEbook(int indice) {
        if (indice >= 0 && indice < ebooks.size()) {
            ebooks.remove(indice);
            disponivel[2][indice] = false;
            unidades[2][indice] = 0;
            numItem[2]--;
        }
    }

    public void removeCD(int indice) {
        if (indice >= 0 && indice < cds.size()) {
            cds.remove(indice);
            disponivel[3][indice] = false;
            unidades[3][indice] = 0;
            numItem[3]--;
        }
    }

    public void removeOutros(int indice) {
        if (indice >= 0 && indice < outros.size()) {
            outros.remove(indice);
            disponivel[4][indice] = false;
            unidades[4][indice] = 0;
            numItem[4]--;
        }
    }
    
    private <T extends Item> boolean verificarIdExistente(List<T> itens, String id) {
        for (T item : itens) {
            if (item.getId().equals(id)) {
                return true;
            }
        }
        return false; 
    }
    
    public Object get(String id) {
        for (DVD dvd : dvds) {
            if (dvd.getId().equals(id)) {
                return dvd;
            }
        }

        for (Livro livro : livros) {
            if (livro.getId().equals(id)) {
                return livro;
            }
        }

        for (Ebook ebook : ebooks) {
            if (ebook.getId().equals(id)) {
                return ebook;
            }
        }

        for (CD cd : cds) {
            if (cd.getId().equals(id)) {
                return cd;
            }
        }

        for (Outros outro : outros) {
            if (outro.getId().equals(id)) {
                return outro;
            }
        }

        for (Software software : softwares) {
            if (software.getId().equals(id)) {
                return software;
            }
        }

        return null; 
    }
    

    public enum TipoMultimidia {
        DVD,
        Livro,
        Ebook,
        CD,
        Outros
    }
    
 // Método para obter o número atual de itens multimídia de um tipo específico
    public int getNumItens(int tipo) {
        if (tipo >= 0 && tipo < numItem.length) {
            return numItem[tipo];
        }
        return 0; // Retorna 0 se o tipo for inválido
    }


    // Método para obter o nome do tipo de um item multimídia
    public String getNomeTipo(int tipo) {
        if (tipo >= 0 && tipo < numItem.length) {
            switch (tipo) {
                case 0:
                    return "DVD";
                case 1:
                    return "Livro";
                case 2:
                    return "Ebook";
                case 3:
                    return "CD";
                case 4:
                    return "Outros";
                case 5:
                    return "Software";
                default:
                    return "Desconhecido";
            }
        }
        return "Desconhecido"; // Retorna "Desconhecido" se o tipo for inválido
    }

    // Método para obter o ID de um item multimídia com base no tipo e no índice
    public String getId(int tipo, int indice) {
        if (tipo >= 0 && tipo < numItem.length && indice >= 0 && indice < maxItens) {
            if (tipo == 0 && indice < dvds.size()) {
                return dvds.get(indice).getId();
            } else if (tipo == 1 && indice < livros.size()) {
                return livros.get(indice).getId();
            } else if (tipo == 2 && indice < ebooks.size()) {
                return ebooks.get(indice).getId();
            } else if (tipo == 3 && indice < cds.size()) {
                return cds.get(indice).getId();
            } else if (tipo == 4 && indice < outros.size()) {
                return outros.get(indice).getId();
            }
        }
        return null; // Retorna null se o tipo ou o índice forem inválidos
    }

    // Método para obter o título de um item multimídia com base no tipo e no índice
    public String getTitulo(int tipo, int indice) {
        if (tipo >= 0 && tipo < numItem.length && indice >= 0 && indice < maxItens) {
            if (tipo == 0 && indice < dvds.size()) {
                return dvds.get(indice).getNome();
            } else if (tipo == 1 && indice < livros.size()) {
                return livros.get(indice).getNome();
            } else if (tipo == 2 && indice < ebooks.size()) {
                return ebooks.get(indice).getNome();
            } else if (tipo == 3 && indice < cds.size()) {
                return cds.get(indice).getNome();
            } else if (tipo == 4 && indice < outros.size()) {
                return outros.get(indice).getNome();
            }
        }
        return null; // Retorna null se o tipo ou o índice forem inválidos
    }

  
    public int getNumeroTotalItens() {
        int total = 0;
        for (int tipo = 0; tipo < numItem.length; tipo++) {
            total += getNumItens(tipo);
        }
        return total;
    }
    
    //quantidade disponível de cada tipo de item multimídia
    public int getQuantidadeDisponivel(int tipo) {
        if (tipo >= 0 && tipo < numItem.length) {
            int totalItens = numItem[tipo];
            int[] emprestimosPorTipo = contadorEmprestimos[tipo];
            int emprestados = 0;
            for (int emprestimos : emprestimosPorTipo) {
                emprestados += emprestimos;
            }
            
            return totalItens - emprestados;
        }
        return 0; // Retorna 0 se o tipo for inválido
    }

 // Método para obter a quantidade de tipos de mídia
    public int getQuantidadeTipos() {
        return numItem.length;
    }
    
   
        public int getTotalEmprestimos() {
            int totalEmprestimos = 0;

            for (int tipo = 0; tipo < numItem.length; tipo++) {
                for (int indice = 0; indice < numItem[tipo]; indice++) {
                    totalEmprestimos += contadorEmprestimos[tipo][indice];
                }
            }

            return totalEmprestimos;
        }

        public int getReservas() {
            int totalReservas = 0;

            for (int tipo = 0; tipo < numItem.length; tipo++) {
                for (int indice = 0; indice < numItem[tipo]; indice++) {
                    totalReservas += contadorReservas[tipo][indice];
                }
            }

            return totalReservas;
        }

    // Outros getters e setters

    public List<DVD> getDVDs() {
        return dvds;
    }
    
    public List<Software> getSoftwares() {
        return softwares;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Ebook> getEbooks() {
    	return ebooks;
    }

    public List<CD> getCDs() {
    	return cds;
    }

    public List<Outros> getOutros() {
    	return outros;
    }


    public boolean[][] getDisponibilidade() {
        return disponivel;
    }

    public void setDisponibilidade(boolean[][] disponivel) {
        this.disponivel = disponivel;
    }

    public int[][] getUnidades() {
        return unidades;
    }

    public void setUnidades(int[][] unidades) {
        this.unidades = unidades;
    }
    
    public TipoMultimidia getTipo() {
        return tipo;
    }

    public void setTipo(TipoMultimidia tipo) {
        this.tipo = tipo;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    public class ExcecaoIdExistente extends Exception {
        public ExcecaoIdExistente(String mensagem) {
            super(mensagem);
        }
    }
    public class ExcecaoDadosInvalidos extends Exception {
        public ExcecaoDadosInvalidos(String mensagem) {
            super(mensagem);
        }
    }
    
    public boolean ConfereAnoAtual(int ano) {
    	int anoAtual = LocalDate.now().getYear();
    	if(anoAtual< ano) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }
}
