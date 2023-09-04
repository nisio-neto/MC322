package bem;

public class Periodo {
    private Data dataInicio;
    private Data dataFim;

    public Periodo(Data dataInicio, Data dataFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    
    public Data getDataInicio() {
        return dataInicio;
    }

    public Data getDataFim() {
        return dataFim;
    }

    @Override
    public String toString() {
        return dataInicio + " a " + dataFim;
    }
}