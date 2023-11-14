package main;

public class CObserver implements CObserverImpl {
    private String nome;

    public CObserver(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu a seguinte mensagem: " + mensagem);
    }
}
