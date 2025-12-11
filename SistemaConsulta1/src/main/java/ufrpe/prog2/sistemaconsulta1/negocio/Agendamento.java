/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufrpe.prog2.sistemaconsulta1.negocio;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um agendamento de consultas.
 */
public class Agendamento {

    private String data;
    private List<Paciente> pacientes;
    private Medico medico;

    public Agendamento(Medico medico) {
        this.pacientes = new ArrayList<>();
        this.medico = medico;
        this.data = "";
    }

    public void adicionar(Paciente p) {
        if (p == null) {
            System.out.println("Paciente inválido.");
            return;
        }
        pacientes.add(p);
        System.out.println("Paciente " + p.getNome() + " adicionado ao agendamento.");
    }

    public boolean remover(String cpf) {
        for (Paciente p : pacientes) {
            if (p.getCpf().equals(cpf)) {
                pacientes.remove(p);
                System.out.println(p.getNome() + " removido com sucesso!");
                return true;
            }
        }
        System.out.println("Nenhum paciente encontrado com CPF: " + cpf);
        return false;
    }

    public Paciente pesquisar(String cpf) {
        for (Paciente p : pacientes) {
            if (p.getCpf().equals(cpf)) {
                System.out.println("Paciente encontrado:");
                System.out.println("Nome: " + p.getNome());
                System.out.println("Telefone: " + p.getTelefone());
                System.out.println("Email: " + p.getEmail());
                return p;
            }
        }
        System.out.println("Paciente não encontrado com CPF: " + cpf);
        return null;
    }

    public void apresentarListaDePacientes() {
        System.out.println("Data: " + data +
                " | Médico: " + medico.getNome() +
                " (" + medico.getEspecialidade() + ")");
        System.out.println("Pacientes agendados:");

        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
            return;
        }

        for (int i = 0; i < pacientes.size(); i++) {
            Paciente p = pacientes.get(i);
            System.out.println((i + 1) + " - " + p.getNome() +
                    " | CPF: " + p.getCpf() +
                    " | Email: " + p.getEmail());
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    // ========================= TO STRING PARA JLIST =========================
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data: ").append(data)
          .append(" | Médico: ").append(medico.getNome())
          .append(" (").append(medico.getEspecialidade()).append(")")
          .append(" | Pacientes: ");

        if (pacientes.isEmpty()) {
            sb.append("Nenhum");
        } else {
            for (int i = 0; i < pacientes.size(); i++) {
                sb.append(pacientes.get(i).getNome());
                if (i < pacientes.size() - 1) sb.append(", ");
            }
        }

        return sb.toString();
    }
}

