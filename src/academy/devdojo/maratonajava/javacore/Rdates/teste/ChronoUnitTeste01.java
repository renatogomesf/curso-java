package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1997, Month.APRIL,6,12,0,0);
        LocalDateTime now = LocalDateTime.now();

        // mais somples de se trabalhar com datas e horas do que a localdatetime

        // quantidade de dias entre duas datas
        System.out.println(ChronoUnit.DAYS.between(aniversario,now));

        // quantidade de meses entre duas datas
        System.out.println(ChronoUnit.MONTHS.between(aniversario,now));

        // quantidade de anos entre duas datas
        System.out.println(ChronoUnit.YEARS.between(aniversario,now));

        // quantidade de semanas entre duas datas
        System.out.println(ChronoUnit.WEEKS.between(aniversario,now));

        // quantidade de horas entre duas datas
        System.out.println(ChronoUnit.HOURS.between(aniversario,now));
    }
}
