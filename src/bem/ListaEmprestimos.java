package bem;

import java.util.ArrayList;
import java.util.List;

public class ListaEmprestimos<T> {
    private List<T> emprestimos;

    public ListaEmprestimos() {
        emprestimos = new ArrayList<>();
    }

    public void adicionarEmprestimo(T emprestimo) {
        emprestimos.add(emprestimo);
    }

    public boolean removerEmprestimo(T emprestimo) {
        return emprestimos.remove(emprestimo);
    }

    public List<T> getEmprestimos() {
        return emprestimos;
    }

    public int tamanho() {
        return emprestimos.size();
    }

    public void limpar() {
        emprestimos.clear();
    }

    // Método para obter um empréstimo pelo índice
    public T obterEmprestimo(int indice) {
        if (indice >= 0 && indice < emprestimos.size()) {
            return emprestimos.get(indice);
        }
        return null;
    }

    // Método para verificar se um empréstimo existe na lista
    public boolean contemEmprestimo(T emprestimo) {
        return emprestimos.contains(emprestimo);
    }

    // Método para remover um empréstimo pelo índice
    public boolean removerEmprestimoPorIndice(int indice) {
        if (indice >= 0 && indice < emprestimos.size()) {
            emprestimos.remove(indice);
            return true;
        }
        return false;
    }
}

