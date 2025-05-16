package academy.devdojo.maratonajava.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.domains.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        // é possível chamar as duas formas do métod sobrecarregado. mas as variáveis/propriedades da classe anime serão sobreescritas e será considereada a última chamada.
        anime.init("akudama drive", "tv", 12);
        anime.init("akudama drive 2", "tv 2", 22, "seila"); // chamda considerada.
        anime.imprime();
    }
}
