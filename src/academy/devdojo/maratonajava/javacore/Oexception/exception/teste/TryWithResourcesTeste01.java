package academy.devdojo.maratonajava.javacore.Oexception.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domains.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domains.Leitor2;

import java.io.*;

public class TryWithResourcesTeste01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {

        // TryWithResources: inicializa uma variável dentro do próprio catch.
        // o próprio try está tomando conta de fechar a conecção da variável de referência (chamando o METODO close criado). essas conecções são fechadas na ordem inversa que foram chamadas. o primeiro arquivo é o ultimo a ser fechado e o último é o primeiro a ser fechado.
        // REGRA: só pode colocar objetos/variáveis de referência dentro do TryWithResources que implementem a interface Closeable ou AutoCloseable.
        // com o TryWithResources, posso usar o try sem o catch. mas preciso lançar a exception no metodo. "throws IOException" por ex.
        // posso usar quantas variáveis eu quiser. basta que elas implementem a interface Closeable ou AutoCloseable.
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // sem TryWithResources. fica muito verboso e "feio".
    public static void lerArquivo2() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
