package bem;

public class CD extends Item {

    private String faixas;
    private String duracao;
    private String conservacao;

    public CD(String nome, String artista, String gravadora, String genero, int ano, String sinopse, String capa, String faixas, String duracao, String conservacao) {
        super(nome, artista, gravadora, genero, ano, capa, sinopse);
        this.faixas = faixas;
        this.duracao = duracao;
        this.conservacao = conservacao;
    }

    // Getters e Setters para os atributos específicos de CD
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

