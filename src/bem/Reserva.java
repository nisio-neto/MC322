package bem;

import bem.GeradorID;
import RH.membro;
import java.util.List;
import bem.Item;

public class Reserva {
    private membro Membro;
    private String id;
    private Data dataReserva;
    private boolean reservado;
    private boolean disponivelParaEmprestimo; // variável para verificar se a cópia está disponível para empréstimo
    private Item item;
    


    public Reserva(Item item, membro Membro) {
        this.item = item;
        this.Membro = Membro;
        this.dataReserva = new Data();
        this.reservado = false;
        this.disponivelParaEmprestimo = false; //  a cópia não está disponível para empréstimo
        GeradorID gerador = new GeradorID();
        this.id = gerador.gerarId();
    }

    // Método para confirmar a reserva
    public void confirmaReserva() {
        if (!reservado) {
            if (disponivelParaEmprestimo) {
                reservado = true;
                System.out.println("Reserva confirmada para " + Membro.getNome() + " do item " + item.getNome());
                disponivelParaEmprestimo = false; // Marca o item como não disponível para empréstimo após a confirmação
            } else {
                System.out.println("O item não está disponível para reserva.");
            }
        } else {
            System.out.println("Esta reserva já foi confirmada anteriormente.");
        }
    }

    /// Método para reservar o item
    public void reservar() {
        if (!reservado) {
            if (disponivelParaEmprestimo) {
                reservado = true; // Marca o item como reservado quando a reserva é feita
                disponivelParaEmprestimo = false; // Marca o item como não disponível para empréstimo após a reserva
                System.out.println("Reserva realizada para " + Membro.getNome() + " do item " + item.getNome());
            } else {
                System.out.println("Este item já foi reservado anteriormente.");
            }
        } else {
            System.out.println("Esta reserva já foi confirmada anteriormente.");
        }
    }
    
 // Método estático para calcular o número de reservas de um item específico
    public static int calcularReservas(List<Reserva> reservas, String itemId) {
        int contador = 0;

        for (Reserva reserva : reservas) {
            if (reserva.getItem().getId().equals(itemId)) {
                contador++;
            }
        }

        return contador;
    }
    public String getId() {
        return id;
    }

    public Item getItem() {
        return item;
    }

    public membro getMembro() {
        return Membro;
    }

    public Data getDataReserva() {
        return dataReserva;
    }

    public boolean foiReservado() {
        return reservado;
    }
}

