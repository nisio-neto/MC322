package bem;

import bem.Data;
import java.time.LocalDate;

public class Renovação {



	//Atributo da classe
	private String livro;
	private String usuario;
	private String id;
	private Data dataRenovacao;
	private Data dataRenovado;
	private boolean renovado;

	//Construtor de classe
	public Renovação(String livro, String usuario) {
		this.livro = livro;
		this.usuario = usuario;
		this.dataRenovacao = new Data(LocalDate.now());
		int diasRenovacao = 7; // prazo de renovação de 7 dias
		LocalDate dataRenovado = LocalDate.now().plusDays(diasRenovacao);
		this.dataRenovado = new Data(dataRenovado);
		this.renovado = false; // inicialmente não foi renovado
		GeradorID gerador = new GeradorID(); // gerar ID de renovação
        this.id = gerador.gerarId();
        System.out.println(id);
	}

	// Metodo para renovar
	public void renovar() {
		if(!renovado) {
			int diasRenovacao = 7; //Prazo de renovação de 7 dias
			LocalDate novaDataRenovado = LocalDate.now().plusDays(diasRenovacao);
			this.dataRenovado = new Data(novaDataRenovado);
			this.renovado = true;
		} else {
			System.out.println("Este empréstimo já foi renovado anteriorimente.");
		}
	}
	
	// getter de livro
	public String getLivro() {
		return livro;
	}
	
	//getter de usuario
	public String getUsuario() {
		return usuario;
	}
	
	// getter de data de renovação
	public Data getDataRenovacao() {
		return dataRenovacao;
	}
	
	//getter de data renovado
	public Data getDataRenovado() {
		return dataRenovado;
	}
	
	public boolean isRenovado() {
		return renovado;
	}
}