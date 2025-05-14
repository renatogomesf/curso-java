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

        System.out.println("int: "+idades[2]);

        char[] idades2 = new char[3];
        System.out.println("char: "+idades2[0]);

        boolean[] idades3 = new boolean[3];
        System.out.println("boolean: "+idades3[0]);

        String[] idades4 = new String[3];
        System.out.println("String: "+idades4[0]);

        double[] idades5 = new double[3];
        System.out.println("double: "+idades5[0]);

        float[] idades6 = new float[3];
        System.out.println("float: "+idades6[0]);

    }
}
