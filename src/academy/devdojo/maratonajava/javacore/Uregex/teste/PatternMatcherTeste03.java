package academy.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste03 {
    public static void main(String[] args) {
        // usada para fazer buscas/verificações em strings.

        // META CARACTERES

        // \d = RETORNA Todos os dígitos
        // \D = RETORNA Tudo o que não for dígito
        // \s = RETORNA Todos os espaços em branco (\t,\n,\f,\r: representam espaços em branco)
        // \S = RETORNA Todos os caracteres ignorando os espaços em branco
        // \w = RETORNA Tudo que for de a-z/A-Z, dígitos e "_" (underscore)
        // \W = RETORNA Tudo que NÃO for incluso no "\w" (a-z/A-Z, dígitos e "_"). ou seja, retorna caracteres especiais e espaços em branco.
        // [] "Renge" = busca os caracteres específicos colocados dentro do colchetes. ex: [abc], busca por "a", por "b" ou por "c" minúsculo. como é uma busca específica, se existir essas letras em maiúsculo, ele não retornará.

        // ex2: [a-zA-C]: busca por todas as letras minúsculas de a-z e todas as letras maúsculas de A-C.

        String regex2 = "0[xX][0-9a-fA-F]";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";

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

        // para esrever hexadecimal diretamente no código java, precisa adicionar "0x" ou "0X" no início do código hex.
        int numeroHex = 0x59F86A;
        // mesmo passando o valor hex, ele retorna o valor decimal.
        System.out.println(numeroHex);
    }
}
