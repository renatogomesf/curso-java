package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {

        // áspas simples ('') dentro da string de formatação é usada para definir o que o SimpleDateFormat deve ignorar na hora de fazer a formatação. o que está em áspas simples será usado para compor a string final de formatação.
        String pattern = "'Brasil' dd 'de' MMMM 'de' yyyy G 'at' HH:mm:ss z";

        // SimpleDateFormat("padrão que deseja exibir a data"): da mais flexibilidade na hora de formatar datas.
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.println(sdf.format(new Date()));
    }
}
