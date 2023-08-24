package bem;

import bem.Data;
import java.lang.Math;
import java.time.LocalDate;

public class Emprestimo {
    // Atributos da Classe
	private String id; // Id interna do emprestimo
    private String livro; // Nome/id do livro
    private String usuario; // Nome/id do usuario
    private Data dataEmprestimo;  // Data de emprestimo
    private Data dataVencimento; // Data de vencimento da locação
    private boolean devolvido; // Indica se o livro foi novamente devolvido, e o emprestimo encerrado

    // Construtor da Classe
    public Emprestimo(String livro, String usuario) {
        this.livro = livro; 
        this.usuario = usuario;
        this.dataEmprestimo = new Data(LocalDate.now());
        int diasDeVencimento = 14; // Por exemplo, 14 dias de vencimento
        LocalDate dataVencimento = LocalDate.now().plusDays(diasDeVencimento); // Adicione os dias de vencimento
        this.dataVencimento = new Data(dataVencimento);
        GeradorID gerador = new GeradorID(); // gerar ID do emprestimo
        this.id = gerador.gerarId();
        System.out.println(id);
        this.devolvido = false;
       
            
    }
    // Classe interna para gerar IDS de emprestimo
       public class GeradorID{
    	   public static String gerarId() {
    		   double rand = Math.random();
    		   rand = rand*1000000;
    		   int intid = (int)rand;
    		   String id = Integer.toString(intid);
    		   return id;
    	   }
        
    }
       
       // Getter para ID
    public String getId() {
    	return id;
    }
    
     // Getter para livro
    public String getLivro() {
    	return livro;
    }
    
    // Setter para o livro
    public void setLivro(String livro) {
    	this.livro = livro;
    }
    
    // Getter para o usuário
    public String getUsuario() {
    	return usuario;
    }
    
    // Setter para usuário
    public void setUsuario(String usuario) {
    	this.usuario =usuario;
    }
    
    // Getter para a data de empréstimo
    public Data getDataEmprestimo() {
    	return dataEmprestimo;
    }
    
    //Getter para a data de vencimento
    public Data getDataVencimento() {
    	return dataVencimento;
    }
    
    // Setter para a data de vencimento
    public void setDataVencimento(Data datavencimento) {
    	this.dataVencimento = datavencimento;
    }
    
    // getter para a flag "devolvido"
    public boolean getDevolvido() {
    	return devolvido;
    }
   
    // Setter para flag "devolvido"
    public void setDevolvido(boolean devolvido) {
    	this.devolvido = devolvido;
    }

 
}
