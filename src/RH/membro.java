package RH;
import bem.GeradorID;

public class membro {
	
	public String id; // Identificação interna do membro
	private String nome; // Nome do membro
	private String telefone; // Telefone do membro
	private String CPF; // CPF do membro
	private String endereço; // endereço da residencia do membro
	private String dataInscricao;
	
	public membro(String nome, String telefone, String CPF, String endereço, String dataInscricao) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereço = endereço;
		this.CPF = CPF;
		this.dataInscricao = dataInscricao;
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
	public void setendereço(String endereço) {
		this.endereço = endereço;
	}
	public String getendereço() {
		return endereço;
	}
	public void setDataInscricao(String dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	public String getDataInscricao() {
		return dataInscricao;
	}
}
