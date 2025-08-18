package academy.devdojo.maratonajava.javacore.Oexception.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domains.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domains.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domains.Pessoa;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
