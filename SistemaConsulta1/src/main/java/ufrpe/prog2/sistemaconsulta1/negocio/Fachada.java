/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufrpe.prog2.sistemaconsulta1.negocio;

import java.util.ArrayList;
import ufrpe.prog2.sistemaconsulta1.dados.BancoDeDados;

public class Fachada {

    private static Fachada instance;

    private Fachada() {}

    public static Fachada getInstance() {
        if (instance == null) {
            instance = new Fachada();
        }
        return instance;
    }

    //MÉDICOS
    public void cadastrarMedico(String nome, String especialidade) throws Exception {
        if (nome == null || nome.isEmpty())
            throw new Exception("Nome do médico não pode ser vazio.");
        if (especialidade == null || especialidade.isEmpty())
            throw new Exception("Especialidade não pode ser vazia.");

        Medico m = new Medico(nome, especialidade);
        BancoDeDados.getInstance().getMedicosInternal().add(m);
    }

    public Medico buscarMedico(String nome) {
        for (Medico m : BancoDeDados.getInstance().getMedicosInternal()) {
            if (m.getNome().equalsIgnoreCase(nome)) {
                return m;
            }
        }
        return null;
    }

    public ArrayList<Medico> listarMedicos() {
        return BancoDeDados.getInstance().getMedicos();
    }

    //PACIENTES
    public void cadastrarPaciente(String nome, String cpf, String telefone, String email) throws Exception {
        if (nome == null || nome.isEmpty())
            throw new Exception("Nome não pode ser vazio.");
        if (cpf == null || cpf.isEmpty())
            throw new Exception("CPF não pode ser vazio.");
        Validador.validarCPF(cpf);
        Validador.validarEmail(email);
        Validador.validarTelefone(telefone);

        Paciente p = new Paciente(nome, cpf, telefone, email);
        p.validar();
        BancoDeDados.getInstance().getPacientesInternal().add(p);
    }

    public Paciente buscarPaciente(String nome) {
        for (Paciente p : BancoDeDados.getInstance().getPacientesInternal()) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Paciente> listarPacientes() {
        return BancoDeDados.getInstance().getPacientes();
    }

    //AGENDAMENTOS
    public Agendamento criarAgendamento(String nomeMedico, String nomePaciente, String data) throws Exception {
        if (data == null || data.isEmpty())
            throw new Exception("A data não pode estar vazia.");

        Medico medico = buscarMedico(nomeMedico);
        if (medico == null)
            throw new Exception("Médico não encontrado.");

        Paciente paciente = buscarPaciente(nomePaciente);
        if (paciente == null)
            throw new Exception("Paciente não encontrado.");

        Agendamento ag = new Agendamento(medico);
        ag.setData(data);
        ag.adicionar(paciente);

        BancoDeDados.getInstance().getAgendamentosInternal().add(ag);

        return ag;
    }

    public ArrayList<Agendamento> listarAgendamentos() {
        return BancoDeDados.getInstance().getAgendamentos();
    }
}
