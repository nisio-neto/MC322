package bem;
import java.lang.Math;
import bem.DVD;
import bem.Livro;
import bem.Ebook;
import bem.CD;


public class Multimidia {

	// Atributos da classe
	public String id; // Identificação interna do item
	private DVD[] dvds; // Nome do item
	private Livro[] livros; // Editora do periodico
	private Ebook[] ebooks; // Assunto do periodico/seção da biblioteca
	private CD[] cds; // Autor(es) do periodico
	private boolean disponivel[][]; // Indica se o periodico está disponível para empréstimo
	private int unidades[][]; // Indica unidades do periodico disponiveis para emprestimo
	
	// Construtor classe
	public Multimidia(String item, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, int unidades, boolean disponivel) {
		if(item.equals("DVD")) {
			
		}
		if(item.equals("CD")) {
			
		}
		if(item.equals("Ebook")) {
			
		}
		if(item.equals("Livro")) {
			
		}
		else {
			System.out.println("Esse item não é aceito em nossa biblioteca");
		}
		this.nome = nome;
		this.editora = editora;
		this.assunto = assunto;
		this.data = data;
		double rand = Math.random();
		rand = rand*10000;
		int intid = (int)rand;
		String id = Integer.toString(intid);
		this.id = id;//Idealmente há de se haver um sistema de geração de ids
		this.disponivel = disponivel;
		this.unidades = unidades;
	}
	
	// Metodos da classe
	
	public boolean retiraPeriodico(int copias) {
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
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
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
