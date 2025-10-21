package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domains.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L,"attack on titan",19.9));
        mangas.add(new Manga(1L,"berserk",9.5));
        mangas.add(new Manga(4L,"hellsing ultimate",3.2));
        mangas.add(new Manga(3L,"pokemon",11.20));
        mangas.add(new Manga(2L,"dragon ball",2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("----------------------------------------");

        // só é possível usar o "sort()" com essa classe porque a interface "Comparable" e seu metodo "compareTo" foram implementados. eles são chamados autaticamente pelo java e a organização será como eu defini no metodo.
        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
