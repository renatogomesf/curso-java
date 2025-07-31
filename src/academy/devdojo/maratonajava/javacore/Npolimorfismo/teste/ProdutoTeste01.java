package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domains.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domains.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("acer", 4500);
        Tomate tomate = new Tomate("tomate cereja", 10);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("==============================================");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
