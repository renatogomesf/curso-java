package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains.Funcionario;

public class ExercicioFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "francisco";
        funcionario.idade = 35;
        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.imprimir();
        funcionario.mediaSalario();
    }
}
