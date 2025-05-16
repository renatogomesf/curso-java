package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("jiraia");
        pessoa.setIdade(25);
        pessoa.imprime();

        String nome = pessoa.getNome();
        int idade = pessoa.getIdade();

        System.out.println("nome com get: " + nome);
        System.out.println("idade com get: " + idade);
    }
}
