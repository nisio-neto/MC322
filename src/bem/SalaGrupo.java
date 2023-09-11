package bem;
public class SalaGrupo {
    private int capacidade;
    private int numero;
    private boolean computador;
    private String equipamento;

    // Construtor
    public SalaGrupo(int capacidade, int numero, boolean computador, String equipamento) {
        this.capacidade = capacidade;
        this.numero = numero;
        this.computador = computador;
        this.equipamento = equipamento;
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

    public boolean isComputador() {
        return computador;
    }

    public void setComputador(boolean computador) {
        this.computador = computador;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
}
