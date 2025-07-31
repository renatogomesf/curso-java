package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domains.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domains.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domains.Tomate;

public class CalculadoraImposto {
    // SEM POLIMORFISMO
//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("relatório de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("computador " + computador.getNome());
//        System.out.println("valor " + computador.getValor());
//        System.out.println("imposto " + imposto);
//    }

//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("relatório de imposto do tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("tomate " + tomate.getNome());
//        System.out.println("valor " + tomate.getValor());
//        System.out.println("imposto " + imposto);
//    }

    // COM POLIMORFISMO
    public static void calcularImposto(Produto produto) {
        System.out.println("relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("produto " + produto.getNome());
        System.out.println("valor " + produto.getValor());
        System.out.println("imposto " + imposto);

        // fazendo um cast, pois preciso acessar informações que só existem na sub classe tomate. o cast é necessário pois o java não garante que a variável produto (com tipo genérico Produto) será um tomate. com o casto eu digo: "garanto que é um tomate". e com isso posso acessar o metodo que só existe em tomate.
        //Tomate tomate = (Tomate) produto;
        //System.out.println(tomate.getDataValidade());

        // como calcular imposto é genérico e podem ser passados varios produtos diferentes além do tomate, o cast perde seu valor aqui. com isso, existe uma forma de checar se o produto passado é uma instancia/objeto de uma classe desejada.
        // aqui estou verificando se o produto passado é uma instancia/objeto da classe Tomate, comparo o parâmetro "produto" com a variável "tomate" do tipo Tomate, se forem da mesma instancia, retorna true e cai dentro do if.
        if(produto instanceof Tomate tomate){
            System.out.println(tomate.getDataValidade());
        }
    }
}
