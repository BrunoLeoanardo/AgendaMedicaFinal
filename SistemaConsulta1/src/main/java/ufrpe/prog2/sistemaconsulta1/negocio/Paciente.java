/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufrpe.prog2.sistemaconsulta1.negocio;

/**
 *
 * @author nini
 */
public class Paciente extends Pessoa implements Validavel {
    private String cpf;
    private String telefone;
    private String email;

    public Paciente(String nome, String cpf, String telefone, String email) {
        super(nome);
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String exibirInfo() {
        return "Paciente: " + nome + " | CPF: " + cpf + " | Email: " + email;
    }
    
    @Override
    public void validar() throws DadosInvalidosException {
        Validador.validarCPF(cpf);
        Validador.validarEmail(email);
        Validador.validarTelefone(telefone);
    }
}
