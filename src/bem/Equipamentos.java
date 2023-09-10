package bem;

public class Equipamentos {
    public static void main(String[] args) {
        // Criando um equipamento de informática
        Informatica computador = new Informatica("PC", "Dell", "Windows", CategoriaEquipamento.INFORMATICA);

        // Criando um equipamento audiovisual
        Audiovisual camera = new Audiovisual("Câmera DSLR", "Canon", CategoriaEquipamento.AUDIOVISUAL);

        // Criando um equipamento de impressão
        Impressao impressora = new Impressao("Impressora Laser", "HP", CategoriaEquipamento.IMPRESSAO);

        // Exibindo informações sobre os equipamentos
        System.out.println("Detalhes do Equipamento de Informática:");
        System.out.println("Tipo: " + computador.getTipo());
        System.out.println("Marca: " + computador.getMarca());
        System.out.println("Sistema Operacional: " + computador.getSistemaOperacional());
        System.out.println("Categoria: " + computador.getCategoria());

        System.out.println("\nDetalhes do Equipamento Audiovisual:");
        System.out.println("Tipo: " + camera.getTipo());
        System.out.println("Marca: " + camera.getMarca());
        System.out.println("Categoria: " + camera.getCategoria());

        System.out.println("\nDetalhes do Equipamento de Impressão:");
        System.out.println("Tipo: " + impressora.getTipo());
        System.out.println("Marca: " + impressora.getMarca());
        System.out.println("Categoria: " + impressora.getCategoria());
    }
}

enum CategoriaEquipamento {
    INFORMATICA,
    AUDIOVISUAL,
    IMPRESSAO
}

class Equipamento {
    private String tipo;
    private String marca;
    private CategoriaEquipamento categoria;

    public Equipamento(String tipo, String marca, CategoriaEquipamento categoria) {
        this.tipo = tipo;
        this.marca = marca;
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public CategoriaEquipamento getCategoria() {
        return categoria;
    }
}

class Informatica extends Equipamento {
    private String sistemaOperacional;

    public Informatica(String tipo, String marca, String sistemaOperacional, CategoriaEquipamento categoria) {
        super(tipo, marca, categoria);
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
}

class Audiovisual extends Equipamento {
    public Audiovisual(String tipo, String marca, CategoriaEquipamento categoria) {
        super(tipo, marca, categoria);
    }
}

class Impressao extends Equipamento {
    public Impressao(String tipo, String marca, CategoriaEquipamento categoria) {
        super(tipo, marca, categoria);
    }
}


