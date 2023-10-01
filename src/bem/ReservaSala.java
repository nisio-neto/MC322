package bem;

import java.util.List;
import RH.membro;
import java.util.ArrayList;
import bem.Reserva;


public class ReservaSala {
    private Data dataReserva;
    private String horaInicio;
    private String horaFim;
    private StatusReserva status;
    private int numSala;
    private String tipoSala;
    private int capacidadeMaxima;
    private List<ReservaSala> reservas; // Lista de reservas existentes

    // Construtor da Classe
    public ReservaSala(Data dataReserva, String horaInicio, String horaFim, StatusReserva status, int numSala, String tipoSala, int capacidadeMaxima) {
        this.dataReserva = dataReserva;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.status = status;
        this.numSala = numSala;
        this.tipoSala = tipoSala;
        this.capacidadeMaxima = capacidadeMaxima;
        this.reservas = new ArrayList<>();
    }
    
    public class SalaJaReservadaException extends Exception {
        public SalaJaReservadaException(String mensagem) {
            super(mensagem);
        }
    }

    public class CapacidadeExcedidaException extends Exception {
        public CapacidadeExcedidaException(String mensagem) {
            super(mensagem);
        }
    }

 // Método para reservar uma sala
    public void reservarSala(String membroId, Data dataReserva, String horaInicio, String horaFim, int numPessoas)
            throws SalaJaReservadaException, CapacidadeExcedidaException {
        // Verificar se a sala já está reservada no horário solicitado
        if (salaJaReservadaNoHorario(dataReserva, horaInicio, horaFim)) {
            throw new SalaJaReservadaException("Sala já está reservada no horário solicitado.");
        }

        // Verificar se a capacidade máxima de pessoas para a sala é excedida
        if (numPessoas > capacidadeMaxima) {
            throw new CapacidadeExcedidaException("Capacidade máxima da sala foi excedida.");
        }

        // Criar uma nova reserva de sala e adicionar à lista de reservas
        ReservaSala novaReservaSala = new ReservaSala(dataReserva, horaInicio, horaFim, StatusReserva.PENDENTE, numSala, tipoSala, capacidadeMaxima);
        reservas.add(novaReservaSala);

        // Lógica para confirmar a reserva...
        System.out.println("Reserva efetuada com sucesso.");
    }

    // Método para verificar se a sala já está reservada no horário solicitado
    private boolean salaJaReservadaNoHorario(Data dataReserva, String horaInicio, String horaFim) {
        for (ReservaSala reserva : reservas) {
            if (reserva.getDataReserva().equals(dataReserva) && 
                horasConflitantes(reserva.getHoraInicio(), reserva.getHoraFim(), horaInicio, horaFim)) {
                return true; // Sala já está reservada no horário solicitado
            }
        }
        return false; // Sala está disponível no horário solicitado
    }

    // Método para verificar se duas horas estão conflitantes
    private boolean horasConflitantes(String horaInicio1, String horaFim1, String horaInicio2, String horaFim2) {
        // Converte as strings de horário para inteiros para facilitar a comparação
        int inicio1 = Integer.parseInt(horaInicio1.replace(":", ""));
        int fim1 = Integer.parseInt(horaFim1.replace(":", ""));
        int inicio2 = Integer.parseInt(horaInicio2.replace(":", ""));
        int fim2 = Integer.parseInt(horaFim2.replace(":", ""));

        // Verifica se há sobreposição
        return (inicio1 <= fim2 && fim1 >= inicio2);
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