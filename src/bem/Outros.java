package bem;

public class Outros extends Item {

    private String tipo;
    private String formato;

    public Outros(String nome, String autor, String editora, String genero, int ano, String edicao, String capa, String sinopse, String local, String conservacao, String tipo, String formato, String id) {
        super(nome, autor, editora, genero, ano, capa, sinopse, id);
        this.tipo = tipo;
        this.formato = formato;
    }

    // Getters e Setters para os atributos específicos de Outros
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
