package bem;

import java.util.ArrayList;
import java.util.List;

public class ListaReservas<T> {
    private List<T> reservas;

    public ListaReservas() {
        this.reservas = new ArrayList<>();
    }

    // Método para adicionar uma reserva à lista
    public void adicionarReserva(T reserva) {
        reservas.add(reserva);
    }

    // Método para remover uma reserva da lista
    public void removerReserva(T reserva) {
        reservas.remove(reserva);
    }

    // Método para obter todas as reservas da lista
    public List<T> obterTodasReservas() {
        return reservas;
    }

    // Método para calcular o número de reservas para um recurso específico
    public int calcularNumeroReservasRecursoEspecifico(String nomeRecurso) {
        int contador = 0;
        for (T reserva : reservas) {
            if (reserva instanceof ReservaEquipamento) {
                ReservaEquipamento reservaEquipamento = (ReservaEquipamento) reserva;
                if (reservaEquipamento.getNomeEquipamento().equals(nomeRecurso)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        // Exemplo de uso da ListaReservas com reservas de equipamentos
        ListaReservas<ReservaEquipamento> reservasEquipamentos = new ListaReservas<>();

        // Criando algumas reservas de equipamentos
        ReservaEquipamento equipamento1 = new ReservaEquipamento("Laptop", "2023-08-15", "09:00", "11:00");
        ReservaEquipamento equipamento2 = new ReservaEquipamento("Projetor", "2023-08-16", "14:00", "16:00");
        ReservaEquipamento equipamento3 = new ReservaEquipamento("Microfone", "2023-08-17", "10:00", "12:00");

        // Adicionando as reservas à lista
        reservasEquipamentos.adicionarReserva(equipamento1);
        reservasEquipamentos.adicionarReserva(equipamento2);
        reservasEquipamentos.adicionarReserva(equipamento3);

        // Listando todas as reservas de equipamentos
        List<ReservaEquipamento> todasReservasEquipamentos = reservasEquipamentos.obterTodasReservas();
        System.out.println("Todas as Reservas de Equipamentos:");
        for (ReservaEquipamento reserva : todasReservasEquipamentos) {
            System.out.println("Equipamento: " + reserva.getNomeEquipamento() +
                    ", Data: " + reserva.getDataReserva() +
                    ", Hora Início: " + reserva.getHoraInicio() +
                    ", Hora Fim: " + reserva.getHoraFim());
        }

        // Calculando o número de reservas para um equipamento específico
        String nomeEquipamento = "Laptop";
        int numReservasLaptop = reservasEquipamentos.calcularNumeroReservasRecursoEspecifico(nomeEquipamento);
        System.out.println("\nNúmero de Reservas para " + nomeEquipamento + ": " + numReservasLaptop);
    }
}

class ReservaEquipamento {
    private String nomeEquipamento;
    private String dataReserva;
    private String horaInicio;
    private String horaFim;

    public ReservaEquipamento(String nomeEquipamento, String dataReserva, String horaInicio, String horaFim) {
        this.nomeEquipamento = nomeEquipamento;
        this.dataReserva = dataReserva;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }
}
