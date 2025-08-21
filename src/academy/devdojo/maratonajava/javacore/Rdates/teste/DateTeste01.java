package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {

        // new Date(): retorna um long com o valor em milissegundos que vem sendo contado desde 01/01/1970
        // a classe Date não é mais utilizada, pois dificultava a internacionalização. mas ainda é vista em sistemas legado. possui muitos metodos depreciados.

        // new Date(): sem passar nem um valor, ele retorna a data atual em milessegundos.
        Date date = new Date();
        System.out.println(date); // somente a variável, retorna a data atual formatada.
        System.out.println(date.getTime()); // com getTime(), retorna a data atual em milessegundos.

        // caso passe algum valor (em milessegundos), ele vai retornar a data que aquele valor representa.
        Date date2 = new Date(1700082653724L);
        System.out.println(date2);
    }
}
