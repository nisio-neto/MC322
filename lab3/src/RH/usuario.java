package RH;
import java.lang.Math;

public class usuario {
	// Atributos da classe
	public String id; // Identificação interna do usuario
	private String nome; // Nome do usuario
	private String telefone; // Telefone do usuario
	private String CPF; // CPF do usuario
	private String CEP; // CEP da residencia do usuario
	private boolean Multa; // Indica se o usuario recebeu multa
	private int DiasMulta; // indica dias de multa do usuario
	
	public usuario(String nome, String telefone, String CPF, String CEP) {
		this.nome = nome;
		this.telefone = telefone;
		this.CEP = CEP;
		this.CPF = CPF;
		double rand = Math.random();
		rand = rand*1000;
		int intid = (int)rand;
		String id = Integer.toString(intid);
		this.id = id;//Idealmente há de se haver um sistema de geração de ids
		this.Multa = false;
		this.DiasMulta = 0;
	}
	
	// Metodos da classe
	
	public void aplicaMulta(boolean Multa, int DiasMulta) {
		this.setMulta(Multa);
		this.setDiasMulta(DiasMulta);
	}
	public void retiraMulta() {
		this.setMulta(false);
		this.setDiasMulta(0);
	}
	public void recadastraUsuario(String Nome, String Telefone, String CPF, String CEP) {
		this.setNome(Nome);
		this.setTelefone(Telefone);
		this.setCEP(CEP);
		this.setCPF(CPF);
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
	public void setMulta(boolean Multa) {
		this.Multa = Multa;
	}
	public boolean getMulta() {
		return Multa;
	}
	public void setDiasMulta(int DiasMulta) {
		this.DiasMulta = DiasMulta;
	}
	public int getDiasMulta() {
		return DiasMulta;
	}

}
