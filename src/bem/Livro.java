package bem;

public class Livro extends Item {

    private String edicao;
    private String ISBN;
    private String local;
    private String conservacao;

    public Livro(String nome, String autor, String editora, String genero, int ano, String edicao, String capa, String sinopse, String ISBN, String local, String conservacao) {
        super(nome, autor, editora, genero, ano, capa, sinopse, ISBN);
        this.edicao = edicao;
        this.ISBN = ISBN;
        this.local = local;
        this.conservacao = conservacao;
    }

    // Getters e Setters para os atributos específicos de Livro
    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }
}

