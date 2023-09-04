package bem;

import java.time.LocalDate;

public class Data {

	//Atributos da Classe
	private int dia; // dia
	private int mes; // mês
	private int ano; // ano

	//Construtor da Classe
	public Data() {
	LocalDate dataAtual = LocalDate.now();
	this.dia = dataAtual.getDayOfMonth(); //gerar dia do mês
	this.mes = dataAtual.getMonthValue(); // gerar mês do ano
	this.ano = dataAtual.getYear(); // gerar ano
	}

	//Adicionar dias a uma data
	public void adicionarDias(int dias) {
		LocalDate dataAtual = LocalDate.of(ano, mes, dia);
		LocalDate dataNova = dataAtual.plusDays(dias);
		this.dia = dataNova.getDayOfMonth();
		this.mes = dataNova.getMonthValue();
		this.ano = dataNova.getYear();
	}
	
	 // Método para calcular a diferença em dias entre duas datas
    public int diferencaEmDias(Data outraData) {
        int dia1 = this.getDia();
        int mes1 = this.getMes();
        int ano1 = this.getAno();

        int dia2 = outraData.getDia();
        int mes2 = outraData.getMes();
        int ano2 = outraData.getAno();

        // Converter as datas para um número sequencial de dias desde uma data de referência
        int data1EmDias = ano1 * 365 + mes1 * 30 + dia1;
        int data2EmDias = ano2 * 365 + mes2 * 30 + dia2;

        // Calcular a diferença em dias
        int diferenca = Math.abs(data2EmDias - data1EmDias);

        return diferenca;
    }


	//getter do dia
	public int getDia() {
		return dia;
		}

	//getter do mês
	public int getMes() {
		return mes;
		}

	//getter do ano
	public int getAno() {
		return ano;
		}

	//setter do dia
	public void setDia(int dia) {
		this.dia = dia;
		}
	
	//setter do mês
	public void setMes(int mes) {
		this.mes = mes;
		}

	//setter do ano
	public void setAno(int ano) {
		this.ano = ano;
		}

	public String toString() {
		return dia + "/" + mes + "/" + ano;
		}
	}
