package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.teste;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domains.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("naruto");
        Anime anime2 = new Anime("teste de anime");

        System.out.println(anime2.getNome());

        for (int episodio: anime.getEpsodios()){
            System.out.print(episodio);
        }
    }
}
