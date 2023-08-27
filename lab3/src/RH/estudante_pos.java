package RH;

public class estudante_pos extends membro {
	// Atributos da classe
	private String RA;
	private String especializacao;
	private boolean Multa; // Indica se o usuario recebeu multa
	private int DiasMulta; // indica dias de multa do usuario
	
	public estudante_pos(String nome, String telefone, String CPF, String CEP, String RA, boolean Multa, int DiasMulta, String email, String especializacao) {
		super(nome,telefone,CPF,CEP,email);
		this.RA = RA;
		this.Multa = Multa;
		this.DiasMulta = DiasMulta;
		this.especializacao = especializacao;
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
	public void recadastraPos(String Nome, String Telefone, String CPF, String CEP, String email, String RA, String especializacao, boolean Multa, int DiasMulta) {
		this.setNome(Nome);
		this.setTelefone(Telefone);
		this.setCEP(CEP);
		this.setCPF(CPF);
		this.setEmail(email);
		this.setRA(RA);
		this.setEspecializacao(especializacao);
		this.setDiasMulta(DiasMulta);
		this.setMulta(Multa);
	}
	
	// Getters e Setters
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
	public void setRA(String RA) {
		this.RA = RA;
	}
	public String getRA() {
		return RA;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	public String getEspecializacao() {
		return especializacao;
	}

}