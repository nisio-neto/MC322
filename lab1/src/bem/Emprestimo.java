package bem;

<<<<<<< HEAD
import java.time.LocalDate;
=======
>>>>>>> d41b891a8e1bca176c21306e8afa85dbd55b0f1b

public class Emprestimo {
	// atributo da Classe

	private String livro;
	private String usuario;
<<<<<<< HEAD
	private Data dataEmprestimo;
	private Data dataVencimento;
	private boolean devolvido;
	private int diasDeVencimento;
	
	
	public static class Data {
=======
	private String dataEmprestimo;
	private String dataVencimento;
	private boolean devolvido;
	private String Data;
	
	public class Data {
>>>>>>> d41b891a8e1bca176c21306e8afa85dbd55b0f1b
	    private int dia;
	    private int mes;
	    private int ano;
	    
<<<<<<< HEAD
	    public Data(LocalDate data) {
            this.dia = data.getDayOfMonth();
            this.mes = data.getMonthValue();
            this.ano = data.getYear();
=======
	    public Data(int dia, int mes, int ano) {
	        this.dia = dia;
	        this.mes = mes;
	        this.ano = ano;
>>>>>>> d41b891a8e1bca176c21306e8afa85dbd55b0f1b
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
<<<<<<< HEAD
	

=======
>>>>>>> d41b891a8e1bca176c21306e8afa85dbd55b0f1b

	// Construtor da Classe
	public Emprestimo(String livro, String usuario){
		this.livro = livro;
		this.usuario = usuario;
<<<<<<< HEAD
		this.dataEmprestimo = new Data(LocalDate.now());
		int diasDeVencimento = 14; // 14 dias de data de vencimento
		LocalDate dataVencimento = LocalDate.now().plusDays(diasDeVencimento);
		this.dataVencimento = new Data(dataVencimento);
=======
		this.dataEmprestimo = new Data();
		this.dataVencimento = new Data();
		this.dataVencimento.definirData(this.dataVencimento.getData()+ n); // n dias de vencimento
>>>>>>> d41b891a8e1bca176c21306e8afa85dbd55b0f1b
		this.devolvido = false;
	}
		
	void marcarComoDevolvido(){
		this.devolvido = true;
	}
}
