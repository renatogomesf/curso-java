package academy.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.Scanner;

public class ScannerTeste02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";

        // Scanner tem um delimitador padrão que é o espaço em branco.
        Scanner scanner = new Scanner(texto);

        // para usar/definir um outro delimitador específico, usa-se useDelimiter() passando o que será usado como delimitador. agora a classe scanner usa o valor passado.
        scanner.useDelimiter(",");

        // com o scanner eu posso percorrer a string e buscar string, ints ou booleans. em vez de retornar tudo como string.
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean: " + b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
