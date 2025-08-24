package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {

        // Locale: usada para fazer a transformação de datas, moedas ou horas na formatação local de onde a aplicação está rodando.
        // new Locale(): recebe dois parâmetros, a língua e o país.
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("italy " + df1.format(calendar.getTime()));
        System.out.println("suiça " + df2.format(calendar.getTime()));
        System.out.println("índia " + df3.format(calendar.getTime()));
        System.out.println("japão " + df4.format(calendar.getTime()));
        System.out.println("holanda " + df5.format(calendar.getTime()));

        // getDisplayCountry(): trás o nome do país. pode receber um parâmetro de locale para trazer o nome do país escrito em outra língua.
        System.out.println(localeItaly.getDisplayCountry(localeHolanda));
        System.out.println(localeCH.getDisplayCountry());
    }
}
