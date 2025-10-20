package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domains.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","iPhone");
        Smartphone s2 = new Smartphone("22222","Pixel");
        Smartphone s3 = new Smartphone("33333","Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);

        // também é possível adicionar um item numa posição específca no array. basta passar o indice e depois o que será adicionado.
        smartphones.add(0,s3);

        for (Smartphone smartphone: smartphones){
            System.out.println(smartphone.toString());
        }

        // clear(): limpa o conteúdo array mas mantem a instância.
        //smartphones.clear();

        Smartphone s4 = new Smartphone("33333","Samsung");
        Smartphone s5 = new Smartphone("55555","Nokia");

        // contains(): verifica se o objeto ou valor passado existe no array. retorna true se existir e false se não existir.
        boolean contains = smartphones.contains(s4);
        System.out.println(contains);

        // indexOf(): retorna o indice/posição do objeto ou valor passado. caso não exista, retorna "-1"
        int i4 = smartphones.indexOf(s4);
        System.out.println(i4);

        // get(): retorna o item do array passando o indice
        System.out.println(smartphones.get(i4));

        int i5 = smartphones.indexOf(s5);
        System.out.println(i5);
    }
}
