package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTeste01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        // DateTimeFormatter: formatação de datas

        // "format" passa de objeto para string e "parse" passa de string para objeto.
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20250930", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-09-30+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-09-30", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();

        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2025-09-30T09:08:05.8695679", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        // define o padrão de formatação da data.
        DateTimeFormatter dateTimeFormatterBrazil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(dateTimeFormatterBrazil);
        System.out.println(formatBR);

        LocalDate parseBR = LocalDate.parse("30/09/2025", dateTimeFormatterBrazil);
        System.out.println(parseBR);


        DateTimeFormatter dateTimeFormatterGerman = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(dateTimeFormatterGerman);
        System.out.println(formatGR);

        LocalDate parseGR = LocalDate.parse("30.September.2025", dateTimeFormatterGerman);
        System.out.println(parseGR);
    }
}
