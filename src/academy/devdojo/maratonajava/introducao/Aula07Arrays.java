package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        // ARRAY ("tipo" [] "nome variável")=====================================================================

        // variável do tipo reference (pode iniciar com null). deixa de ser tipo primitivo (que não pode ser iniciado com null);
        // new int[3]: todas as vezes que declara um array, é obrigado a dizer quantos espaços em memória deve ter. neste caso 3;
        // todos array inicia com algum valor padrão e são considerados objetos. tipos numéricos com 0, double e float com 0.0 e Strind com null;

        int[] idades = new int[3];

        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
