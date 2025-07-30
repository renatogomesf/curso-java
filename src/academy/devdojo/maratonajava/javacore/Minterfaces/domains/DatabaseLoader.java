package academy.devdojo.maratonajava.javacore.Minterfaces.domains;

// para usar uma interface, usa-se o "implements" e o nome da interface.
// uma classe pode implementar mais de uma interface. e não tem limite
public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("carregando dados de um banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("removendo do banco de dados");
    }
}
