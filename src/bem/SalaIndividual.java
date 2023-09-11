package bem;


public class SalaIndividual {
    private boolean computador;
    private int numero;

    // Construtor
    public SalaIndividual(boolean computador, int numero) {
        this.computador = computador;
        this.numero = numero;
    }

    public boolean getComputador() {
        return computador;
    }

    public void setComputador(boolean computador) {
        this.computador = computador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
