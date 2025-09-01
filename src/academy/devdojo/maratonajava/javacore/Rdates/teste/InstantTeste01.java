package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTeste01 {
    public static void main(String[] args) {

        // parecidada com a date. a diferença é que a date trabalha com milessegundos e a Instant trabalha com nanossegundos. ambas contam desde 1970.
        // Instant: representa um ponto instantâneo dentro de uma time-line.
        Instant now = Instant.now();

        // LocalDateTime.now() e o Instante.now() retornam a basicamente a mesma coisa. data e hora. mas a Instant retorna um "Z" no final que é o Zulu time de acordo com a time-zone. um horário neutro mundial muito usado pelos militares.
        System.out.println(now);
        System.out.println(LocalDateTime.now());

        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); // 999.999.999... acada 1bi de nanossegundo, se passar 1 segundo.

        System.out.println(Instant.ofEpochSecond(10,0));
        System.out.println(Instant.ofEpochSecond(10,1_000_000_000));
        System.out.println(Instant.ofEpochSecond(10,-1_000_000_000));
    }
}
