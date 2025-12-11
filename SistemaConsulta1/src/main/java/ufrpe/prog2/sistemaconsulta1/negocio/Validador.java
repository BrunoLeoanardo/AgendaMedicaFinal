/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufrpe.prog2.sistemaconsulta1.negocio;

/**
 *
 * @author nini
 */
public class Validador {
    public static void validarCPF(String cpf) throws DadosInvalidosException {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new DadosInvalidosException(
                    "CPF inválido: deve conter exatamente 11 dígitos numéricos."
            );
        }
    }

    public static void validarEmail(String email) throws DadosInvalidosException {
        if (email == null || !email.matches("^[\\w\\.-]+@[\\w\\.-]+\\.com$")) {
            throw new DadosInvalidosException(
                    "Email inválido: deve conter '@' e terminar em '.com'."
            );
        }
    }

    public static void validarTelefone(String telefone) throws DadosInvalidosException {
        if (telefone == null || !telefone.matches("\\d{2}\\d{9}")) {
            throw new DadosInvalidosException(
                    "Telefone inválido: deve ser DDD (2 dígitos) + número (9 dígitos)."
            );
        }
    }
}
