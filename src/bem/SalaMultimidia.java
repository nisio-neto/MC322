package bem;

public class SalaMultimidia {
    private int numero;
    private String equipamentos;
    private int capacidade;

    // Construtor
    public SalaMultimidia(int numero, String equipamentos, int capacidade) {
        this.numero = numero;
        this.equipamentos = equipamentos;
        this.capacidade = capacidade;
    }

    // Getters e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(String equipamentos) {
        this.equipamentos = equipamentos;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}

