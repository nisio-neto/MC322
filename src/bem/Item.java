package bem;

import java.util.ArrayList;
import java.util.List;
import RH.Comentario;

public class Item {
    private String nome;
    private String autorArtista;
    private String editoraGravadora;
    private String genero;
    private int ano;
    private String capa;
    private String id;
    private String sinopse;
    private List<Comentario> comentarios = new ArrayList<>(); // Lista de comentários

    public Item(String nome, String autorArtista, String editoraGravadora, String genero, int ano, String capa, String sinopse) {
        this.nome = nome;
        this.autorArtista = autorArtista;
        this.editoraGravadora = editoraGravadora;
        this.genero = genero;
        this.ano = ano;
        this.capa = capa;
        this.sinopse = sinopse;
        GeradorID gerador = new GeradorID(); // gerar ID do empréstimo
        this.id = gerador.gerarId();
    }

    public void adicionarComentario(String membroId, String texto) {
        Comentario comentario = new Comentario(membroId, this.id, texto);
        comentarios.add(comentario);
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }
    
    // Getters e Setters para os atributos em comum
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutorArtista() {
        return autorArtista;
    }

    public void setAutorArtista(String autorArtista) {
        this.autorArtista = autorArtista;
    }

    public String getEditoraGravadora() {
        return editoraGravadora;
    }

    public void setEditoraGravadora(String editoraGravadora) {
        this.editoraGravadora = editoraGravadora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}

