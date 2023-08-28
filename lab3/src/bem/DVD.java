package bem;

public class DVD {

	private String nome;
	private String diretor;
	private String estudio;
	private String genero;
	private int ano;
	private String edicao;
	private String id;
	
	public DVD(String nome, String diretor, String estudio, String genero, int ano, String edicao) {
		this.nome = nome;
		this.diretor = diretor; 
		this.estudio = estudio;
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
	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	public String getEstudio() {
		return estudio;
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
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
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
