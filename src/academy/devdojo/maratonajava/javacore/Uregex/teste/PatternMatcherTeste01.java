package academy.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste01 {
    public static void main(String[] args) {
        // usada para fazer buscas/verificações em strings.

        String regex = "ab";
        String texto = "abaaba";

        String regex2 = "aba";
        String texto2 = "abababa";

        // Pattern: define o padrão
        // Matcher: busca o padrão definido. quando encontrado, segue a busca desconsiderando os padrões ja encontrados. mesmo que parte dos padroes encontrados formem outro padrão. aba b aba. a busca segue por indice... se um padrão vai de 0 a 2, a busca continua a partir do indice 3.

        // vai procurar todos os "ab" dentro de "texto"
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:   " + texto2);
        System.out.println("indice:  0123456789");
        System.out.println("regex:  " + regex2);
        System.out.println("posições encontradas");

        // find(): faz a busca. caso exista, retorna true.
        while (matcher.find()){

            // start(): retorna o índice do primeiro elemento do padrão passado. onde o padrão começa em cada parte do texto
            System.out.print(matcher.start()+" ");
        }
    }
}
