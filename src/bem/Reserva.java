package bem;

import bem.GeradorID;
import RH.membro;
import java.util.List;

public class Reserva {
    private String livro;
    private membro Membro;
    private String id;
    private Data dataReserva;
    private boolean reservado;
    private boolean disponivelParaEmprestimo; // variável para verificar se a cópia está disponível para empréstimo

    public Reserva(String livro, membro Membro) {
        this.livro = livro;
        this.Membro = Membro;
        this.dataReserva = new Data();
        this.reservado = false;
        this.disponivelParaEmprestimo = false; //  a cópia não está disponível para empréstimo
        GeradorID gerador = new GeradorID();
        this.id = gerador.gerarId();
        System.out.println(id);
    }

    // Método para confirmar a reserva
    public void confirmaReserva() {
        if (!reservado) {
            if (disponivelParaEmprestimo) {
                reservado = true;
                System.out.println("Reserva confirmada para " + Membro.getNome() + " do livro " + livro);
                disponivelParaEmprestimo = false; // Marca a cópia como não disponível para empréstimo após a confirmação
            } else {
                System.out.println("A cópia não está disponível para reserva.");
            }
        } else {
            System.out.println("Esta reserva já foi confirmada anteriormente.");
        }
    }

    // Método para reservar o livro
    public void reservar() {
        if (!reservado) {
            if (!disponivelParaEmprestimo) {
                disponivelParaEmprestimo = true; // Marca a cópia como disponível para empréstimo quando a reserva é feita
                System.out.println("Reserva realizada para " + Membro.getNome() + " do livro " + livro);
            } else {
                System.out.println("Esta cópia já foi reservada anteriormente.");
            }
        } else {
            System.out.println("Esta reserva já foi confirmada anteriormente.");
        }
    }

 // Método estático para calcular o número de reservas de um item específico
    public static int calcularReservas(List<Reserva> reservas, String itemId) {
        int contador = 0;

        for (Reserva reserva : reservas) {
            if (reserva.getItemId().equals(itemId)) {
                contador++;
            }
        }

        return contador;
    }
    
    public String getId() {
        return id;
    }

    public String getLivro() {
        return livro;
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

