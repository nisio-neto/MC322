package main;
import bem.livro;
import bem.periodico;
import RH.funcionarios;
import RH.usuario;
import bem.Emprestimo;

public class biblioteca {
	public static void main(String[] args) {
		funcionarios Bruno = new funcionarios("Bruno Cafeo","(19)99999999","12345678901","13083-852");
		usuario Nisio = new usuario("Nisio José","(31)91234321","41932966780","13083-700");
		livro Java = new livro("The Java Programming Language","Prentice Hall","Ensino","Ken Arnold, James Gosling & David Holmes",true,2);
		periodico Folha = new periodico("Folha de São Paulo","Folha da Manhã S.A.","Jornal","13/08/2023",true,10);
		Emprestimo pedido01 = new Emprestimo(Nisio.getNome(),Java.getNome());
		System.out.println("Empréstimo realizado para " + Nisio.getNome() + " do livro " + Java.getNome());
        
        // Simulando a devolução do livro
        pedido01.marcarComoDevolvido();
        
        if (pedido01.getDevolvido()) {
            System.out.println("O livro " + Java.getNome() + " foi devolvido.");
        } else {
            System.out.println("O livro " + Java.getNome() + " ainda não foi devolvido.");
            }
	}
}