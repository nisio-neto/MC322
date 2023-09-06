package bem;

import bem.GeradorID;
import bem.Data;
import RH.membro;

public class Renovação {
    private String livro;
    private membro Membro;
    private String id;
    private Data dataRenovacao;
    private Data dataRenovado;
    private boolean renovado;
    private boolean disponivelParaRenovacao;

    public Renovação(String livro, membro Membro) {
        this.livro = livro;
        this.Membro = Membro;
        this.dataRenovacao = new Data();
        this.dataRenovado = null;
        this.renovado = false;
        GeradorID gerador = new GeradorID();
        this.id = gerador.gerarId();
        this.disponivelParaRenovacao = true; // Por padrão, a cópia está disponível para renovação
    }

 // Método para renovar
    public void renovar() {
        if (!renovado) {
        	 if (disponivelParaRenovacao) { // Verifica se a cópia está disponível para renovação
                 int diasRenovacao = getPrazoRenovacao(); // Obtém o prazo de renovação com base no perfil do usuário

                 if (dataRenovado != null) {
                     dataRenovado.adicionarDias(diasRenovacao); // Adiciona os dias de renovação à data atual
                     renovado = true;
                     System.out.println("Renovação realizada para " + Membro + " do livro " + livro);
                     disponivelParaRenovacao = false; // Marca a cópia como não disponível para renovação após a renovação
                 } else {
                     System.out.println("Não é possível renovar devido à data de renovação não estar definida.");
                 }
             } else {
                 System.out.println("A cópia não está disponível para renovação.");
             }
         } else {
             System.out.println("Este empréstimo já foi renovado anteriormente.");
         }
     }
    


 // Método privado para obter o prazo de renovação com base no perfil do usuário
    private int getPrazoRenovacao() {
        if (Membro.getPerfil() == membro.Perfil.ESTUDANTE_GRADUACAO) {
            return 15; // Prazo de renovação para estudantes de graduação
        } else if (Membro.getPerfil() == membro.Perfil.ESTUDANTE_POS) {
            return 20; // Prazo de renovação para estudantes de pós-graduação
        } else if (Membro.getPerfil() == membro.Perfil.PROFESSOR) {
            return 30; // Prazo de renovação para professores
        } else if (Membro.getPerfil() == membro.Perfil.FUNCIONARIO) {
            return 20; // Prazo de renovação para funcionários
        } else {
            return 0; // Perfil desconhecido
        }
    }
    public String getLivro() {
        return livro;
    }

    public membro getmembro() {
        return Membro;
    }

    public Data getDataRenovacao() {
        return dataRenovacao;
    }

    public Data getDataRenovado() {
        return dataRenovado;
    }

    public boolean isRenovado() {
        return renovado;
    }
}