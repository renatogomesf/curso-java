package academy.devdojo.maratonajava.javacore.Lclassesabstratas.teste;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domains.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domains.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domains.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        //erro pois a classe funcionario é abstrata. não pode ser instanciada.
        //Funcionario funcionario = new Funcionario("zoro", 2000);
        Gerente gerente = new Gerente("nami", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("eu mesmo",4000);
        System.out.println(desenvolvedor);
    }
}
