package academy.devdojo.maratonajava.javacore.Tresourcebundle.teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        // usado para trabalhar com traduções em sites (internacionalização).
        // ResourceBundle.getBundle("nome do arquivo 'properties'", localidade)
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good.morning"));
    }
}
