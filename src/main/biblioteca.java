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
        funcionarios Bruno = new funcionarios("Bruno Cafeo","(19)99999999","12345678901","13083-852","bruno@ic.com.br","Gerente","Admin");
        estudante_graduacao Nisio = new estudante_graduacao("Nisio José","(31)91234321","41932966780","13083-700", "186261", false,0, "n186261@dac.unicamp.br","Engenharia de Controle e Automação");
        estudante_pos Ricardo = new estudante_pos("Ricardo Horie","(11)94324545","41932989780","13083-700", "123456", false,0, "r123456@dac.unicamp.br","Mestrado em Engenharia de Controle e Automação");
        professor Cafeo = new professor("Bruno Cafeo","(19)99999999","12345678901","13083-852","678901",false, 0, "bruno@ic.com.br","Instituto de Computação");
        Multimidia itens =  new Multimidia(15);
        itens.adicionaLivro("The Java Programming Language","Ensino","Ken Arnold, James Gosling & David Holmes","Prentice Hall",2000,"2 edição");
        Emprestimo pedido01 = new Emprestimo(Nisio.getNome(),itens.getLivros()[0].getNome());
        System.out.println("Empréstimo realizado para " + Nisio.getNome() + " do livro " + itens.getLivros()[0].getNome());
        Renovação renovaçãoExemplo = new Renovação("The Java Programming Language", "Nisio José");
        Reserva reservaExemplo = new Reserva("Ensino", "Ricardo Horie");

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