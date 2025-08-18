package academy.devdojo.maratonajava.javacore.Oexception.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domains.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            Logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void Logar() throws LoginInvalidoException {

        Scanner teclado = new Scanner(System.in);

        String userNameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuário");
        String userNameDigitado = teclado.nextLine();

        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();

        if (!userNameDB.equals(userNameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
