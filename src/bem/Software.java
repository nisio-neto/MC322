package bem;

public class Software extends Item {

    private String versao;
    private String licenca;
    private String dataValidade;

    public Software(String nome, String autor, String editora, String genero, int ano, String capa, String sinopse, String versao, String licenca, String dataValidade) {
        super(nome, autor, editora, genero, ano, capa, sinopse);
        this.versao = versao;
        this.licenca = licenca;
        this.dataValidade = dataValidade;
    }

    // Getters e Setters para os atributos específicos de Software
    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getLicenca() {
        return licenca;
    }

    public void setLicenca(String licenca) {
        this.licenca = licenca;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
