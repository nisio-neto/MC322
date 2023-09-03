package bem;

public class CD {
    private String nome;
    private String artista;
    private String gravadora;
    private String genero;
    private int ano;
    private String sinopse;
    private String capa;
    private String id;
    private String faixas;
    private String duracao;
    private String conservacao;

    public CD(String nome, String artista, String gravadora, String genero, int ano, String sinopse, String capa, String faixas, String duracao, String conservacao) {
        this.nome = nome;
        this.artista = artista;
        this.gravadora = gravadora;
        this.genero = genero;
        this.ano = ano;
        this.sinopse = sinopse;
        this.capa = capa;
        this.faixas = faixas;
        this.duracao = duracao;
        this.conservacao = conservacao;
        GeradorID gerador = new GeradorID(); // gerar ID do emprestimo
        this.id = gerador.gerarId();
    }

    // Getters e Setters para os atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getFaixas() {
        return faixas;
    }

    public void setFaixas(String faixas) {
        this.faixas = faixas;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }
}

