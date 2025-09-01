package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {

        // LocalDateTime: junção das classes LocalDate e LocalTime. retorna a data e a hora.
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate date = LocalDate.parse("2026-06-04");
        LocalTime time = LocalTime.parse("07:30:00");

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        // é possível fazer a junção da LocalDate com a LocalTime numa variável do tipo LocalDateTime usando "atTime()" ("no tempo/hora") (quando se tem uma data e quer unir um time) e passar uma hora específica ou passar um time.
        LocalDateTime ldt1 = date.atTime(time);
        System.out.println(ldt1);

        // o inverso também é possível. tem um time e deseja juntar com uma data. basta usar o "atDate()" ("na data") (quando se tem um time e quer unir com uma data) e passar uma data específica ou passar um date.
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt2);
    }
}
