package RH;

import bem.GeradorID;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import bem.Emprestimo;
import bem.Reserva;
import bem.Data;
import bem.Relatorio;
import bem.Periodo;


public class membro {
	
	public String id; // Identificação interna do membro
	private String nome; // Nome do membro
	private String telefone; // Telefone do membro
	private String CPF; // CPF do membro
	private String endereço; // endereço da residencia do membro
	private String dataInscricao;
	private Perfil perfil;
	private List<Emprestimo> emprestimos; // Lista de empréstimos feitos pelo membro
	private List<Reserva> reservas; // Lista de reservas feitas pelo membro
	private double multasAcumuladas; // Total de multas acumuladas pelo membro
	private double pagamentosEfetuados; // Total de pagamentos efetuados pelo membro
	
	public membro(String nome, String telefone, String CPF, String endereço, String dataInscricao, Perfil perfil) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereço = endereço;
		this.CPF = CPF;
		this.dataInscricao = dataInscricao;
		GeradorID gerador = new GeradorID(); // gerar ID do emprestimo
        this.id = gerador.gerarId();
        this.perfil = perfil; // Definindo o perfil durante a criação do membro
        this.emprestimos = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.multasAcumuladas = 0;
        this.pagamentosEfetuados = 0;
	}


	public int getEmprestimosNoPeriodo(Periodo periodo) {
	    int contadorEmprestimos = 0;

	    for (Emprestimo emprestimo : emprestimos) {
	        Data dataEmprestimo = emprestimo.getDataEmprestimo();
	        Data dataInicio = periodo.getDataInicio();
	        Data dataFim = periodo.getDataFim();

	        if (dataEmprestimo.after(dataInicio) && dataEmprestimo.before(dataFim)) {
	            contadorEmprestimos++;
	        }
	    }

	    return contadorEmprestimos;
	}
	
	// Enumeração para representar os perfis de membro
	public enum Perfil {
	    ESTUDANTE_GRADUACAO,
	    ESTUDANTE_POS,
	    PROFESSOR,
	    FUNCIONARIO
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String getID() {
		return id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getCPF() {
		return CPF;
	}
	public void setendereço(String endereço) {
		this.endereço = endereço;
	}
	public String getendereço() {
		return endereço;
	}
	public void setDataInscricao(String dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	public String getDataInscricao() {
		return dataInscricao;
	}
	public Perfil getPerfil() {
        return perfil; // Método para acessar o perfil do membro
    }
}
