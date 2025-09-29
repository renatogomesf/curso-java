package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste01 {
    public static void main(String[] args) {
        // TemporalField: classe usada para fazer ajuste em datas

        LocalDate now = LocalDate.now();

        // withDayOfMonth(): qual dia do mês eu quero.
        now = now.withDayOfMonth(20);

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // nextOrSame(): trás a próxima ou a mesma mada data da informação passada. neste caso, quero saber quando será segunda-feria, como hoje é segunda, ele trás a data de hoje. caso que queira saber quando será a próxima segunda, preciso usar somente o "next()"
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        // somente com o "next()", ele me tras, obrigatóriamente, a data da próxima segunda-feira.
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        // existe, também, o "previous()" que trás a data da última segunda-feria, neste caso.
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        // firstDayOfMonth() e lastDayOfMonth(): trazem o primeiro e o último dia do mês em que estou.
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
