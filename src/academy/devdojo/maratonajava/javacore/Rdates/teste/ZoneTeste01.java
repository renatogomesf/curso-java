package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {
        // ZoneId: usada para trabalhar com zonas (fusorário)

        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        // of(): seta uma zona.
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // pegando meu horário e levando para a zona de tokyo, que é 9 horas a mais. mas não faz a soma de horas.
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        // como o instant trabalha com o zulutime, quando pego mue horário e jogo pra zona de tokyo, ele já faz a soma de horários. pega meu horário atual e soma mais 9 horas.
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);


        // ZoneOffset: permite definir uma zona específica que não esteja mapeada no zonedDateTime. neste caso, estou adicionando a zona de manaus.
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now,offsetManaus);
        System.out.println(offsetDateTime2);

        // com o instant, ele me tras o horário atual de manaus.
        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);

        // trabalhar com calendários diferentes
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDateTime.now());
        System.out.println(japaneseDate);

        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate japaneseDate2 = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(japaneseDate2);
    }
}
