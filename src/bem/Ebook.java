package bem;

public class Ebook {
	private String nome;
	private String autor;
	private String editora;
	private String genero;
	private int ano;
	private String edicao;
	private String id;
	
	public Ebook(String nome, String autor, String editora, String genero, int ano, String edicao) {
		this.nome = nome;
		this.autor = autor; 
		this.editora = editora;
		this.genero = genero;
		this.ano = ano;
		this.edicao = edicao;
		GeradorID gerador = new GeradorID(); // gerar ID do emprestimo
        this.id = gerador.gerarId();
	}
	
	// Getters e Setters
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
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getGenero() {
		return genero;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return ano;
	}	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
