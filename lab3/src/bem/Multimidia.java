package bem;
import bem.DVD;
import bem.Livro;
import bem.Ebook;
import bem.CD;



public class Multimidia {

	// Atributos da classe
	private DVD[] dvds;
	private Livro[] livros; // Editora do periodico
	private Ebook[] ebooks; // Assunto do periodico/seção da biblioteca
	private CD[] cds; // Autor(es) do periodico
	private int[] numItem;
	private boolean[][] disponivel; // Indica se o periodico está disponível para empréstimo
	private int[][] unidades; // Indica unidades do periodico disponiveis para emprestimo
	
	// Construtor classe
	public Multimidia(int max_itens) {
		dvds = new DVD[max_itens];
		livros = new Livro[max_itens];
		ebooks = new Ebook[max_itens];
		cds = new CD[max_itens];
		disponivel = new boolean[4][max_itens];  // 4 tipos de mídia (DVD, Livro, Ebook, CD)
        unidades = new int[4][max_itens];
        numItem = new int[4];
	}
	
	// Metodos da classe
	
	public void adicionaDVD(String nome, String diretor, String estudio, String genero, int ano, String edicao) {
		DVD dvd = new DVD(nome, diretor, estudio, genero, ano, edicao);
		dvds[numItem[0]] = dvd;
	}
	public void removeDVD(int indice) {
            dvds[indice] = null;  // Remove o DVD da coleção
            disponivel[0][indice] = false;  // Define a disponibilidade como falso
            unidades[0][indice] = 0;  // Define o número de unidades como zero
            numItem[0]--;  // Atualiza a contagem de itens
	}
	public void adicionaLivro(String nome, String autor, String editora, String genero, int ano, String edicao) {
		Livro livro = new Livro(nome, autor, editora, genero, ano, edicao);
		livros[numItem[1]] = livro;
	}
	public void removeLivro(int indice) {
            livros[indice] = null;  // Remove o DVD da coleção
            disponivel[1][indice] = false;  // Define a disponibilidade como falso
            unidades[1][indice] = 0;  // Define o número de unidades como zero
            numItem[1]--;  // Atualiza a contagem de itens
	}
	public void adicionaEbook(String nome, String autor, String editora, String genero, int ano, String edicao) {
		Ebook ebook = new Ebook(nome, autor, editora, genero, ano, edicao);
		ebooks[numItem[2]] = ebook;
	}
	public void removeEbook(int indice) {
            ebooks[indice] = null;  // Remove o DVD da coleção
            disponivel[2][indice] = false;  // Define a disponibilidade como falso
            unidades[2][indice] = 0;  // Define o número de unidades como zero
            numItem[2]--;  // Atualiza a contagem de itens
	}
	public void adicionaCD(String nome, String artista, String gravadora, String genero, int ano, String volume) {
		CD cd = new CD(nome, artista, gravadora, genero, ano, volume);
		cds[numItem[3]] = cd;
	}
	public void removeCD(int indice) {
            cds[indice] = null;  // Remove o DVD da coleção
            disponivel[3][indice] = false;  // Define a disponibilidade como falso
            unidades[3][indice] = 0;  // Define o número de unidades como zero
            numItem[3]--;  // Atualiza a contagem de itens
	}
	
	
	// Getters e Setters
	public DVD[] getDVDs() {
		return dvds;
	}
	public CD[] getCDs() {
		return cds;
	}
	public Ebook[] getEbooks() {
		return ebooks;
	}
	public Livro[] getLivros() {
		return livros;
	}
	public void setDVDs(DVD[] dvds) {
		this.dvds = dvds;
	}
	public void setCDs(CD[] cds) {
		this.cds = cds;;
	}
	public void setEbooks(Ebook[] ebooks) {
		this.ebooks = ebooks;
	}
	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}
	public boolean[][] getDisponibilidade() {
		return disponivel;
	}
	public void setDisponibilidade(boolean[][] disponivel) {
		this.disponivel = disponivel;
	}
	public int[][] getUnidade() {
		return unidades;
	}
	public void setUnidade(int[][] unidades) {
		this.unidades = unidades;
	}


}
