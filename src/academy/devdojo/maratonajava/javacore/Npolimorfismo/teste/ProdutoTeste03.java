package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domains.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domains.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domains.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {

        Produto produto = new Computador("ideapad", 3000);


        Tomate tomate = new Tomate("tomatasso", 15);
        tomate.setDataValidade("11/12/21");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("===============================================");
        CalculadoraImposto.calcularImposto(produto);
    }
}
