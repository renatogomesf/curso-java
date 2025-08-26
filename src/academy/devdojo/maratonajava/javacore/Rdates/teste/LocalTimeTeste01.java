package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {

        // tão simples e atual quanto "LocalDate", LocalTime é usado para trabalhar somente com horas.
        // aqui estou passando uma hora específica. ficar atento, pois as horas permitidas vão de 0 à 23. 24h volta pra 00h.
        LocalTime time = LocalTime.of(23, 32, 12);
        System.out.println(time);

        // pega a hora atual.
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        // getHour(): pega a hora
        System.out.println(timeNow.getHour());

        // getMinute(): pega o minuto
        System.out.println(timeNow.getMinute());

        // getSecond(): pega o segundo
        System.out.println(timeNow.getSecond());

        // caso queira algo mais específico, basta usar o get() e ele pede um "TemporalField"
        System.out.println(timeNow.get(ChronoField.HOUR_OF_DAY));

        // pega a hora 00:00 (meia noite). início do dia.
        System.out.println(LocalTime.MIN);

        // pega a hora 23:59:59. fim do dia.
        System.out.println(LocalTime.MAX);
    }
}
