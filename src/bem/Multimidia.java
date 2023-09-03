package bem;

public class Multimidia {

    private DVD[] dvds;
    private Livro[] livros;
    private Ebook[] ebooks;
    private CD[] cds;
    private Outros[] outros;
    private int[] numItem;
    private boolean[][] disponivel;
    private int[][] unidades;
    private int[][] total;

    public Multimidia(int max_itens) {
        dvds = new DVD[max_itens];
        livros = new Livro[max_itens];
        ebooks = new Ebook[max_itens];
        cds = new CD[max_itens];
        outros = new Outros[max_itens];
        disponivel = new boolean[5][max_itens];  // 5 tipos de mídia (DVD, Livro, Ebook, CD, Outros)
        unidades = new int[5][max_itens];
        numItem = new int[5];
        total = new int[5][max_itens];
    }

    public void adicionaDVD(String nome, String diretor, String estudio, String genero, int ano, String edicao, String capa, String sinopse, String elenco, String duracao, String idioma, String conservacao) {
        DVD dvd = new DVD(nome, diretor, estudio, genero, ano, edicao, capa, sinopse, elenco, duracao, idioma, conservacao);
        dvds[numItem[0]] = dvd;
        unidades[0][numItem[0]] = unidades[0][numItem[0]];
        disponivel[0][numItem[0]] = disponivel[0][numItem[0]];
        total[0][numItem[0]] = numItem[0] + 1; // Atualiza o total de DVDs
        numItem[0]++;
    }

    public void adicionaLivro(String nome, String autor, String editora, String genero, int ano, String edicao, String capa, String sinopse, String isbn, String local, String conservacao) {
        Livro livro = new Livro(nome, autor, editora, genero, ano, edicao, capa, sinopse, isbn, local, conservacao);
        livros[numItem[1]] = livro;
        unidades[1][numItem[1]] = unidades[1][numItem[1]];
        disponivel[1][numItem[1]] = disponivel[1][numItem[1]];
        total[1][numItem[1]] = numItem[1] + 1; // Atualiza o total de Livros
        numItem[1]++;
    }

    public void adicionaEbook(String nome, String autor, String editora, String genero, int ano, String edicao, String capa, String sinopse, String formato, String formatoArquivo, String url, String requisitos, String dataDisponibilidade) {
        Ebook ebook = new Ebook(nome, autor, editora, genero, ano, edicao, capa, sinopse, formato, formatoArquivo, url, requisitos, dataDisponibilidade);
        ebooks[numItem[2]] = ebook;
        unidades[2][numItem[2]] = unidades[2][numItem[2]];
        disponivel[2][numItem[2]] = disponivel[2][numItem[2]];
        total[2][numItem[2]] = numItem[2] + 1; // Atualiza o total de Ebooks
        numItem[2]++;
    }

    public void adicionaCD(String nome, String artista, String gravadora, String genero, int ano, String sinopse, String capa, String faixas, String duracao, String conservacao) {
        CD cd = new CD(nome, artista, gravadora, genero, ano, sinopse, capa, faixas, duracao, conservacao);
        cds[numItem[3]] = cd;
        unidades[3][numItem[3]] = unidades[3][numItem[3]];
        disponivel[3][numItem[3]] = disponivel[3][numItem[3]];
        total[3][numItem[3]] = numItem[3] + 1; // Atualiza o total de CDs
        numItem[3]++;
    }

    public void adicionaOutros(String nome, String autor, String editora, String genero, int ano, String edicao, String capa, String sinopse, String local, String conservacao, String tipo, String formato) {
        Outros outro = new Outros(nome, autor, editora, genero, ano, edicao, capa, sinopse, local, conservacao, tipo, formato);
        outros[numItem[4]] = outro;
        unidades[4][numItem[4]] = unidades[4][numItem[4]];
        disponivel[4][numItem[4]] = disponivel[4][numItem[4]];
        total[4][numItem[4]] = numItem[4] + 1; // Atualiza o total de Outros
        numItem[4]++;
    }



    // Métodos para remover itens
    public void removeDVD(int indice) {
        dvds[indice] = null;
        disponivel[0][indice] = false;
        unidades[0][indice] = 0;
        numItem[0]--;
    }

    public void removeLivro(int indice) {
        livros[indice] = null;
        disponivel[1][indice] = false;
        unidades[1][indice] = 0;
        numItem[1]--;
    }

    public void removeEbook(int indice) {
        ebooks[indice] = null;
        disponivel[2][indice] = false;
        unidades[2][indice] = 0;
        numItem[2]--;
    }

    public void removeCD(int indice) {
        cds[indice] = null;
        disponivel[3][indice] = false;
        unidades[3][indice] = 0;
        numItem[3]--;
    }

    public void removeOutros(int indice) {
        outros[indice] = null;
        disponivel[4][indice] = false;
        unidades[4][indice] = 0;
        numItem[4]--;
    }

    // Outros getters e setters
    public DVD[] getDVDs() {
        return dvds;
    }

    public CD[] getCDs() {
        return cds;
    }

    public Ebook[] getEbooks() {
        return ebooks;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public Outros[] getOutros() {
        return outros;
    }

    public boolean[][] getDisponibilidade() {
        return disponivel;
    }

    public void setDisponibilidade(boolean[][] disponivel) {
        this.disponivel = disponivel;
    }

    public int[][] getUnidades() {
        return unidades;
    }

    public void setUnidades(int[][] unidades) {
        this.unidades = unidades;
    }
}
