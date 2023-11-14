package main;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<CObserver> observers = new ArrayList<>();
    private String mensagemNotificacao;

    public void registrarObservador(CObserver observer) {
        observers.add(observer);
    }

    public void removerObservador(CObserver observer) {
        observers.remove(observer);
    }

    public void notificarObservadores() {
        for (CObserver observer : observers) {
            observer.atualizar(mensagemNotificacao);
        }
    }

    public void setMensagemNotificacao(String mensagemNotificacao) {
        this.mensagemNotificacao = mensagemNotificacao;
        notificarObservadores();
    }
}