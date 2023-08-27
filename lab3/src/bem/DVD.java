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
	public String getId() {
		return id;
	}public void setId(String id) {
		this.id = id;
	}

}
