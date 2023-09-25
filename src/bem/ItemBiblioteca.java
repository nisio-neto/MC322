package bem;

import java.util.ArrayList;
import java.util.List;

public class ItemBiblioteca<T extends Item> {
    public List<T> itensReservados;
    public List<T> itensEmprestados;
    public int numeroDeItensEmprestados;
    public int numeroDeItensReservados;
    
    public ItemBiblioteca() {
        this.itensReservados = new ArrayList<>();
        this.itensEmprestados = new ArrayList<>();
        this.numeroDeItensEmprestados = 0;
        this.numeroDeItensReservados = 0;
    }

    public List<T> getItensReservados() {
        return itensReservados;
    }

    public void setItensReservados(List<T> itensReservados) {
        this.itensReservados = itensReservados;
    }

    public List<T> getItensEmprestados() {
        return itensEmprestados;
    }

    public void setItensEmprestados(List<T> itensEmprestados) {
        this.itensEmprestados = itensEmprestados;
    }

    public int getNumeroDeItensEmprestados() {
        return numeroDeItensEmprestados;
    }

    public void setNumeroDeItensEmprestados(int numeroDeItensEmprestados) {
        this.numeroDeItensEmprestados = numeroDeItensEmprestados;
    }

    public int getNumeroDeItensReservados() {
        return numeroDeItensReservados;
    }

    public void setNumeroDeItensReservados(int numeroDeItensReservados) {
        this.numeroDeItensReservados = numeroDeItensReservados;
    }
    public void reservarItem(T item) {
        if (item != null) {
            itensReservados.add(item);
            numeroDeItensReservados++;
        }
    }
    public void devolverItem(T item) {
        if (item != null && itensEmprestados.contains(item)) {
            itensEmprestados.remove(item);
            numeroDeItensEmprestados--;
        }
    }
    
    public void emprestarItem(T item) {
                itensEmprestados.add(item);
                numeroDeItensEmprestados++;
                itensReservados.remove(item);
    }
    
    public void cancelarReserva(T item) {
        if (item != null) {
            if (itensReservados.contains(item)) {
                itensReservados.remove(item);
                numeroDeItensReservados--;
            } else {
                System.out.println("Carece reserva a este item.");
            }
        }
    }
    
    public void limpar() {
        itensReservados.clear();
        itensEmprestados.clear();
        numeroDeItensEmprestados = 0;
        numeroDeItensReservados = 0;
    }
    
    public String verificarStatusItem(T item) {
        if (item != null) {
            if (itensReservados.contains(item)) {
                return "O item está reservado.";
            } else if (itensEmprestados.contains(item)) {
                return "O item está emprestado.";
            } else {
                return "O item não está reservado nem emprestado.";
            }
        } else {
            return "Item inválido.";
        }
    }
    
}

