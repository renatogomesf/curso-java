package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringTeste01 {

    public static void main(String[] args) {
        // string, no java, são imutáveis. quando eu crio uma string, o java vai verificar se ela já existe no pool de strings. caso exista, o java vai somente fazer a referência àquela string. ou seja, ele não duplica uma string. dentro da pool de strings não terá dois "willaim"... mas sim somente um "william" com duas ou mais variáveis fazendo referência a ele.

        // dentro da pool de strings, duas variáveis podem fazer referência a uma única string.
        String nome = "william"; // String constant pool
        String nome2 = "william";

        // por conta da imutabilidade, a string "william" não muda mesmo com o "concat()". é criado uma string "suane" dentro da pool e outra string com a junção das duas strings... "willian suane". mas não podem ser acessadas por não terem uma variável de referência. então dentro da pool temos "william", "suane" e "william suane".
        //nome.concat(" suane");

        // agora sim é possível acessar "william suane", pois estou assossiando a uma varável para poder acessar.
        nome = nome.concat(" suane");

        // "==" faz comparação de referência. verifica se os dois estão referenciando a mesma string.
        System.out.println(nome == nome2);


        // NÃO SE CRIA STRING DESTA FORMA. SOMENTE EXPLICAÇÃO.
        // new String(): não cria a string dentro da pool de strings. na verdade está instanciando um objeto fora da pool de strings que contem a string "william", mas o objeto é quem faz a referência à string que está dentro da pool.
        String nome3 = new String("william");

        // nome2 está sendo comparado com o objeto nome3 que encapsula "william" retornando false.
        System.out.println(nome2 == nome3);

        // por conta do intern(), nome2 está sendo comparado com o valor de nome3 que está dentro do pool de strings, onde o objeto faz referência. retornando true.
        System.out.println(nome2 == nome3.intern());



    }
}
