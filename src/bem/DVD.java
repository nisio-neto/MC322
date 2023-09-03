package bem;

public class DVD {

    private String nome;
    private String diretor;
    private String estudio;
    private String genero;
    private int ano;
    private String edicao;
    private String capa;
    private String sinopse;
    private String id;
    private String elenco;
    private String duracao;
    private String idioma;
    private String conservacao;

    public DVD(String nome, String diretor, String estudio, String genero, int ano, String edicao, String capa, String sinopse, String elenco, String duracao, String idioma, String conservacao) {
        this.nome = nome;
        this.diretor = diretor;
        this.estudio = estudio;
        this.genero = genero;
        this.ano = ano;
        this.edicao = edicao;
        this.capa = capa;
        this.sinopse = sinopse;
        this.elenco = elenco;
        this.duracao = duracao;
        this.idioma = idioma;
        this.conservacao = conservacao;
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

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
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

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }
}
