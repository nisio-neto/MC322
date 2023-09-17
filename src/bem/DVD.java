package bem;

public class DVD extends Item {

    private String edicao;
    private String elenco;
    private String duracao;
    private String idioma;
    private String conservacao;

    public DVD(String nome, String diretor, String estudio, String genero, int ano, String edicao, String capa, String sinopse, String elenco, String duracao, String idioma, String conservacao, String id) {
        super(nome, diretor, estudio, genero, ano, capa, sinopse);
        this.edicao = edicao;
        this.elenco = elenco;
        this.duracao = duracao;
        this.idioma = idioma;
        this.conservacao = conservacao;
        this.setId(id);
    }

    // Getters e Setters para os atributos específicos de DVD
    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
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

