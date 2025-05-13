package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao {
    public static void main(String[] args) {
        // while, do while, for

        // while===============================================================================
        int count = 0;

        while (count < 10) {
            //System.out.println("while " + count);
            count++;
        }

        // do while=============================================================================
        int count2 = 0;

        do {
            //System.out.println("do while " + count2);
            count2++;
        } while (count2 < 10);

        // for==================================================================================
        for (int i = 0; i < 10; i++) {
            //System.out.println("for " + i);
        }


        // exercicio ==========================================================================
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("par " + i);
            }
        }
    }
}
