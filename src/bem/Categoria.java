package bem;

public class Categoria {
    private String categoria;
    private String local;

    // Construtor
    public Categoria(String categoria, String local) {
        this.categoria = categoria;
        this.local = local;
    }

    // Getter para o atributo "categoria"
    public String getCategoria() {
        return categoria;
    }

    // Setter para o atributo "categoria"
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Getter para o atributo "local"
    public String getLocal() {
        return local;
    }

    // Setter para o atributo "local"
    public void setLocal(String local) {
        this.local = local;
    }
}
