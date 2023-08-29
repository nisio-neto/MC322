package bem;

import java.util.List;
import RH.estudante_graduacao;
import RH.estudante_pos;
import RH.professor;

public class Relatorio {

    // Gera relatório de estatísticas de uso
    public static void gerarRelatorioEstatisticas(List<Emprestimo> emprestimos, List<Reserva> reservas) {
        int totalEmprestimos = emprestimos.size();
        int totalReservas = reservas.size();

        System.out.println("Relatório de Estatísticas de Uso");
        System.out.println("Total de Empréstimos: " + totalEmprestimos);
        System.out.println("Total de Reservas: " + totalReservas);
        System.out.println();
    }

    // Gera relatório financeiro de multas
    public static void gerarRelatorioFinanceiro(List<estudante_graduacao> estudantesGraduacao, List<estudante_pos> estudantesPos, List<professor> professores) {
        double totalMultas = 0;

        System.out.println("Relatório Financeiro de Multas");

        for (estudante_graduacao estudante : estudantesGraduacao) {
            double multaEstudante = estudante.calcularTotalMultas();
            totalMultas += multaEstudante;

            if (multaEstudante > 0) {
                System.out.println("Estudante de Graduação: " + estudante.getNome() + " - Multa: R$" + multaEstudante);
            }
        }

        for (estudante_pos estudante : estudantesPos) {
            double multaEstudante = estudante.calcularTotalMultas();
            totalMultas += multaEstudante;

            if (multaEstudante > 0) {
                System.out.println("Estudante de Pós-Graduação: " + estudante.getNome() + " - Multa: R$" + multaEstudante);
            }
        }

        for (professor prof : professores) {
            double multaProf = prof.calcularTotalMultas();
            totalMultas += multaProf;

            if (multaProf > 0) {
                System.out.println("Professor: " + prof.getNome() + " - Multa: R$" + multaProf);
            }
        }

        System.out.println("Total de Multas: R$" + totalMultas);
    }
}
