package academy.devdojo.maratonajava.javacore.Minterfaces.domains;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo");
    }
}
