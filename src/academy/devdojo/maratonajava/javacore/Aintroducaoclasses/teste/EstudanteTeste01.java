package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        // é uma variavel de referência "estudante" do tipo Estudante (classe)
        // e para criar objetos é preciso usar o new "nome da classe"()
        // ou seja, a variável que vai criar os objetos dever tipada e instanciada com o nome da classe do objeto que deseja criar.
        Estudante estudante = new Estudante();
        estudante.nome = "teste";
        estudante.idade = 21;
        estudante.sexo = 'm';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
