package academy.devdojo.maratonajava.javacore.Minterfaces.domains;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("removendo dados de um arquivo");
    }
}
