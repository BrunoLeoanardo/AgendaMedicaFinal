import java.util.ArrayList;

public class Agendamento {
    private String data;
    private ArrayList<Paciente> pacientes;
    private Medico medico;

    public Agendamento(Medico medico){
        this.pacientes = new ArrayList<>();
        this.data = "";
        this.medico = medico;
    }

    public void adicionar(Paciente p){
        pacientes.add(p);
    }

    public void remover(String cpf){
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getCpf().equals(cpf)) {
                System.out.println(pacientes.get(i).getNome() + " removido com sucesso!");
                pacientes.remove(i);
                break;
            }
        }
    }

    public void pesquisar(String cpf){
        for (Paciente p : pacientes) {
            if (p.getCpf().equals(cpf)) {
                System.out.println(p.getNome());
                System.out.println(p.getTelefone());
                System.out.println(p.getEmail());
                break;
            }
        }
    }

    public void setData(String data) {
        this.data = data;
    }

    public void apresentarListaDePacientes() {
        System.out.println("\n=== Agendamento ===");
        System.out.println("Data: " + data);
        System.out.println("Médico: " + medico.getNome() + " (" + medico.getEspecialidade() + ")");
        System.out.println("Pacientes:");

        for (int i = 0; i < pacientes.size(); i++) {
            Paciente p = pacientes.get(i);
            System.out.println((i+1) + " - " + p.getNome() + ", CPF: " + p.getCpf() + ", Email: " + p.getEmail());
        }
    }
}

