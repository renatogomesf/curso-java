package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.javacore.Kenum.domains.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.domains.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("tsubasa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("tsubasa", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
