package RH;
import java.lang.Math;

public class funcionarios {
	// Atributos da classe
	private String id; // Identificação interna do funcionario
	private String nome;
	private String telefone;
	private String CPF;
	private String CEP;
	// Construtor da Classe
	public funcionarios(String nome, String telefone, String CPF, String CEP) {
		this.nome = nome;
		this.telefone = telefone;
		this.CEP = CEP;
		this.CPF = CPF;
		double rand = Math.random();
		rand = rand*1000;
		int intid = (int)rand;
		String id = Integer.toString(intid);
		this.id = id;//Idealmente há de se haver um sistema de geração de ids
	}
	// Metodos da classe
	
	
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
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCEP(String CEP) {
		this.CEP = CEP;
	}
	public String getCEP() {
		return CEP;
	}
	

}
