package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTeste01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // DateFormat é uma classe abstrata e não pode ser instanciada. mas criando um array dela, é possível usar o new DateFormat["tamanho do array"]
        // é usada para formatação de datas com base na localização do computador do usuário. ou seja, minhas datas virão em português e com base em brasília.
        DateFormat[] df = new DateFormat[7];

        // retorno de cada metodo.
        df[0] = DateFormat.getInstance(); // 22/08/2025 10:08
        df[1] = DateFormat.getDateInstance(); // 22 de ago. de 2025
        df[2] = DateFormat.getDateTimeInstance(); // 22 de ago. de 2025 10:08:13
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT); // 22/08/2025
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); // 22 de ago. de 2025
        df[5] = DateFormat.getDateInstance(DateFormat.LONG); // 22 de agosto de 2025
        df[6] = DateFormat.getDateInstance(DateFormat.FULL); // sexta-feira, 22 de agosto de 2025

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
