package bem;

public class Outros {

    private String nome;
    private String autor;
    private String editora;
    private String genero;
    private int ano;
    private String edicao;
    private String capa;
    private String sinopse;
    private String id;
    private String local;
    private String conservacao;
    private String tipo;
    private String formato;

    public Outros(String nome, String autor, String editora, String genero, int ano, String edicao, String capa, String sinopse, String local, String conservacao, String tipo, String formato) {
        this.nome = nome;
        this.autor = autor; 
        this.editora = editora;
        this.genero = genero;
        this.ano = ano;
        this.edicao = edicao;
        this.capa = capa;
        this.sinopse = sinopse;
        this.local = local;
        this.conservacao = conservacao;
        this.tipo = tipo;
        this.formato = formato;
        GeradorID gerador = new GeradorID(); // gerar ID do empréstimo
        this.id = gerador.gerarId();
    }

    // Getters e Setters para os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}

