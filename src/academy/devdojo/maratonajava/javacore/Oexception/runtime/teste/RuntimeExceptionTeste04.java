package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();

            // capturando várias exceções com vários catch.
            // quando uma exception é lançada (neste caso são exceptions específicas), o próprio java vai checando em qual catch se encaixa e, quando encontra, executa seu bloco interno.
            // quando a exception lançada é genérica como o RuntimeException, o java gera erro de compilação pois não sabe em qual catch se encaixar.
            // EXCEPTIONS MAIS GENÉRICAS SEMPRE DEVEM VIR NO FINAL. caso o catch com RuntimeException venha no início, os demais nunca serão verificados pois RuntimeException é genérico e sempre cairá nele.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("dentro do ArithmeticException");

            // catch adicionado caso a exception lançada seja genérica como o RuntimeException
        } catch (RuntimeException e) {
            System.out.println("dentro do RuntimeException");
        }


        try {
            talvezLanceException();

            // exceptions que não estão na mesma linha de herança (ou seja, não heranças uma da outra. EX: FileNotFoundException é filha de IOException) podem ser colocados dentro do mesmo catch separados por "|" (pipe)
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }

//        try {
//            talvezLanceException2();
//
//            // exceptions que não estão na mesma linha de herança (ou seja, não heranças uma da outra. EX: FileNotFoundException é filha de IOException) podem ser colocados dentro do mesmo catch separados por "|" (pipe)
//            //EXEMPLO DE EXCEPTION NA MESMA LINHA DE HERANÇA gera erro
//        } catch (SQLException | FileNotFoundException | IOException e) {
//            e.printStackTrace();
//        }
    }

    // é possível lançar/avisa mais de uma exception. basta separar por vírgula.
    private static void talvezLanceException() throws SQLException, FileNotFoundException {
    }

    // nem faz sentido lançar FileNotFoundException e IOException pois um é filho do outro.
    private static void talvezLanceException2() throws SQLException, FileNotFoundException, IOException {
    }
}
