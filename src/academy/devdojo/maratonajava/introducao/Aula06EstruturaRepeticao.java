package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao {
    public static void main(String[] args) {
        // while, do while, for

        // WHILE ===============================================================================
        int count = 0;

        while (count < 10) {
            //System.out.println("while " + count);
            count++;
        }

        // DO WHILE =============================================================================
        int count2 = 0;

        do {
            //System.out.println("do while " + count2);
            count2++;
        } while (count2 < 10);

        // FOR ==================================================================================
        for (int i = 0; i < 10; i++) {
            //System.out.println("for " + i);
        }


        // EXERCÍCIO ==========================================================================
        // imprimir os números pares de 0 a 100
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                //System.out.println("par " + i);
            }
        }

        // BREAK (para um loop. sai do laço de repetição)=======================================
        // imprimir os primeiros 25 números de um dado valor. por exemplo, 50.
        int valorMax = 50;

        for (int i = 0; i < valorMax; i++) {
            if (i > 25) {
                break;
            }

            System.out.println(i);
        }
    }
}
