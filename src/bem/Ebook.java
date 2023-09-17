package bem;

public class Ebook extends Item {

    private String edicao;
    private String formato;
    private String formatoArquivo;
    private String url;
    private String requisitos;
    private String dataDisponibilidade;

    public Ebook(String nome, String autor, String editora, String genero, int ano, String edicao, String capa, String sinopse, String formato, String formatoArquivo, String url, String requisitos, String dataDisponibilidade) {
        super(nome, autor, editora, genero, ano, capa, sinopse);
        this.edicao = edicao;
        this.formato = formato;
        this.formatoArquivo = formatoArquivo;
        this.url = url;
        this.requisitos = requisitos;
        this.dataDisponibilidade = dataDisponibilidade;
        this.setId(url);
    }

    // Getters e Setters para os atributos específicos de Ebook
    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getDataDisponibilidade() {
        return dataDisponibilidade;
    }

    public void setDataDisponibilidade(String dataDisponibilidade) {
        this.dataDisponibilidade = dataDisponibilidade;
    }
}
