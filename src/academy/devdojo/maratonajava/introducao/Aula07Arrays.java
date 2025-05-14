package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        // ARRAY ("tipo" [] "nome variável")=====================================================================

        // variável do tipo reference (pode iniciar com null). deixa de ser tipo primitivo (que não pode ser iniciado com null);
        // new int[3]: todas as vezes que declara um array, é obrigado a dizer quantos espaços em memória deve ter. neste caso 3;

        // todos array inicia com algum valor padrão e são considerados objetos. tipos numéricos com 0, double e float com 0.0 e Strind com null;
        // EX: byte, short, int e long retornam 0 (zero), caso o array não tenha valor atribuido (caso não seja inicializado);
        // EX: float e double retornam 0.0 (zero ponto zero)
        // EX: char retorna um unicode '\u0000' que representa um espaço em branco "";
        // EX: boolean retorna false;
        // EX: tipos referenc como o String, retornam null;
        int[] idades = new int[3];

        // o array so receber valores do tipo que foi declarado na sua criação. int só recebe int, double recebe double...
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;

        //System.out.println("int: "+idades[2]);

        char[] idades2 = new char[3];
        //System.out.println("char: "+idades2[0]);

        boolean[] idades3 = new boolean[3];
        //.out.println("boolean: "+idades3[0]);

        String[] idades4 = new String[3];
        //System.out.println("String: "+idades4[0]);

        double[] idades5 = new double[3];
        //System.out.println("double: "+idades5[0]);

        float[] idades6 = new float[3];
        //System.out.println("float: "+idades6[0]);


        // ITERAR UM ARRAY ==================================================================
        String[] nomes = new String[4];

        nomes[0] = "teste";
        nomes[1] = "goku";
        nomes[2] = "vix";
        nomes[3] = "aaaaaaa";

        for (int i = 0; i < nomes.length; i++) {
            //System.out.println(nomes[i]);
        }

        // NOVA FORMA DE INICIALIZAR UM ARRAY E DE ITERAR UM ARRAY (FOREACH) =================
        int[] numeros = {1, 2, 3, 4, 5}; // parecido com javascript. mas usa {}.
        int[] numeros2 = new int[]{1, 2, 3, 4, 5}; // da mesma forma anterior mas usando new e o tipo, mas sem definir o tamanho.

        for (int i = 0; i < numeros.length; i++) {
            //System.out.println(numeros[i]);
        }

        // foreach
        // o tipo da variável local do foreach deve ser a mesma do array que vai iterar.
        // pega item por item do array e joga dentro da variável local do foreach (faz uma referência).
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
