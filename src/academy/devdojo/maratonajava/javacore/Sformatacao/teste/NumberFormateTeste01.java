package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormateTeste01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        // NumberFormat: classe abstrata para formatação de números.
        NumberFormat[] nfa = new NumberFormat[4];

        // getInstance(): tras a formatação local dos números... utilização de pontos e vírgulas.
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeBR);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nfa){

            // setMaximumFractionDigits(): define a quantidade máxima de dígitos depois da vígula.
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "10_000.2130";

        try {
            // tem que tomar cuidado, pois o parse não funciona direito caso tenha um caractere especial ou diferente de número, ponto ou vírgula (caracteres que compoem um número). neste caso, o retorno é "10", pois tem um "_" no meio da string que faz o parse simplesmente parar.
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
