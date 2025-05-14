package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        //arrays de arrays. arrays linkados.

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
                System.out.println(dias[i][j]);
            }
        }
    }
}
