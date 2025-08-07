package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

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
    }
}
