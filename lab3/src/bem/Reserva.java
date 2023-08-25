package bem;

import bem.GeradorID;
import bem.Data;

public class Reserva {


	//Atributo da classe
	private String livro; // nome do livro
	private String usuario; // nome do usuario
	private String id; // id da reserva
	private Data dataReserva; // data da reserva
	private boolean reservado; // indica se a reserva foi confirmada

	//Construtor de classe
	public Reserva(String livro, String usuario) {
		this.livro = livro;
		this.usuario = usuario;
		this.dataReserva = new Data(); // data atual
		GeradorID gerador = new GeradorID(); // gerar ID da reserva
		this.id = gerador.gerarId();
		this.reservado = false; // inicialmente não confirmada
		}

	// confirmar a reserva
	public void confirmaReserva() {
		this.reservado = true;
	}
	
	// Reservar o livro
	public void reservar() {
		if(!reservado) {
			System.out.println("Reserva realizada para " + usuario + " do livro " + livro);
			reservado = true;
		} else {
			System.out.println("Eta reserva já foi confirmada anteriormente.");
		}
	}
	// Getter para ID
	public String getId() {
		return id;
	}
	
	// Getter para livro
	public String getLivro() {
		return livro;
	}
	
	// Getter para usuario
	public String getUsuario() {
		return usuario;
	}
	
	// Getter para a data da reserva
	public Data getDataReserva() {
		return dataReserva;
	}
	
	// Getter para confirmação da reserva
	public boolean foiReservado() {
		return reservado;
	}
}


