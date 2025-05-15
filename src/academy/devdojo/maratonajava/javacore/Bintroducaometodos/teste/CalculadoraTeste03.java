package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);

        System.out.println("---------------------------------");

        // quando o retorno é void, a chamada do métod não pode assossiada a uma variável.
        calculadora.imprimeDivisaoDeDoisNumeros(20,0);
    }
}
