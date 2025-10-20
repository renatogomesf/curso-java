package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        mangas.add("attack on titan");
        mangas.add("berserk");
        mangas.add("hellsing ultimate");
        mangas.add("pokemon");
        mangas.add("dragon ball");

        // sort(): organiza lista em ordem númerica (quando passado números) ou alfabeticas (quando passado strings).
        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23D);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);

        for (Double dinheiro : dinheiros){
            System.out.println(dinheiro);
        }
    }
}
