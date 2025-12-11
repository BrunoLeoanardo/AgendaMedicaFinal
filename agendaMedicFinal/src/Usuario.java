public abstract class Usuario {
    private String nome;
    private String cpf;
    private String email;

    public Usuario(String nome, String cpf, String email) throws DadosInvalidosException {
        Validador.validarCPF(cpf);
        Validador.validarEmail(email);

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }

    public abstract void fazerLogin();
}

