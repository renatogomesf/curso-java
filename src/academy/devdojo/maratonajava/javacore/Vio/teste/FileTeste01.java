package academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;

public class FileTeste01 {
    public static void main(String[] args) {
        // trabalhando com arquivos.

        // new File(): cria/inicializa o objeto da file e exige um pathname para criar um arquivo... para criar o arquivo onde o programa está rodando, basta colocar o nome do arquivo (ex: file.txt). caso eu deseje salvar em algum canto específico, eu preciso passar o path/caminho do local onde será salvo (ex: C:\Users\renat\Desktop\curso-java). CUIDADO POIS É PRECISO USAR DUAS CONTRA-BARRA PARA USAR ESSE FORMATO.
        File file = new File("file.txt");

        // para criar realmente a file, usa-se metodo createNewFile(). como lança um erro, precisa tratar esse erro.
        // createNewFile(): retorna um boolean. caso o arquivo seja criado, ele retorna TRUE. caso contrário, retorna FALSE. caso o arquivo já exista, ele não sobrescreve. então retorna false.
        try {
            // para criar realmente a file, usa-se metodo createNewFile(). como lança um erro, precisa tratar esse erro.
            // createNewFile(): retorna um boolean. caso o arquivo seja criado, ele retorna TRUE. caso contrário, retorna FALSE. caso o arquivo já exista, ele não sobrescreve. então retorna false.
            boolean isCreated = file.createNewFile();
            System.out.println("created: " + isCreated);

            // getPath(): retorna o nome e extenção do arquivo. neste caso, file.txt
            System.out.println("path: " + file.getPath());

            // getAbsolutePath(): retorna o caminho absoluto... C:\Users\renat\Desktop\curso-java\file.txt
            System.out.println("path absolute: " + file.getAbsolutePath());

            // isDirectory(): verifica se é um diretório (pasta)
            System.out.println("is directory: " + file.isDirectory());

            // isFile(): verifica se é um arquivo.
            System.out.println("is file: " + file.isFile());

            // isHidden(): verifica se o arquivo é oculto.
            System.out.println("is hidden: " + file.isHidden());

            // lastModified(): retorna a última modificação no arquivo. o retorno é um long com um timestemp.
            System.out.println("last modified: " + file.lastModified());

            // exists(): verifica se o arquivo existe.
            boolean exists = file.exists();

            if (exists) {
                System.out.println("deleted: " + file.delete());
            }

            // delete(): retorna um boolean. caso o arquivo seja deletedo, retorna TRUE. caso contrário, retorna FALSE.
            boolean isDeleted = file.delete();
            System.out.println("deleted: " + isDeleted);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
