package academy.devdojo.maratonajava.javacore.Minterfaces.domains;

// para usar uma interface, usa-se o "implements" e o nome da interface.
public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("carregando dados de um banco de dados");
    }
}
