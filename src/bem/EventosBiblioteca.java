package bem;

import bem.Data;
import RH.membro;
import java.util.ArrayList;
import java.util.List;

public class EventosBiblioteca {
    public static void main(String[] args) {
    	
    	// Criando a lista de membros
    	membro generico = new membro("generico", "(11) 99999999", "89736476680", "Rua Alan Turing 70", "22/02/99", membro.Perfil.ESTUDANTE_GRADUACAO);
    	
    	
        // Criando uma palestra
        Palestra palestra = new Palestra("John Doe", "Introdução à Programação", new Data(), "10:00 AM", "Sala 101");
        palestra.adicionarMembro(generico); // adicionando membro para palestra
        // Criando um workshop
        Workshop workshop = new Workshop("Jane Smith", "Desenvolvimento Web", "Laptop, Wi-Fi", new Data(), "14:00 PM", "Sala 102");

        // Criando uma exposição
        Exposicao exposicao = new Exposicao("Arte Contemporânea", "Artistas famosos", "1 hora", "Galeria de Arte");

        // Exibindo informações sobre os eventos
        System.out.println("Detalhes da Palestra:");
        System.out.println("Palestrante: " + palestra.getPalestrante());
        System.out.println("Tópico: " + palestra.getTopico());
        System.out.println("Data: " + palestra.getData());
        System.out.println("Horário: " + palestra.getHorario());
        System.out.println("Local: " + palestra.getLocal());

        System.out.println("\nDetalhes do Workshop:");
        System.out.println("Instrutor: " + workshop.getInstrutor());
        System.out.println("Tópico: " + workshop.getTopico());
        System.out.println("Materiais Necessários: " + workshop.getMateriaisNecessarios());
        System.out.println("Data: " + workshop.getData());
        System.out.println("Horário: " + workshop.getHorario());
        System.out.println("Local: " + workshop.getLocal());

        System.out.println("\nDetalhes da Exposição:");
        System.out.println("Tema: " + exposicao.getTema());
        System.out.println("Expositores: " + exposicao.getExpositores());
        System.out.println("Duração: " + exposicao.getDuracao());
        System.out.println("Local: " + exposicao.getLocal());
    }
}

enum TipoDeEvento {
    PALESTRA,
    WORKSHOP,
    EXPOSICAO
}

class Palestra {
    private String palestrante;
    private String topico;
    private Data data;
    private String horario;
    private String local;
    private TipoDeEvento tipoDeEvento = TipoDeEvento.PALESTRA;
    private List<membro> membros;

    public Palestra(String palestrante, String topico, Data data, String horario, String local) {
        this.palestrante = palestrante;
        this.topico = topico;
        this.data = data;
        this.horario = horario;
        this.local = local;
    }
    public void adicionarMembro(membro membro) {
        membros.add(membro);
    }

    // Métodos getter para acessar os atributos

    public String getPalestrante() {
        return palestrante;
    }

    public String getTopico() {
        return topico;
    }

    public Data getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public String getLocal() {
        return local;
    }
    
    public TipoDeEvento getTipoDeEvento() {
        return tipoDeEvento;
    }
}


class Workshop {
    private String instrutor;
    private String topico;
    private String materiaisNecessarios;
    private Data data;
    private String horario;
    private String local;
    private TipoDeEvento tipoDeEvento = TipoDeEvento.WORKSHOP;
    private List<membro> membros;

    public Workshop(String instrutor, String topico, String materiaisNecessarios, Data data, String horario, String local) {
        this.instrutor = instrutor;
        this.topico = topico;
        this.materiaisNecessarios = materiaisNecessarios;
        this.data = data;
        this.horario = horario;
        this.local = local;
    }
    public void adicionarMembro(membro membro) {
        membros.add(membro);
    }


    public String getInstrutor() {
        return instrutor;
    }

    public String getTopico() {
        return topico;
    }

    public String getMateriaisNecessarios() {
        return materiaisNecessarios;
    }

    public Data getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public String getLocal() {
        return local;
    }
    
    public TipoDeEvento getTipoDeEvento() {
        return tipoDeEvento;
    }
}

class Exposicao {
    private String tema;
    private String expositores;
    private String duracao;
    private String local;
    private TipoDeEvento tipoDeEvento = TipoDeEvento.EXPOSICAO;
    private List<membro> membros;

    public Exposicao(String tema, String expositores, String duracao, String local) {
        this.tema = tema;
        this.expositores = expositores;
        this.duracao = duracao;
        this.local = local;
    }
    public void adicionarMembro(membro membro) {
        membros.add(membro);
    }

    // Métodos getter para acessar os atributos

    public String getTema() {
        return tema;
    }

    public String getExpositores() {
        return expositores;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getLocal() {
        return local;
    }
    
    public TipoDeEvento getTipoDeEvento() {
        return tipoDeEvento;
    }
    
}
