package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Midoriya";
        estudante1.idade = 15;
        estudante1.sexo = 'm';

        estudante2.nome = "Sakura";
        estudante2.idade = 20;
        estudante2.sexo = 'f';

        estudante1.imprime();
        estudante2.imprime();
    }
}
