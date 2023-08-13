package bem;


public class Emprestimo {
	// atributo da Classe

	private String livro;
	private String usuario;
	private String dataEmprestimo;
	private String dataVencimento;
	private boolean devolvido;
	private String Data;
	
	public class Data {
	    private int dia;
	    private int mes;
	    private int ano;
	    
	    public Data(int dia, int mes, int ano) {
	        this.dia = dia;
	        this.mes = mes;
	        this.ano = ano;
	    }
	    
	    public int getDia() {
	        return dia;
	    }
	    
	    public int getMes() {
	        return mes;
	    }
	    
	    public int getAno() {
	        return ano;
	    }
	    
	    public void setDia(int dia) {
	        this.dia = dia;
	    }
	    
	    public void setMes(int mes) {
	        this.mes = mes;
	    }
	    
	    public void setAno(int ano) {
	        this.ano = ano;
	    }
	    
	    public String toString() {
	        return dia + "/" + mes + "/" + ano;
	    }
	    
}

	// Construtor da Classe
	public Emprestimo(String livro, String usuario){
		this.livro = livro;
		this.usuario = usuario;
		this.dataEmprestimo = new Data();
		this.dataVencimento = new Data();
		this.dataVencimento.definirData(this.dataVencimento.getData()+ n); // n dias de vencimento
		this.devolvido = false;
	}
		
	void marcarComoDevolvido(){
		this.devolvido = true;
	}
}
