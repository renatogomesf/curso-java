package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.domains.Funcionario;

public class HerancaTeste02 {
    public static void main(String[] args) {

        // com heranças, a forma como a sequência de inicialização funciona é diferente. primeiro inicializa a classe pai o que tiver como "static", depois a classe filha o que tiver como "static", depois todos os atributos, metodos e blocos de inicialiazção não estáticos da classe pai e depois todos os atributos, metodos e blocos de inicialiazção não estáticos da classe filha.
        Funcionario funcionario = new Funcionario("marcondes");
    }
}
