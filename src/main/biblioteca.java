package main;

import bem.Multimidia;
import RH.estudante_graduacao;
import RH.professor;
import RH.estudante_pos;
import bem.Emprestimo;
import bem.Relatorio;
import bem.Renovação;
import bem.Reserva;
import bem.Item;
import RH.membro;
import RH.funcionarios;
import bem.Data;
import bem.ReservaSala;
import bem.SalaMultimidia;
import bem.SalaGrupo;
import bem.SalaSilenciosa;
import bem.Multimidia.ExcecaoIdExistente;
import bem.SalaIndividual;
import bem.Livro;
import bem.Categoria;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class biblioteca {
	/*private Set<Emprestimo> emprestimos = new HashSet<>();
    private List<Reserva> reservas = new ArrayList<>();

	    public boolean emprestarItem(Item item, membro membro) {
	        // Verifique se o item já está emprestado para outro membro
	        for (Emprestimo emprestimo : emprestimos) {
	            if (emprestimo.getItem().equals(item)) {
	                return false; // O item já está emprestado
	            }
	        }

	        // Crie um novo empréstimo e adicione-o ao conjunto
	        Emprestimo emprestimo = new Emprestimo(item, membro);
	        emprestimos.add(emprestimo);
	        return true; // Empréstimo bem-sucedido
	    }

	    public void devolverItem(Item item) {
	        // Remova o empréstimo do conjunto quando o item for devolvido
	        emprestimos.removeIf(emprestimo -> emprestimo.getItem().equals(item));
	    }

	       
	    public void fazerReserva(Reserva reserva) {
	        reservas.add(reserva);
	    }

	    public void cancelarReserva(Reserva reserva) {
	        reservas.remove(reserva);
	    }*/
	
    public static void main(String[] args) throws ExcecaoIdExistente  {
    	// List membros
    	/*Biblioteca biblioteca = new Biblioteca();
        Item livro = new Item("Livro");
        Membro aluno1 = new Membro("Aluno 1");
        Membro aluno2 = new Membro("Aluno 2");
        
        Reserva reserva = new Reserva("Livro", aluno1);
        biblioteca.fazerReserva(reserva);

        // Cancela a reserva
        biblioteca.cancelarReserva(reserva);
        
        System.out.println("Tentando emprestar o livro para Aluno 1: " + biblioteca.emprestarItem(livro, aluno1)); // true
        System.out.println("Tentando emprestar o livro para Aluno 2: " + biblioteca.emprestarItem(livro, aluno2)); // false (já emprestado)

        biblioteca.devolverItem(livro); // Devolver o livro

        System.out.println("Tentando emprestar o livro para Aluno 2 após devolução: " + biblioteca.emprestarItem(livro, aluno2)); // true (agora está disponível)
    	
    	*/
    	List<membro> membros = new ArrayList<>();
        funcionarios Bruno = new funcionarios("Bruno Oefac","(19)99999999","12345678901","13083-852","22/09/2005","Auxiliar de Biblioteca",false,0,funcionarios.NivelAcesso.ADMINISTRADOR,membro.Perfil.FUNCIONARIO, "342134");
        estudante_graduacao Nisio = new estudante_graduacao("Nisio José","(31)91234321","41932966780","13083-700", "186261", false,0, "13/02/2020","Engenharia de Controle e Automação",membro.Perfil.ESTUDANTE_GRADUACAO);
        estudante_pos Ricardo = new estudante_pos("Ricardo Horie","(11)94324545","41932989780","13083-700", "123456", false,0, "15/02/2015","Mestrado em Engenharia de Controle e Automação",membro.Perfil.ESTUDANTE_POS);
        professor Cafeo = new professor("Bruno Cafeo","(19)99999999","12345678901","13083-852","678901",false, 0, "30/07/2011","Instituto de Computação",membro.Perfil.PROFESSOR);
        membros.add(Bruno);membros.add(Nisio);membros.add(Ricardo);membros.add(Cafeo);
        for (membro Membro : membros) {
            System.out.println("Nome do membro: " + Membro.getNome());
        }
        membros.remove(Cafeo);
        for (membro Membro : membros) {
            System.out.println("Nome do membro: " + Membro.getNome());
        }
        membros.get(0).getID();
        
        // Note que atualmente a classe multimidia implementa suficientemente a classe map
        // Desse modo, optamos por manter essa classe, visto que descaracteriza-la seria 
        // mais trabalhoso e improdutivo a manutenção do código, visto que a mesma existe 
        // implementada desde laboratorios pregressos
        
        Multimidia itens =  new Multimidia(15,6);// inicializa os itens. há 6 tipos de itens e 15 é o limite de itens por tipo.
        itens.adicionaLivro("The Java Programming Language","Ken Arnold, James Gosling & David Holmes","Prentice Hall","Ensino", 2000,"2 edição","bela capa","Venha aprender java amigo","89859734","E-44","Boa",2);
        itens.adicionaSoftware("AutoCAD", "Autodesk", "Não consta", "Simulação Mecânica", 2022, ".", "Software de projeto mecânico e arquitetônico", "2022.2", "Estudante", "22/09/2024", 1, "812981074");
        String isbn = "89859734";
        Livro livroconsultado = (Livro) itens.get(isbn);
        System.out.println("Informações do Livro:");
        System.out.println("ID: " + livroconsultado.getId());
        System.out.println("Nome: " + livroconsultado.getNome());
        System.out.println("Autor: " + livroconsultado.getAutorArtista());
        
        //Categorias
        Set<Categoria> categorias = new HashSet<>();
        categorias.add(new Categoria("Ciencia","Leste"));
        categorias.add(new Categoria("Artes","Oeste"));
        categorias.add(new Categoria("Tecnologia","Nordeste"));
        
        
        
        Emprestimo pedido01 = new Emprestimo(Nisio.getID(),itens.getId(1,0),1);
        System.out.println("Empréstimo realizado para " + Nisio.getNome() + " do livro " + itens.getTitulo(1,0));
        Renovação renovaçãoExemplo = new Renovação("The Java Programming Language", Nisio);
        Reserva reservaExemplo = new Reserva(livroconsultado, Ricardo);

        List<estudante_graduacao> estudantesGraduacao = new ArrayList<>();
        List<estudante_pos> estudantesPos = new ArrayList<>();
        List<professor> professores = new ArrayList<>();
        List<Emprestimo> emprestimos = new ArrayList<>();
        List<Reserva> reservas = new ArrayList<>();

        estudantesGraduacao.add(Nisio);
        estudantesPos.add(Ricardo);
        professores.add(Cafeo);
        emprestimos.add(pedido01);
        reservas.add(reservaExemplo);
        
        Relatorio.gerarRelatorioFinanceiro(estudantesGraduacao, estudantesPos, professores);
        Relatorio.gerarRelatorioEstatisticas(emprestimos, reservas);

        SalaMultimidia salaMultimidia = new SalaMultimidia(1, "Projetor, Computador, Sistema de Som", 30);

        Data dataReserva = new Data();
        dataReserva.setDia(25);
        dataReserva.setMes(7);
        dataReserva.setAno(2022);

        ReservaSala reserva = new ReservaSala(dataReserva, "11:00", "17:00", ReservaSala.StatusReserva.CONFIRMADA, salaMultimidia.getNumero(), "Multimídia", salaMultimidia.getCapacidade());

        System.out.println("Reserva da Sala Multimídia. Data: " + reserva.getDataReserva() + " Hora " + reserva.getHoraInicio() + "-" + reserva.getHoraFim());
        
        
        CReflection reflexao = new CReflection();
        reflexao.ImprimeAtributoMultimidia();
        reflexao.ImprimeMetodosMultimidia();
        reflexao.ImprimeMetodosMembro();
        reflexao.ImprimeAtributoMembro();
        reflexao.imprimirLista(estudantesGraduacao);
        
       
    }

}
		