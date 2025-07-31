package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domains.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domains.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("computador " + computador.getNome());
        System.out.println("valor " + computador.getValor());
        System.out.println("imposto " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("relatório de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("tomate " + tomate.getNome());
        System.out.println("valor " + tomate.getValor());
        System.out.println("imposto " + imposto);
    }
}
