package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.util.Locale;

public class LocaleTeste02 {
    public static void main(String[] args) {

        // getDefault(): verifica qual linguagem o SO está configurado.
        System.out.println(Locale.getDefault());

        // getISOCountries()/getISOLanguages(): retorna as ISO suportadas. tanto de língua quanto de país.
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        System.out.println("ISO país:");
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }

        System.out.println("\nISO língua:");
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
    }
}
