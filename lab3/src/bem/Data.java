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
