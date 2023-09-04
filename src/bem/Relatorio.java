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
    
    public class Periodo {
        private LocalDate dataInicio;
        private LocalDate dataFim;

        public Periodo(LocalDate dataInicio, LocalDate dataFim) {
            this.dataInicio = dataInicio;
            this.dataFim = dataFim;
        }
        
        public LocalDate getDataInicio() {
            return dataInicio;
        }

        public LocalDate getDataFim() {
            return dataFim;
        }

        @Override
        public String toString() {
            return dataInicio + " a " + dataFim;
        }
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
    public static void gerarRelatorioUsoItensMultimidia(List<Multimidia> itens) {
        System.out.println("Relatório de Uso de Itens Multimídia");

        for (Multimidia item : itens) {
            int emprestimos = item.getEmprestimo();
            int reservas = item.getReserva();

            System.out.println("Item: " + item.getTitulo());
            System.out.println("Empréstimos: " + emprestimos);
            System.out.println("Reservas: " + reservas);
            System.out.println();
        }
    }

    // Relatório de Multas e Pagamentos
    public static void gerarRelatorioMultasPagamentos(List<membro> membros) {
        System.out.println("Relatório de Multas e Pagamentos");
        
        for (membro membro : membros) {
            double multas = membro.calcularTotalMultas();
            double pagamentos = membro.getTotalPagamentos();
            
            if (multas > 0 || pagamentos > 0) {
                System.out.println("Membro: " + membro.getNome());
                System.out.println("Multas acumuladas: R$" + multas);
                System.out.println("Pagamentos efetuados: R$" + pagamentos);
                System.out.println();
            }
        }
    }

    // Relatório de Disponibilidade de Itens
    public static void gerarRelatorioDisponibilidadeItens(List<Multimidia> itens) {
        System.out.println("Relatório de Disponibilidade de Itens");
        
        for (Multimidia item : itens) {
            int disponiveis = item.getQuantidadeDisponivel();
            
            if (disponiveis > 0) {
                System.out.println("Item: " + item.getTitulo());
                System.out.println("Quantidade disponível: " + disponiveis);
                System.out.println();
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
        
        itens.sort((item1, item2) -> Integer.compare(item2.getTotalEmprestimo(), item1.getTotalEmprestimo()));

        for (int i = 0; i < Math.min(10, itens.size()); i++) {
            Multimidia item = itens.get(i);
            System.out.println("Item: " + item.getTitulo());
            System.out.println("Total de empréstimos: " + item.getTotalEmprestimo());
            System.out.println();
        }
    }
}

