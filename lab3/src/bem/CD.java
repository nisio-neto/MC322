package bem;

public class CD {
	private String nome;
	private String artista;
	private String gravadora;
	private String genero;
	private int ano;
	private String volume;
	private String id;
	
	public CD(String nome, String artista, String gravadora, String genero, int ano, String volume) {
		this.nome = nome;
		this.artista = artista; // fala de artista cho
		this.gravadora = gravadora;
		this.genero = genero;
		this.ano = ano;
		this.volume = volume;
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
	protected void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	protected String getGravadora() {
		return gravadora;
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
	protected String getArtista() {
		return artista;
	}
	protected void setArtista(String artista) {
		this.artista = artista;
	}
	protected String getVolume() {
		return volume;
	}
	protected void setVolume(String volume) {
		this.volume = volume;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
