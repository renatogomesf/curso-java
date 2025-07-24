package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.domains.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.domains.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domains.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domains.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rio Grande do Sul");
        Aluno aluno = new Aluno("Marcos", 17);
        Professor professor = new Professor("Éder", "Química");

        Aluno[] alunos = {aluno};

        Seminario seminario = new Seminario("A Química entre a Química", alunos, local);

        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
