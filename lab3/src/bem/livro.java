package bem;
import java.lang.Math;

public class livro {
	// Atributos da classe
	public String id; // Identificação interna do livro
	private String nome; // Nome do livro
	private String editora; // Editora do livro
	private String assunto; // Assunto do livro/seção da biblioteca
	private String autor; // Autor(es) do livro
	private boolean disponivel; // Indica se o livro está disponível para empréstimo
	private int unidades; // Indica unidades do livro disponiveis para emprestimo
	
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
	// Metodos da classe
	public boolean retiraLivro(int copias) {
		int exemplares = this.getUnidade();
		boolean disponibilidade = this.getDisponibilidade();
		if(disponibilidade == false) {
			return false;
		}
		exemplares = exemplares - copias;
		if(exemplares < 0) {
			return false;
		}
		else {
			this.setUnidade(exemplares);
			if(exemplares == 0) {
				this.setDisponibilidade(false);
			}
			return true;
		}
	}
	
	public void adicionaCopia(int copias) {
		int exemplares = this.getUnidade();
		exemplares = exemplares + copias;
		this.setUnidade(exemplares);
		if(exemplares > 0) {
			this.setDisponibilidade(true);
		}
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
