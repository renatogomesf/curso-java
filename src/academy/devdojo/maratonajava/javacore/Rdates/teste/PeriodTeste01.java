package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(5).plusMonths(2).plusDays(5);

        // Period: criada para trabalhar com datas (anos, meses e dias) e, obviamnte, com a classe LocalDate... diferente da Duration.
        Period p1 = Period.between(now, nowAfterTwoYears);
        System.out.println(p1); // P2Y2M5D -> ISO 8601: Y = anos, M = meses, D = dias

        // ofDays(): como trabalha com datas. o retorno é dias mesmo. 10 dias neste caso.
        Period p2 = Period.ofDays(10);
        System.out.println(p2);

        // ofMonths(): como trabalha com datas. o retorno é meses mesmo. 3 meses neste caso.
        Period p3 = Period.ofMonths(3);
        System.out.println(p3);

        // ofMonths(): como trabalha com datas. o retorno é anos mesmo. 3 anos neste caso.
        Period p4 = Period.ofYears(3);
        System.out.println(p4);

        // ofWeeks(): semana não faz parte de uma data, então tras a quantidade de semanas passadas em dias.
        Period p5 = Period.ofWeeks(58);
        System.out.println(p5);

        System.out.println(p1.getDays());
        System.out.println(now.until(now.plusDays(p1.getDays()), ChronoUnit.MONTHS));
    }
}
