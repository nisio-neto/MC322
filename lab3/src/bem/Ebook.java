package bem;

public class Ebook {
	private String nome;
	private String autor;
	private String editora;
	private String genero;
	private int ano;
	private String edicao;
	
	public Ebook(String nome, String autor, String editora, String genero, int ano, String edicao) {
		this.nome = nome;
		this.autor = autor; 
		this.editora = editora;
		this.genero = genero;
		this.ano = ano;
		this.edicao = edicao;
	}
	
	// Getters e Setters
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getNome() {
		return nome;
	}
	protected void setEditora(String editora) {
		this.editora = editora;
	}
	protected String getEditora() {
		return editora;
	}
	protected void setGenero(String genero) {
		this.genero = genero;
	}
	protected String getGenero() {
		return genero;
	}
	protected void setAno(int ano) {
		this.ano = ano;
	}
	protected int getAno() {
		return ano;
	}	
	protected String getAutor() {
		return autor;
	}
	protected void setAutor(String autor) {
		this.autor = autor;
	}
	protected String getEdicao() {
		return edicao;
	}
	protected void setEdicao(String edicao) {
		this.edicao = edicao;
	}
}
