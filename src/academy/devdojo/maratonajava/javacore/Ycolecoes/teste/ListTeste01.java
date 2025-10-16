package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {

        // para a criação de um array com a colection "List", precisa informar o tipo do array dentro da notação "<>". ex: List<String>... essa tipagem só aceita objetos, wrappers (String, Integer, Long, Boolean... com leta maiúscula). não aceita tipos primitivos (int, boolena, long).
        // o tamanho dele é definido automaticamente
        // é possível definir o tamanho do array, caso necessário, passando o tamanho... new ArrayList<>(200). array com tamanho 200
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        // add(): adiciona um item na lista.
        nomes.add("william");
        nomes.add("devdojo");

        nomes2.add("suane");
        nomes2.add("academy");

        // addAll(): permite a união de dois arrays
        nomes.addAll(nomes2);

        // remove(): remove um item do array. pode remover de duas formas, passando o index ou passando o objeto. retorna true caso consiga remover e false caso não consiga.
        nomes.remove("william");

        // por ser tipado como string, não é possível adicionar números
        //nomes.add(123);

        for(String nome : nomes){
            System.out.println(nome);
        }

        nomes.add("suane");
        System.out.println("----------------------------------------");

        // size(): na colection retorna o tamanho do array. fora da colection, usa-se "length"
        // get(): serve para pegar um item de uma posição específica passando o index. get(2), tras o item da posição 2.
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);


    }
}
