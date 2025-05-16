package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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

        double somaSalario = 0;
        int tamanhoArray = this.salarios.length;

        for (double valor : this.salarios) {
            somaSalario += valor;
        }

        double media = somaSalario / tamanhoArray;

        System.out.println("média: " + media);
    }
}
