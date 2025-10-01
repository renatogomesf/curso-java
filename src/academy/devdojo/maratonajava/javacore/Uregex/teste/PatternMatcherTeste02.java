package academy.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {
        // usada para fazer buscas/verificações em strings.

        // META CARACTERES

        // \d = RETORNA Todos os dígitos
        // \D = RETORNA Tudo o que não for dígito
        // \s = RETORNA Todos os espaços em branco (\t,\n,\f,\r: representam espaços em branco)
        // \S = RETORNA Todos os caracteres ignorando os espaços em branco
        // \w = RETORNA Tudo que for de a-z/A-Z, dígitos e "_" (underscore)
        // \W = RETORNA Tudo que NÃO for incluso no "\w" (a-z/A-Z, dígitos e "_"). ou seja, retorna caracteres especiais e espaços em branco.

        // pra usar o contra-barra, precisa adicionar duas para considerar uma.
        String regex2 = "\\W";
        String texto2 = "@#hh_j21 2gvh2";

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:   " + texto2);
        System.out.println("indice:  0123456789");
        System.out.println("regex:  " + regex2);
        System.out.println("posições encontradas");

        // find(): faz a busca. caso exista, retorna true.
        while (matcher.find()){

            // start(): retorna o índice do primeiro elemento do padrão passado. onde o padrão começa em cada parte do texto
            // group(): retorna o padrão em si encontrado no texto analisado.
            System.out.print("índice: "+matcher.start()+" | item: "+matcher.group()+"\n");
        }
    }
}
