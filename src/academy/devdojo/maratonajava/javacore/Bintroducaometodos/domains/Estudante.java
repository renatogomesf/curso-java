package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    // métod dentro da classe.
    // para usar uma variável dentro da classe, usa-se o "this". ele faz referencia às variáveis dentro da classe.
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
