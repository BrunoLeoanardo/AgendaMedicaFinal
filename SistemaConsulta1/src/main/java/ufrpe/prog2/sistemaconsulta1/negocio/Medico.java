/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufrpe.prog2.sistemaconsulta1.negocio;

/**
 *
 * @author nini
 */
public class Medico extends Pessoa {
    private String especialidade;

    public Medico(String nome, String especialidade) {
        super(nome);
        this.especialidade = especialidade;
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    @Override
    public String exibirInfo() {
        return "Médico: " + nome + " | Especialidade: " + especialidade;
    }
}
