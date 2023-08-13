package bem;
import java.lang.Math;

public class livro {
	// Atributos da classe
	private String id; // Identificação interna do livro
	private String nome;
	private String editora;
	private String assunto;
	private String autor;
	private boolean disponivel;
	private int unidades;
	
	// Construtor classe
	public livro(String nome, String editora, String assunto, String autor, boolean disponivel, int unidades) {
		this.nome = nome;
		this.editora = editora;
		this.assunto = assunto;
		this.autor = autor;
		double rand = Math.random();
		rand = rand*10000;
		int intid = (int)rand;
		String id = Integer.toString(intid);
		this.id = id;//Idealmente há de se haver um sistema de geração de ids
		this.disponivel = disponivel;
		this.unidades = unidades;
	}
	
	
	
	// Getters e Setters
	public String getID() {
		return id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getEditora() {
		return editora;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAutor() {
		return autor;
	}	
	public boolean getDisponibilidade() {
		return disponivel;
	}
	public void setDisponibilidade(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public int getUnidade() {
		return unidades;
	}
	public void setUnidade(int unidades) {
		this.unidades = unidades;
	}

}
