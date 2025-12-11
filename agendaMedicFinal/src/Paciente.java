public class Paciente extends Usuario {
    private String telefone;

    public Paciente(String nome, String cpf, String telefone, String email) throws DadosInvalidosException {
        super(nome, cpf, email);
        Validador.validarTelefone(telefone);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws DadosInvalidosException {
        Validador.validarTelefone(telefone);
        this.telefone = telefone;
    }

    @Override
    public void fazerLogin() {
        System.out.println("login Paciente executado com sucesso!");
    }
}

