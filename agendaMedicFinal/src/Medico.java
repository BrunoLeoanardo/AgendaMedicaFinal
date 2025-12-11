public class Medico extends Usuario {

    private String especialidade;

    public Medico(String nome, String cpf, String especialidade, String email) throws DadosInvalidosException {
        super(nome, cpf, email);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() { return especialidade; }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void fazerLogin() {
        System.out.println("login Medico executado com sucesso!");
    }

    public String getCpfmedico() { return getCpf(); }

    public String getEmailmedico() { return getEmail(); }
}

