package RH;

public class professor extends membro {
	// Atributos da classe
	private String matricula;
	private String area;
	private boolean Multa; // Indica se o usuario recebeu multa
	private int DiasMulta; // indica dias de multa do usuario
	
	public professor(String nome, String telefone, String CPF, String CEP, String matricula, boolean Multa, int DiasMulta, String email, String area) {
		super(nome,telefone,CPF,CEP,email);
		this.matricula = matricula;
		this.Multa = Multa;
		this.DiasMulta = DiasMulta;
		this.area = area;
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
	public void recadastraPos(String Nome, String Telefone, String CPF, String CEP, String email, String matricula, String area, boolean Multa, int DiasMulta) {
		this.setNome(Nome);
		this.setTelefone(Telefone);
		this.setCEP(CEP);
		this.setCPF(CPF);
		this.setEmail(email);
		this.setMatricula(matricula);
		this.setArea(area);
		this.setDiasMulta(DiasMulta);
		this.setMulta(Multa);
	}
	public double calcularTotalMultas() {
		double valorMultaPorDia = 10.0; // Valor da multa por dia de atraso
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
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getArea() {
		return area;
	}

}