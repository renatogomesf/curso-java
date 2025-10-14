package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domains.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","iPhone");
        Smartphone s2 = new Smartphone("1ABC1","iPhone");

        // equals() de um objeto: verifica se as variáveis fazem referência para o mesmo objeto. não comparam o valor me si.
        // equals() partindo de uma string comparam o valor em si.
        System.out.println(s1.equals(s2));
    }
}
