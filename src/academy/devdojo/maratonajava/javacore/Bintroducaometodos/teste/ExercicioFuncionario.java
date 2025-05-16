package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains.Funcionario;

public class ExercicioFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("francisco");
        funcionario.setIdade(35);

        double[] salarios = {1200, 987.32, 2000};
        funcionario.setSalarios(salarios);

        funcionario.imprimir();
        funcionario.mediaSalario();
    }
}
