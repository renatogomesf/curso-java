package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domains.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// quando se implementa o "Comparable" e seu metodo "compareTo", ficar mudando a lógica criada de comparação vai causar problemas. não é uma boa prática. por isso, cria-se um classse/objeto implementando o "Comparator" e o metodo "compare", para fazer outros tipos de comparaçoes desejadas e não mudar o código original.
class MangaByIdComparator implements Comparator<Manga>{

    // aqui estou definindo que a comparação será por id.
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

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


        System.out.println("----------------------------------------");

        // como "sort()" é sobrecarregado, ele aceita a instanciação de um objeto que implemente o "Comparator" para fazer outro tipo de comparação.
        Collections.sort(mangas, new MangaByIdComparator());

        // chamando "sort()" direto do objeto, caso eu deseje organizar de outra forma, é poreciso passar o objeto que implementa o "Comparator" com o metodo "compare".
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
