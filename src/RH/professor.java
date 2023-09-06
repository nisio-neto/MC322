package RH;

public class professor extends membro {
	// Atributos da classe
	private String matricula;
	private String area;
	private boolean Multa; // Indica se o usuario recebeu multa
	private int DiasMulta; // indica dias de multa do usuario
	
	public professor(String nome, String telefone, String CPF, String endereço, String matricula, boolean Multa, int DiasMulta, String dataInscricao, String area, Perfil perfil) {
		super(nome,telefone,CPF,endereço,dataInscricao,perfil);
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
	public void recadastraPos(String Nome, String Telefone, String CPF, String endereço, String dataInscricao, String matricula, String area, boolean Multa, int DiasMulta) {
		this.setNome(Nome);
		this.setTelefone(Telefone);
		this.setendereço(endereço);
		this.setCPF(CPF);
		this.setDataInscricao(dataInscricao);
		this.setMatricula(matricula);
		this.setArea(area);
		this.setDiasMulta(DiasMulta);
		this.setMulta(Multa);
	}
	public double calcularTotalMultas() {
		double valorMultaPorDia = 0.5; // Valor da multa por dia de atraso
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