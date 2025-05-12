package academy.devdojo.maratonajava.introducao;

/*
    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
    Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */

public class Aula02Exercicio {

    public static void main(String[] args){
        String nome = "fulano";
        String endereco = "rua x bairro y";
        double salario = 4520.32;
        String dataRecebimento = "02/02/2024";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimento + ".");
    }
}
