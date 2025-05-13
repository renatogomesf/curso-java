package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        // if(){}==============================================================================
        int idade = 15;
        boolean isPodeComprarBebida = idade >= 18;

        if (isPodeComprarBebida) {
            //System.out.println("pode comprar bebida");
        }

        // ! (NOT)
        if (!isPodeComprarBebida) {
            //System.out.println("não pode comprar bebida");
        }

        // o if obrigatoriamente precisa que a condiçõa a ser avarialada possua um true ou false. não da para verificar se a variável possui ou não valor atribuido que nem no JavaScript.
        //int teste;
        //if(teste){} (erro)

        //System.out.println("fora do if");


        //if(){}else{}==========================================================================
        boolean estudando = false;

        if (estudando) {
            //System.out.println("vai se dar bom!");
        } else {
            //System.out.println("vai dar ruim!");
        }

        //if(){}elseif(){}else{}================================================================
        int idade2 = 14;

        if (idade2 < 15) {
            //System.out.println("categoria infantil");
        } else if (idade2 >= 15 && idade2 < 18) {
            //System.out.println("categoria juvenil");
        } else {
            //System.out.println("categoria adulto");
        }

        // OPERADOR TERNÁRIO ("condição" ? "se true" : "se false")

        double salario = 3000;
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";

        //System.out.println(resultado);


        // SWITCH
        // imprima o dia da semana, considerando 1 como domingo.

        byte dia = 10;

        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda-feira");
                break;
            case 3:
                System.out.println("terça-feira");
                break;
            case 4:
                System.out.println("quarta-feira");
                break;
            case 5:
                System.out.println("quinta-feira");
                break;
            case 6:
                System.out.println("sexta-feira");
                break;
            case 7:
                System.out.println("sábado");
                break;
            default:
                System.out.println("dia incorreto");
                break;
        }
    }
}
