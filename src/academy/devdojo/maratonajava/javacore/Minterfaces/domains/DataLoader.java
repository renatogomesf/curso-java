package academy.devdojo.maratonajava.javacore.Minterfaces.domains;

// interface não é classe.
//interface foram criada para obrigar uma classe a implementar os metodos. caso o metodo seja "default", a classe que implementar essa interface não é obrigada a implementar o metodo.
public interface DataLoader {
    //por padrão, todos os atributos/variáveis de uma interface são constantes. não precisam de public, static, final.
    //e, obviamente, precisam ser inicializados com algum valor
    int MAX_DATA_SIZE = 10;

    // nas interfaces, todos os metodos são public e abstract e não possuem corpo. ou seja, não precisa colocar eles no metodo. e as classes que implementarem essa interface são obrigadas a usar esse metodo.
    void load();

    // metodos "default" dentro de uma interface são concretos. precisam de um corpo e não são obrigados a serem implementados pelas classes que usarem essa interface.
    // esses metodos podem ser sobrescritos normalmente.
    default void checkPermission(){
        System.out.println("fazendo checagem de permissões");
    }

    //é possível criar metodos static dentro de uma interface. eles não serão sobrescritos, mesmo que você tente criando um metodo exatamente igual na classe que implementar essa interface.
    static void retriverMaxDataSize(){
        System.out.println("dentro do retriverMaxDataSize na interface");
    }
}
