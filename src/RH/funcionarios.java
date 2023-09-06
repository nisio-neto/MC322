package RH;

public class funcionarios extends membro {
    // Atributos da classe
    private String cargo;
    private boolean Multa; // Indica se o usuário recebeu multa
    private int DiasMulta; // indica dias de multa do usuário
    private NivelAcesso nivelAcesso;

    // Construtor da Classe
    public funcionarios(String nome, String telefone, String CPF, String endereço, String dataInscricao, String cargo, boolean Multa, int DiasMulta, NivelAcesso nivelAcesso,Perfil perfil) {
        super(nome, telefone, CPF, endereço, dataInscricao,perfil);
        this.cargo = cargo;
        this.Multa = Multa;
        this.DiasMulta = DiasMulta;
        this.nivelAcesso = nivelAcesso;
    }

    // Métodos da classe
    public void recadastraFuncionario(String nome, String telefone, String CPF, String endereço, String dataInscricao, String cargo, NivelAcesso nivelAcesso) {
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setendereço(endereço);
        this.setCPF(CPF);
        this.setDataInscricao(dataInscricao);
        this.setCargo(cargo);
        this.setNivelAcesso(nivelAcesso); // Adicionando o nível de acesso
    }

    public void aplicaMulta(boolean Multa, int DiasMulta) {
        this.setMulta(Multa);
        this.setDiasMulta(DiasMulta);
    }

    public void retiraMulta() {
        this.setMulta(false);
        this.setDiasMulta(0);
    }

    public double calcularTotalMultas() {
        double valorMultaPorDia = 0.75; // Valor da multa por dia de atraso
        return getDiasMulta() * valorMultaPorDia;
    }

    // Getters e Setters
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setMulta(boolean Multa) {
        this.Multa = Multa;
    }

    public boolean isMulta() {
        return Multa;
    }

    public void setDiasMulta(int DiasMulta) {
        this.DiasMulta = DiasMulta;
    }

    public int getDiasMulta() {
        return DiasMulta;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    // Enum para o nível de acesso
    public enum NivelAcesso {
        ADMINISTRADOR,
        ATENDENTE,
        GERENTE
    }
}
