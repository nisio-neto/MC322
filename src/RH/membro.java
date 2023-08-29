package RH;
import bem.GeradorID;

public class membro {
	
	public String id; // Identificação interna do membro
	private String nome; // Nome do membro
	private String telefone; // Telefone do membro
	private String CPF; // CPF do membro
	private String CEP; // CEP da residencia do membro
	private String email;
	
	public membro(String nome, String telefone, String CPF, String CEP, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.CEP = CEP;
		this.CPF = CPF;
		this.email = email;
		GeradorID gerador = new GeradorID(); // gerar ID do emprestimo
        this.id = gerador.gerarId();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
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
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
}
