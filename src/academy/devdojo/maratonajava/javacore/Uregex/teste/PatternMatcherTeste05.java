package academy.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste05 {
    public static void main(String[] args) {
        // usada para fazer buscas/verificações em strings.

        // META CARACTERES

        // \d = RETORNA Todos os dígitos
        // \D = RETORNA Tudo o que não for dígito
        // \s = RETORNA Todos os espaços em branco (\t,\n,\f,\r: representam espaços em branco)
        // \S = RETORNA Todos os caracteres ignorando os espaços em branco
        // \w = RETORNA Tudo que for de a-z/A-Z, dígitos e "_" (underscore)
        // \W = RETORNA Tudo que NÃO for incluso no "\w" (a-z/A-Z, dígitos e "_"). ou seja, retorna caracteres especiais e espaços em branco.
        // [] "Renge" = busca os caracteres específicos colocados dentro do colchetes. ex: [abc], busca por "a", por "b" ou por "c" minúsculo. como é uma busca específica, se existir essas letras em maiúsculo, ele não retornará. ex2: [a-zA-C]: busca por todas as letras minúsculas de a-z e todas as letras maúsculas de A-C.
        // QUANTIFICADORES são caracteres que vão me permitir pegar uma expreção e refazer ela de acordo com a quantidade que cada meta-caracter representa
        // ? = Zero ou uma ocorrência
        // * = Zero ou mais ocorrência
        // + = uma ou mais ocorrência
        // {n,m} = de n até m. define um range de ocorrências específicas. ex: 5 a 10...
        // () = agrupamento
        // | = "ou" ex: o(v|c)o -> vai dar metch em ovo e oco.
        // $ = representa o fim da linha/ fim do texto.
        // . = caractere coringa. quando coloco na regex 1.3, significa que quero um padrão que comece com 1, termine com 3 e tenha qualquer caractere no meio. ex: 123, 133, 1@3, 1A3, 1a3, 1 3. o "." (ponto) é um caractere de regex. para usalo como string (algo a ser verificado se existe no texto), precisa usar duas contra-barra. uma para sair de caractere de regex e outra exigida pelo java. o "." (ponto) dentro dos colchetes não precisam de contra barra. somente fora.
        // ^ = permite definir o que deve ter no início da string. ex: ^\d (no início da string tem que ter um dígito)
        // [^] = dentro dos colchetes ele funciona como negação. ex: [abc] aqui estou buscando por "abc". mas usando [^abc], estou dizendo que quero tudo menos "abc".

        // aqui está sendo feita uma busca de padrão. o cerro é analisar email por email separadamente. ao inves de conferir tudo a partir de uma única string.
        String regex2 = "([a-zA-Z0-9._-])+@([a-z])+(\\.([a-z])+)+";
        String texto2 = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";

        // matches(): verifica se a string bate com a regex passada.
        System.out.println("#@!zoro@mail.br".matches(regex2));

        // jogas o emails num array e verifica um a um com o matches. agora sim é uma checagem correta.
        System.out.println(Arrays.toString(texto2.split(",")));

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
