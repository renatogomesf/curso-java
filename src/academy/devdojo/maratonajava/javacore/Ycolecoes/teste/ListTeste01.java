package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {

        // para a criação de um array com a colection "List", precisa informar o tipo do array dentro da notação "<>".
        // o tamanho dele é definido automaticamente
        // é possível definir o tamanho do array, caso necessário, passando o tamanho... new ArrayList<>(200). array com tamanho 200
        List<String> nomes = new ArrayList<>();

        // add(): adiciona um item na lista.
        nomes.add("william");
        nomes.add("devdojo academy");

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
    }
}
