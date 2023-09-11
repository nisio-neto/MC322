package bem;

public class SalaSilenciosa {
    private int capacidade;
    private int numero;
    private boolean cabines;

    // Construtor
    public SalaSilenciosa(int capacidade, int numero, boolean cabines) {
        this.capacidade = capacidade;
        this.numero = numero;
        this.cabines = cabines;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean hasCabines() {
        return cabines;
    }

    public void setCabines(boolean cabines) {
        this.cabines = cabines;
    }
}

