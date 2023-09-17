package RH;

public class Comentario {

	private String membroId;
    private String itemId;
    private String texto;

    public Comentario(String membroId, String itemId, String texto) {
        this.membroId = membroId;
        this.itemId = itemId;
        this.texto = texto;
    }

    public String getMembroId() {
        return membroId;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTexto() {
        return texto;
    }
}

