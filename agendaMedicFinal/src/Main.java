public class Main {
    public static void main(String[] args) {

        try {
            Medico Ana = new Medico("Ana","12314312343", "Ginecologista","ana@medico.com");
            Medico Bruno = new Medico("Bruno","09889076543", "Cardiologista","bruno@medico.com");

            Paciente paciente1 = new Paciente("Carlos","11111111111","8112345678","aaaaaa@gmail.com");
            Paciente paciente2 = new Paciente("Antonio","22222222222","8123456789","bbbbbb@gmail.com");
            Paciente paciente3 = new Paciente("Pedro","33333333333","8145678901","ccccc@gmail.com");
            Paciente paciente4 = new Paciente("Joao","44444444444","8143232323","dddddd@gmail.com");

            Agendamento agendamento1 = new Agendamento(Ana);
            agendamento1.setData("17/12/2025");
            agendamento1.adicionar(paciente3);
            agendamento1.adicionar(paciente4);
            agendamento1.apresentarListaDePacientes();

            Agendamento agendamento2 = new Agendamento(Bruno);
            agendamento2.setData("20/12/2025");
            agendamento2.adicionar(paciente1);
            agendamento2.adicionar(paciente2);
            agendamento2.apresentarListaDePacientes();

        } catch (DadosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        }

    }
}
