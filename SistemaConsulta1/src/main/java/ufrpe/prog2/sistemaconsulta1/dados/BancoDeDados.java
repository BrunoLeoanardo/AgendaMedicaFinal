/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ufrpe.prog2.sistemaconsulta1.dados;

import java.util.ArrayList;
import ufrpe.prog2.sistemaconsulta1.negocio.Medico;
import ufrpe.prog2.sistemaconsulta1.negocio.Paciente;
import ufrpe.prog2.sistemaconsulta1.negocio.Agendamento;


// Banco de dados em memória usando Singleton.
 
public class BancoDeDados {

    private static BancoDeDados instance;

    private ArrayList<Medico> medicos;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Agendamento> agendamentos;

    private BancoDeDados() {
        medicos = new ArrayList<>();
        pacientes = new ArrayList<>();
        agendamentos = new ArrayList<>();
    }

    public static BancoDeDados getInstance() {
        if (instance == null) {
            instance = new BancoDeDados();
        }
        return instance;
    }

    // MÉDICOS
    
    public void adicionarMedico(Medico m) {
        medicos.add(m);
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    // PACIENTES
    
    public void adicionarPaciente(Paciente p) {
        pacientes.add(p);
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    // AGENDAMENTOS
    public void adicionarAgendamento(Agendamento a) {
        agendamentos.add(a);
    }

    public ArrayList<Agendamento> getAgendamentos() {
        return agendamentos;
    }
    // Métodos internos para uso da Fachada
    public ArrayList<Medico> getMedicosInternal() {
        return medicos;
    }

    public ArrayList<Paciente> getPacientesInternal() {
        return pacientes;
    }

    public ArrayList<Agendamento> getAgendamentosInternal() {
        return agendamentos;
    }
}
