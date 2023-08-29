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
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getGravadora() {
		return gravadora;
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
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
