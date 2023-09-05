package bem;

import java.util.List;
import java.time.LocalDate;
import bem.Multimidia;
import bem.Livro;
import bem.Emprestimo;
import bem.Renovação;
import bem.Reserva;
import bem.Data;
import bem.GeradorID;
import bem.CD;
import bem.DVD;
import bem.Ebook;
import bem.Outros;
import RH.estudante_graduacao;
import RH.estudante_pos;
import RH.professor;
import RH.membro;
import RH.funcionarios;
import bem.Periodo;


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
    
  
    // Gera relatório de atividades de membros
    public static void gerarRelatorioAtividadesMembros(List<membro> membros, Periodo periodo) {
        System.out.println("Relatório de Atividades de Membros");
        System.out.println("Período: " + periodo.toString());

        for (membro membro : membros) {
            int emprestimos = membro.getEmprestimosNoPeriodo(periodo);
            int devolucoes = membro.getDevolucoesNoPeriodo(periodo);
            double multas = membro.getMultasNoPeriodo(periodo);

            System.out.println("Membro: " + membro.getNome());
            System.out.println("Empréstimos: " + emprestimos);
            System.out.println("Devoluções: " + devolucoes);
            System.out.println("Multas: R$" + multas);
            System.out.println();
        }
    }
    
 // Gera relatório de uso de itens multimídia
    public static void gerarRelatorioUsoItensMultimidia(Multimidia multimidia, List<Emprestimo> emprestimos, List<Reserva> reservas) {
        System.out.println("Relatório de Uso de Itens Multimídia");

        // Itera sobre todos os tipos de mídia
        for (int tipo = 0; tipo < multimidia.getNumeroTotalItens(); tipo++) {
            // Verifica se o tipo de mídia possui itens
            if (multimidia.getNumItens(tipo) > 0) {
                String nomeTipo = multimidia.getNomeTipo(tipo);

                System.out.println("Tipo de Mídia: " + nomeTipo);

                // Itera sobre os itens desse tipo de mídia
                for (int i = 0; i < multimidia.getNumItens(tipo); i++) {
                    String itemId = multimidia.getId(tipo, i);
                    int emprestimosCount = Emprestimo.calcularEmprestimos(emprestimos, itemId);
                    int reservasCount = Reserva.calcularReservas(reservas, itemId);

                    System.out.println("Item: " + multimidia.getTitulo(tipo, i));
                    System.out.println("Empréstimos: " + emprestimosCount);
                    System.out.println("Reservas: " + reservasCount);
                    System.out.println();
                }
            }
        }
    }

    
    // Relatório de Multas e Pagamentos
    public static void gerarRelatorioMultasPagamentos(List<membro> membros, Periodo periodo) {
        System.out.println("Relatório de Multas e Pagamentos no Período: " + periodo.toString());
        
        for (membro membro : membros) {
            double multasNoPeriodo = membro.getMultasNoPeriodo(periodo);
            double pagamentos = membro.getTotalPagamentos();
            
            if (multasNoPeriodo > 0 || pagamentos > 0) {
                System.out.println("Membro: " + membro.getNome());
                System.out.println("Multas acumuladas no período: R$" + multasNoPeriodo);
                System.out.println("Pagamentos efetuados: R$" + pagamentos);
                System.out.println();
            }
        }
    }

 // Relatório de Disponibilidade de Itens
    public static void gerarRelatorioDisponibilidadeItens(List<Multimidia> itens) {
        System.out.println("Relatório de Disponibilidade de Itens");

        for (Multimidia multimidia : itens) {
            for (int tipo = 0; tipo < multimidia.getQuantidadeTipos(); tipo++) {
                int quantidadeDisponivel = multimidia.getQuantidadeDisponivel(tipo);

                if (quantidadeDisponivel > 0) {
                    String nomeTipo = multimidia.getNomeTipo(tipo);

                    System.out.println("Tipo de Mídia: " + nomeTipo);
                    System.out.println("Item: " + multimidia.getTitulo(tipo, 0)); // Suponha que pegamos o primeiro item
                    System.out.println("Quantidade disponível: " + quantidadeDisponivel);
                    System.out.println();
                }
            }
        }
    }


    // Estatísticas de Uso por Perfil de Membro
    public static void gerarEstatisticasUsoPerfilMembro(List<membro> membros) {
        System.out.println("Estatísticas de Uso por Perfil de Membro");
        
        for (membro membro : membros) {
            String perfil = membro.getPerfil().toString();
            int emprestimos = membro.getTotalEmprestimos();
            double multas = membro.calcularTotalMultas();
            
            System.out.println("Perfil: " + perfil);
            System.out.println("Número médio de empréstimos: " + (emprestimos / membros.size()));
            System.out.println("Multas acumuladas: R$" + multas);
            System.out.println();
        }
    }

 // Relatório de Itens Mais Populares
    public static void gerarRelatorioItensMaisPopulares(List<Multimidia> itens) {
        System.out.println("Relatório de Itens Mais Populares");

        // Classifique os itens com base no número total de empréstimos e reservas
        itens.sort((item1, item2) -> {
            int totalItem1 = item1.getTotalEmprestimos() + item1.getReservas();
            int totalItem2 = item2.getTotalEmprestimos() + item2.getReservas();
            return Integer.compare(totalItem2, totalItem1); // Classifique em ordem decrescente
        });

        for (int i = 0; i < Math.min(10, itens.size()); i++) {
            Multimidia item = itens.get(i);
            int totalEmprestimos = item.getTotalEmprestimos();
            int totalReservas = item.getReservas();

            System.out.println("Item: " + item.getTitulo());
            System.out.println("Total de empréstimos: " + totalEmprestimos);
            System.out.println("Total de reservas: " + totalReservas);
            System.out.println();
        }
    }
}
