package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.domains.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.domains.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("jiraia");
        Professor professor02 = new Professor("kakashi");
        Professor[] professores = {professor01, professor02};
        Escola escola = new Escola("konoha", professores);

        escola.imprime();
    }
}
