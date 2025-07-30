package academy.devdojo.maratonajava.javacore.Minterfaces.teste;

import academy.devdojo.maratonajava.javacore.Minterfaces.domains.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domains.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domains.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        //esses metodos chamados vem da interface.
        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        //dois metodos iguais. um dentro da interface e outro de uma classe que implementa a interface que possui o mesmo metodo.
        DataLoader.retriverMaxDataSize();
        DatabaseLoader.retriverMaxDataSize();
    }
}
