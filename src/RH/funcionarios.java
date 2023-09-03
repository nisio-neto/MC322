package RH;

public class funcionarios extends membro{
	// Atributos da classe
	private String cargo;
	private String acesso;
	private boolean Multa; // Indica se o usuario recebeu multa
	private int DiasMulta; // indica dias de multa do usuario
	
	// Construtor da Classe
	public funcionarios(String nome, String telefone, String CPF, String endereço, String dataInscricao, String cargo, String acesso ,boolean Multa, int DiasMulta) {
		super(nome,telefone,CPF,endereço,dataInscricao);
		this.cargo =  cargo;
		this.acesso = acesso;
		this.Multa = Multa;
		this.DiasMulta = DiasMulta;
		
	}
	// Metodos da classe
	public void recadastraFuncionario(String Nome, String Telefone, String CPF, String endereço, String dataInscricao, String cargo, String acesso) {
		this.setNome(Nome);
		this.setTelefone(Telefone);
		this.setendereço(endereço);
		this.setCPF(CPF);
		this.setDataInscricao(dataInscricao);
		this.setAcesso(acesso);
		this.setCargo(cargo);
	}
	public void aplicaMulta(boolean Multa, int DiasMulta) {
		this.setMulta(Multa);
		this.setDiasMulta(DiasMulta);
	}
	public void retiraMulta() {
		this.setMulta(false);
		this.setDiasMulta(0);
	}
	public double calcularTotalMultas() {
		double valorMultaPorDia = 0.75; // Valor da multa por dia de atraso
		return getDiasMulta() * valorMultaPorDia;
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
