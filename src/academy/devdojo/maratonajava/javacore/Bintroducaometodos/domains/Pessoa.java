package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains;

public class Pessoa {

    // com "private" só é possível acessar as variáveis/atributos dentro da própria classe.
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    // existe uma convençõa sobre setar um valor dentro de um atributo private. cria-se um métod com nome "set" e o nome da varoável/atributo.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("idade inválida!");
            return;
        }
        this.idade = idade;
    }

    // existe uma convençõa sobre peagr um valor dentro de um atributo private. cria-se um métod com nome "get" e o nome da varoável/atributo.
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
