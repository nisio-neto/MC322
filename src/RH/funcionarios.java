package RH;

public class funcionarios extends membro{
	// Atributos da classe
	private String cargo;
	private String acesso;
	
	// Construtor da Classe
	public funcionarios(String nome, String telefone, String CPF, String CEP, String email, String cargo, String acesso) {
		super(nome,telefone,CPF,CEP,email);
		this.cargo =  cargo;
		this.acesso = acesso;
		
	}
	// Metodos da classe
	public void recadastraFuncionario(String Nome, String Telefone, String CPF, String CEP, String email, String cargo, String acesso) {
		this.setNome(Nome);
		this.setTelefone(Telefone);
		this.setCEP(CEP);
		this.setCPF(CPF);
		this.setEmail(email);
		this.setAcesso(acesso);
		this.setCargo(cargo);
	}
	
	// Getters e Setters
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCargo() {
		return cargo;
	}	
	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}
	public String getAcesso() {
		return acesso;
	}

}
