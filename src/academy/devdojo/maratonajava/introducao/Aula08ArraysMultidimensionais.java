package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        //arrays de arrays. arrays linkados. ============================================

        // new int[3][3]: o primeiro colchete diz a quantos arrays ele está linkando/fazendo referência (neste caso, 3 arrays. e para acessar usa índice normalmente) e o segundo diz o tamanho desses arrays (para acessar usa índice normalmente)
        int[][] dias = new int[3][3];

        // no array 0 zero, atribui valores em cada índice
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 30;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                //System.out.println(dias[i][j]);
            }
        }

        // COM FOREACH ================================================================
        // o for de fora faz referencia a cada array. pega array por array e joga em arrBase
        for (int[] arrBase : dias) {
            // o for de dentro pega item por item do arrBase da vez e joga em dia.
            for (int dia : arrBase) {
                //System.out.println(dia);
            }
        }


        // INICIALIZANDO ARRAYS MULTIDIMENSIONAIS ====================================
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1, 2}; // no indice 0 tem um array de tamanho 2
        arrayInt[1] = new int[]{1, 2, 3}; // no indice 1 tem um array de tamanho 3
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6}; // no indice 2 tem um array de tamanho 6

        for (int[] arrBase : arrayInt) {
            for (int num : arrBase) {
                System.out.println("inicialização 1: " + num);
            }
        }

        int[][] arrayInt2 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrBase : arrayInt2) {
            for (int num : arrBase) {
                System.out.println("inicialização 2: " + num);
            }
        }
    }
}
