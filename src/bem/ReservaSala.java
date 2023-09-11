package bem;

public class ReservaSala {
    private Data dataReserva;
    private String horaInicio;
    private String horaFim;
    private StatusReserva status;
    private int numSala;
    private String tipoSala;

    // Construtor da Classe
    public ReservaSala(Data dataReserva, String horaInicio, String horaFim, StatusReserva status, int numSala, String tipoSala) {
        this.dataReserva = dataReserva;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.status = status;
        this.numSala = numSala;
        this.tipoSala = tipoSala;
    }

    // Getter para o atributo "dataReserva"
    public Data getDataReserva() {
        return dataReserva;
    }

    // Setter para o atributo "dataReserva"
    public void setDataReserva(Data dataReserva) {
        this.dataReserva = dataReserva;
    }

    // Getter para o atributo "horaInicio"
    public String getHoraInicio() {
        return horaInicio;
    }

    // Setter para o atributo "horaInicio"
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    // Getter para o atributo "horaFim"
    public String getHoraFim() {
        return horaFim;
    }

    // Setter para o atributo "horaFim"
    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    // Getter para o atributo "status"
    public StatusReserva getStatus() {
        return status;
    }

    // Setter para o atributo "status"
    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    // Getter para o atributo "numSala"
    public int getNumSala() {
        return numSala;
    }

    // Setter para o atributo "numSala"
    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    // Getter para o atributo "tipoSala"
    public String getTipoSala() {
        return tipoSala;
    }

    // Setter para o atributo "tipoSala"
    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }




public enum StatusReserva {
    PENDENTE,
    CONFIRMADA,
    CANCELADA
}






}