package academy.devdojo.maratonajava.javacore.Oexception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    // exemplo de exception. esse erro é lançado pelo próprio java antes mesmo de compilar o código, pois é um erro que precisa de tratamento.
    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");

        // o tratamento exigido por uma exception que não permite a compilação do código é o uso de um bloco try/catch.
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("arquivo criado " + isCriado);

            //no catch, o erro se torna um "tipo" e deve ser usado com uma variável. neste caso temos a variável de referência "e" do tipo "IOException". como é feito quando se vai instanciar uma classe.
        }catch (IOException e){

            //imprime tudo o que aconteceu. todos os erros.
            e.printStackTrace();
        }
    }
}
