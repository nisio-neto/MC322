package main;

import bem.Multimidia;
import RH.estudante_graduacao;
import RH.professor;
import RH.estudante_pos;
import bem.Emprestimo;
import bem.Relatorio;
import bem.Renovação;
import bem.Reserva;
import RH.membro;
import RH.funcionarios;

import java.util.ArrayList;
import java.util.List;

public class biblioteca {
    public static void main(String[] args) {
        funcionarios Bruno = new funcionarios("Bruno Cafeo","(19)99999999","12345678901","13083-852","22/09/2005","Auxiliar de Biblioteca",false,0,funcionarios.NivelAcesso.ADMINISTRADOR,membro.Perfil.FUNCIONARIO);
        estudante_graduacao Nisio = new estudante_graduacao("Nisio José","(31)91234321","41932966780","13083-700", "186261", false,0, "13/02/2020","Engenharia de Controle e Automação",membro.Perfil.ESTUDANTE_GRADUACAO);
        estudante_pos Ricardo = new estudante_pos("Ricardo Horie","(11)94324545","41932989780","13083-700", "123456", false,0, "15/02/2015","Mestrado em Engenharia de Controle e Automação",membro.Perfil.ESTUDANTE_POS);
        professor Cafeo = new professor("Bruno Cafeo","(19)99999999","12345678901","13083-852","678901",false, 0, "30/07/2011","Instituto de Computação",membro.Perfil.PROFESSOR);
        Multimidia itens =  new Multimidia(15,5);
        itens.adicionaLivro("The Java Programming Language","Ken Arnold, James Gosling & David Holmes","Prentice Hall","Ensino",2000,"2 edição","bela capa","Venha aprender java amigo","89859734","E-44","Boa");
        Emprestimo pedido01 = new Emprestimo(Nisio.getID(),itens.getLivros()[0].getId(),1);
        System.out.println("Empréstimo realizado para " + Nisio.getNome() + " do livro " + itens.getLivros()[0].getNome());
        Renovação renovaçãoExemplo = new Renovação("The Java Programming Language", Nisio);
        Reserva reservaExemplo = new Reserva("Ensino", Ricardo);

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

    }
}