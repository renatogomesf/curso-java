package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    public static void main(String[] args) {

        // a classe calendar (mais usada em sistemas legado) não pode ser instanciada (new Calendar()) por ser abstract. para acessar algo da classe, chama a própria classe "." (ponto) o que deseja.

        // getInstance(): por padrão tras o calendário gregoriano com todas as informações possiveis. pego todas essa informações, jogo numa variável e, a partir de lá acesso o que preciso.
        Calendar c = Calendar.getInstance();

        // getTime(): pega o timestemp.
        Date date = c.getTime();
        System.out.println(date);

        // getFirstDayOfWeek(): retorna um valor inteiro que representa o primeiro dia da semana.
        // Calendar.SUNDAY: partindo da classe Calendar, é possível acessar constantes que ajudam na manipulação de datas. ex: SUNDAY é uma constante com valor 1.
        int day = c.getFirstDayOfWeek();
        System.out.println(day);

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("domingo");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // retorna em que dia da semana atual estamos
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); // retorna em que dia do mês atual estamos
        System.out.println(c.get(Calendar.DAY_OF_YEAR)); // retorna qual dia do ano atual estamos dos 365/366 disponiveis. trás quantos dias se passaram desde janeiro.
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // retorna em qual semana do mês estamos. 1°,2°,3°....

        // add(): me permite manipular uma data ou hora adicionando valores... neste caso, estou pegando a constante do dia do mês e adicionando mais 2 dias. quando a data for mostrada, aparecerá com dois dias a mais.
        // tomar cuidado pois, caso adicione um valor grande, a data funciona normalmente virando o dia ou o hora ou mês...
        c.add(Calendar.DAY_OF_MONTH, 2);
        c.add(Calendar.HOUR, 10);

        Date date2 = c.getTime();
        System.out.println(date2);
    }
}
