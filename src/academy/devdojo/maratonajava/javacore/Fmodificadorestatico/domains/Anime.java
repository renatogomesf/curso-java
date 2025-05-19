package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domains;

public class Anime {
    private String nome;
    private static int[] epsodios;

    // bloco de inicialização de estático basta adicionar static no inicio. é executado apenas uma vez quando a classe é carregada pela JVM.
    // da mesma forma como os métods estáticos, só pode modificar ou acessar atributos estáticos.
    // caso tenha mais de um bloco de inicialização, ele serão executados na sequencia em que aparecem dentro da classe.
    static {
        System.out.println("dentro do bloco de inicialização");
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) {
            epsodios[i] = i + 1;
        }
    }

    static {
        System.out.println("dentro do bloco de inicialização 2");
    }

    static {
        System.out.println("dentro do bloco de inicialização 3");
    }

    // e é possível ter bloco de inicialização não estático juntos com os estáticos. mas esse será executado todas as vezes que a classe for instanciada.
    {
        System.out.println("dentro do bloco de inicialização não estático.");
    }


    public Anime(String nome) {
        this.nome = nome;

        for (int episodio : Anime.epsodios) {
            System.out.print(episodio);
        }

        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpsodios() {
        return epsodios;
    }
}
