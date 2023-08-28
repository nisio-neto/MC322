package RH;

public class estudante_graduacao extends membro {
	// Atributos da classe
	private String RA;
	private String curso;
	private boolean Multa; // Indica se o usuario recebeu multa
	private int DiasMulta; // indica dias de multa do usuario
	
	public estudante_graduacao(String nome, String telefone, String CPF, String CEP, String RA, boolean Multa, int DiasMulta, String email, String curso) {
		super(nome,telefone,CPF,CEP,email);
		this.RA = RA;
		this.Multa = Multa;
		this.DiasMulta = DiasMulta;
		this.curso = curso;
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
	public void recadastraGrad(String Nome, String Telefone, String CPF, String CEP, String email, String RA, String curso, boolean Multa, int DiasMulta) {
		this.setNome(Nome);
		this.setTelefone(Telefone);
		this.setCEP(CEP);
		this.setCPF(CPF);
		this.setEmail(email);
		this.setRA(RA);
		this.setCurso(curso);
		this.setDiasMulta(DiasMulta);
		this.setMulta(Multa);
	}
	public double calcularTotalMultas() {
		double valorMultaPorDia = 5.0; // Valor da multa por dia de atraso
		return getDiasMulta() * valorMultaPorDia;
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
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCurso() {
		return curso;
	}
	
}