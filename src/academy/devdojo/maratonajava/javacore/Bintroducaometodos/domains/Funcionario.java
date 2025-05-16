package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains;

import java.lang.reflect.Constructor;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double somaSalario = 0;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (this.salarios != null) {
            for (double salario : this.salarios) {
                System.out.println(salario);
            }
        }
    }

    public void mediaSalario() {

        if (this.salarios == null) {
            return;
        }

        int tamanhoArray = this.salarios.length;

        for (double valor : this.salarios) {
            this.somaSalario += valor;
        }

        double media =this.somaSalario / tamanhoArray;

        System.out.println("média: " + media);
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
