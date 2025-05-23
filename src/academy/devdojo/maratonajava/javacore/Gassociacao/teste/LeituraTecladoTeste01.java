package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraTecladoTeste01 {

    public static void main(String[] args) {
        // classe/pacote do java que faz a leitura do teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        // next tem varias variações de entradas e retornos. se escolher entrada numérica e escrever letras, vai dar errado.
        // "next()" só lê a primeira palavra. já o "nextLine()" lê a frase completa.
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Digite M (masculino) ou F (feminino) para seu sexo: ");
        // "charAt()": permite selecionar um caractere de uma posição específica de uma frase ou palavra. como ele trada a frase como array, basta colocar o index da letra dentro do parentese.
        char sexo = entrada.next().charAt(0);

        System.out.println("========================================");

        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("sexo: " + sexo);
    }
}
