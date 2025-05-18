package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domains;

public class Anime {
    private String nome;
    private int[] epsodios;

    // blocos de inicialização ficam, normalmente, entre os atributos e os construtores.
    // bloco de inicialização de instância. é executado todas as vezes que este objeto é criado/chamado. e é executado antes do construtor.
    {
        System.out.println("dentro do bloco de inicialização");
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) {
            epsodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpsodios() {
        return epsodios;
    }
}
