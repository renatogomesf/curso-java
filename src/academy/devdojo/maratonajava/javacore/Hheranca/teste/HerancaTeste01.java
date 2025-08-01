package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.domains.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domains.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domains.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("rua 3");
        endereco.setCep("012345-678");

        Pessoa pessoa = new Pessoa("toyo");
        pessoa.setNome("toyo");
        pessoa.setCpf("123123123");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("lucas");
        // é possivel acessar setNome, setCpf, setEndereco da classe pessoa por que funcionário herda a classe pessoa. mas a classe pessoa não tem acesso ao setSalario da classe funcionário por conta da hierarquia. só tem acesso quem herda.
        funcionario.setNome("lucas");
        funcionario.setCpf("567567567");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1520.23);

        System.out.println("------------------------------------------");
        funcionario.imprime();
    }
}
