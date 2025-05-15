package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains.ImprimeEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        ImprimeEstudante imprimeEstudante = new ImprimeEstudante();

        estudante1.nome = "Midoriya";
        estudante1.idade = 15;
        estudante1.sexo = 'm';

        estudante2.nome = "Sakura";
        estudante2.idade = 20;
        estudante2.sexo = 'f';

        // passando objetos como argumentos/parâmetro.
        imprimeEstudante.imprime(estudante1);
        imprimeEstudante.imprime(estudante2);
    }
}
