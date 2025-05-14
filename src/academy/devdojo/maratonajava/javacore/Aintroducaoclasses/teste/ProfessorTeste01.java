package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "mestre kami";
        professor.idade = 30;
        professor.sexo = 'm';

        System.out.println("nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
