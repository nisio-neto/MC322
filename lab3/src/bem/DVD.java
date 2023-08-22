package bem;

public class DVD {

	private String nome;
	private String diretor;
	private String estudio;
	private String genero;
	private int ano;
	private String edicao;
	
	public DVD(String nome, String diretor, String estudio, String genero, int ano, String edicao) {
		this.nome = nome;
		this.diretor = diretor; 
		this.estudio = estudio;
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
	protected void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	protected String getEstudio() {
		return estudio;
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
	protected String getDiretor() {
		return diretor;
	}
	protected void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	protected String getEdicao() {
		return edicao;
	}
	protected void setEdicao(String edicao) {
		this.edicao = edicao;
	}

}
