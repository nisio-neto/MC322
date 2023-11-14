package main;
import bem.Multimidia;

public class CSingleton {
    private static CSingleton instanciaUnica;
    private Multimidia multimidia;

    // Construtor privado para evitar a criação de instâncias diretamente
    private CSingleton() {
        // Inicialização da instância (se necessário)
    	this.multimidia = new Multimidia(100, 5); // Exemplo de parâmetros (max_itens, numTipos)
    }

    // Função para obter a instância única da classe
    public static CSingleton obterInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new CSingleton();
        }
        return instanciaUnica;
    }

    // Método para obter a instância da classe Multimidia
    public Multimidia obterMultimidia() {
        return multimidia;
    }

    // Métodos para realizar operações na instância única (adapte conforme necessário)
    public void adicionarItemMultimidia(ItemMultimidia item) {
        multimidia.adicionarItem(item);
    }

    public void removerItemMultimidia(ItemMultimidia item) {
        multimidia.removerItem(item);
    }

    public List<ItemMultimidia> obterTodosItensMultimidia() {
        return multimidia.obterTodosItens();
    }
}
