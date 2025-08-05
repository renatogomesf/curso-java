package academy.devdojo.maratonajava.javacore.Oexception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste02 {
    public static void main(String[] args) {

        // agora é obrigatório o tratamento do erro aqui onde o metodo é chamado por ser uma exception.
        try {
            criarNovoArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("finalizado");
    }

    // throws IOException: é um aviso para quem usar o metodo. por ser uma Excption, o tratamento do erro é OBRIGATÓRIO e lança essa responsabilidade de tratamento do erro para quem chamar ou onde esse metodo for chamado. significa que não precis de um try/cathc dentro do metodo fazendo o tratamento.
    // mas não é uma regra. ainda pode usar o try/catch mesmo assim dentro do metodo mesmo com o uso do throws IOException.
    // depende muito de projeto para projeto... mas o uso do throws IOException (lançar uma exception) só faz mais sentido caso o metodo seja público. com o metodo privado, faz mais sentido o uso do try/catch mesmo.
    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();

            // metodo meio que hibrido. o metodo já faz o tratamento do erro mas ao mesmo tempo relança esse erro para onde o metodo foi chamado. o que torna obrigatório o uso do throws IOException. ex: o erro tratado aqui dentro do metodo é para uso do back-end e sendo relançado para o front-end pra uso em um aviso, por exemplo.
            throw e;

            // ou, ao invés de retornar uma Exception "throw e", retorna uma Runtime para dar a opção de tratar ou não o erro. neste caso, o uso do throws IOException deixa de ser obrigatório.
            //throw new RuntimeException("Problema ao criar arquivo");
        }
    }
}
