package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTeste01 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusHours(2).plusMinutes(8).plusSeconds(30);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        // Duration: criada para trablhar com um intervalor de tempo. quando se quer saber o intervalo (horas,minutos,segundos) entre duas datas.
        // baseada em segundos e nanossegundos.
        // NÃO É POSSÍVEL TRABALHAR COM A CLASSE LOCAL DATE POR NÃO TER HORAS.
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        System.out.println(d1); // PT17522H8M30S -> ISO 8601: P = representa datas, T = representa o tempo/horas... se passaram 17520H (H = horas), M = minutos, S = segundos. o valor das letras vem antes delas.

        // between(): "entre" duas datas ou times... retorna horas, minutos e segundos.
        Duration d2 = Duration.between(timeNow, timeMinus7Hours);
        System.out.println(d2);

        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(d3);

        // ofDays(): retorna a duração, em horas, de uma quantidade de dias passada. neste caso, retorna quantas horas são 20 dias.
        Duration d4 = Duration.ofDays(20);
        System.out.println(d4);

        // mais complicado de trabalhar somente com "of()"
        Duration d5 = Duration.of(3, ChronoUnit.DAYS);
        System.out.println(d5);
    }
}
