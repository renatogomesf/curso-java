package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains;

public class Calculadora {

    // public: modificador de acesso. neste caso é publico. todos tem acesso.
    // void: não retorna nada para quem chamou esse métod0.
    // nome do métod0 sempre inicia com letra minúscula.
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    // parâmetros do métod0... diz o tipo e depois o nome.
    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    // retorno double... os retornos podem ser primitvos ou reference
    // como agora tem retorno, o métod0 precisa estar acossiado a uma variável para receber o retorno.
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }

        return num1 / num2;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("não existe divisão por zero");
            return;
        }

        System.out.println(num1 / num2);
    }


    // está recebendo valores mas imprime os valores atribuidos nesse métod.
    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("dentro do alteraDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }


    // VARARGS ===============================================================================
    public void somaArray(int[] numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }

    // agora com varargs
    // por debaixo dos panos, o valores recebidos são colocados/montados num array.
    public void somaVarArgs(int... numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }

    // SE EXISTIR MAIS DE UM PARÂMETRO para o métod, o varargs precisa vir no final.
    // ex: numa sequência de valores, o primeiro vai pra "num1", o segundo para "num2" e restante para "números"
    public void somaVarArgsComMaisDeUmParametro(float num1, double num2, int... numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
        System.out.println(num1);
        System.out.println(num2);
    }
}
