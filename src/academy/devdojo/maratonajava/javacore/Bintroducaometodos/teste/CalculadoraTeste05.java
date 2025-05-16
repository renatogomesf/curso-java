package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1, 2, 3, 4, 5};

        // métod com (int[] numeros): espera a passagem de um array pronto. n]ap aceita os valores soltos na chamada do métod.
        calculadora.somaArray(numeros);

        // métod com (int... numeros): permite passar os valores na própria chamada do métod.
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);

        // ex: numa sequência de valores, o primeiro vai pra "num1", o segundo para "num2" e restante para "números"
        calculadora.somaVarArgsComMaisDeUmParametro(1, 2, 3, 4, 5, 6, 7, 8);
    }
}
