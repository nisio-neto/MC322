package bem;

import java.time.LocalDate;
import java.lang.Math;

public class Emprestimo {
    // Atributos da Classe
	public String id; // Id interna do emprestimo
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
        double rand = Math.random();
		rand = rand*1000000;
		int intid = (int)rand;
		String id = Integer.toString(intid);
		this.id = id;//Idealmente há de se haver um sistema de geração de ids, que aqui é improvisado
        this.devolvido = false;
        
        
    }

    void marcarComoDevolvido() {
        this.devolvido = true;
    }

    // Classe interna estática Data
    public static class Data {
        private int dia;
        private int mes;
        private int ano;

        public Data(LocalDate data) {
            this.dia = data.getDayOfMonth();
            this.mes = data.getMonthValue();
            this.ano = data.getYear();
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
}
