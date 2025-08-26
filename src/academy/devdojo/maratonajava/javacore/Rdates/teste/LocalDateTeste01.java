package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;


public class LocalDateTeste01 {
    public static void main(String[] args) {

        // dois modos menos usados de se trabalhar com datas dos pacotes "java.util" e "java.text"
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());


        // modo mais moderno de se trabalhar com datas usando o pacote "java.time". simplifica muito o trabalho com datas, pois possui metodos e classe simples e objetivas.

        // LocalDate: usado para trabalhar somente com datas.
        // neste caso, esotu passando um dia, mês e ano.
        LocalDate date = LocalDate.of(2025, Month.APRIL,6);
        System.out.println(date);

        // aqui eu estou pegando a data atual de forma automática.
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        // getYear(): pega o ano.
        System.out.println(date.getYear());

        // getMonth(): pega o nome do mês.
        System.out.println(date.getMonth());

        // getMonthValue(): pega o número do mês. ex: janeiro com valor 1, abril com valor 4...
        System.out.println(date.getMonthValue());

        // getDayOfWeek(): pega o nome do dia da semana.
        System.out.println(date.getDayOfWeek());

        // getDayOfMonth(): pega o dia (número) do mês.
        System.out.println(date.getDayOfMonth());

        // lengthOfMonth(): pega o tamanho do mês. quantos dias ele tem
        System.out.println(date.lengthOfMonth());

        // verifica se é ano bisexto. retorna true se for e false se não for.
        System.out.println(date.isLeapYear());

        // caso queira algo mais específico, basta usar o get() e ele pede um "TemporalField"
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));

        // datas máximas e mínimas em que é possível se trabalhar com a classe LocalDate. muito maior que a as classes estudadas antes.
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
