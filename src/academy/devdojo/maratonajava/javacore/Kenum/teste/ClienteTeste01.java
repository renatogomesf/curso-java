package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.javacore.Kenum.domains.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.domains.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.domains.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        //enum separado
        //para usar/passar o enum, chama a classe enum "."(ponto) a constante desejada.
        Cliente cliente = new Cliente("tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("akira", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente);
        System.out.println(cliente2);

        System.out.println("-------------------------------------------------");

        //enum dentro de outra classe (classe removida na parte 03 da aula.)
        //para usar/passar o enum, chama a classe principal, depois a classe enum "."(ponto) a constante desejada.
        Cliente cliente3 = new Cliente("tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente4 = new Cliente("akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente3);
        System.out.println(cliente4);

        // para acessar um metodo dentro de uma classe enum, sempre tem que chamar o atributo enum antes.
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
