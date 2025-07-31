package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domains.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domains.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domains.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {

        //polimorfismo (varias formas). só funciona com classes extendidas (heranças). uma variável de referência pode assumir varias formas.
        //aqui a classe Computador extende a classe Produto (computador é filha de produto). com isso, eu posso criar uma variável do tipo Produto ou outro tipo qualquer (super classe) e instanciar uma classe que extenda produto (sub classe), ao invés de instanciar o proprio produto ou criar uma variável de referênci da propria instância/objeto.
        //antes: Computador computador = new Computador();
        //polimorfismo: Produto produto = new Computador();
        // a instância/objeto new Computador() alimenta a variável com suas propriedades e metodos, permitindo acessa-las através da variável. e quem executa tudo que é acessado é a instancia/objeto.
        Produto produto = new Computador("ideapad", 3000);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("==========================================================");

        // um tipo mais genérico => faz referência para um tipo mais específico.
        Produto produto2 = new Tomate("tomatasso", 15);

        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

        // atributos ou metodos que não estejam na super classe (classe pai que provê) não podem ser chamados com a variável de referência genérica.
        // para acessar algo que só exista na classe filha (classe que extende produto) volta o uso padrão de criar uma variável de referência do mesmo tipo da instância/objeto. EX: Tomate tomate = new Tomate();
        //getDataValidade() só existe na classe filha Tomate.
        //System.out.println(produto2.getDataValidade());
    }
}
