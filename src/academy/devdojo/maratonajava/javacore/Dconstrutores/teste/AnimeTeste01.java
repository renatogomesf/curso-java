package academy.devdojo.maratonajava.javacore.Dconstrutores.teste;

import academy.devdojo.maratonajava.javacore.Dconstrutores.domains.AnimeContrutor;

public class AnimeTeste01 {
    public static void main(String[] args) {
        AnimeContrutor animeContrutor = new AnimeContrutor("heikyuu", "tv", 34, "ação");

        // sobrecarga de construtor. o de cima exige parâmetros e o de baixo não.
        AnimeContrutor animeContrutor2 = new AnimeContrutor();

        animeContrutor.imprime();
        animeContrutor2.imprime();
    }
}
