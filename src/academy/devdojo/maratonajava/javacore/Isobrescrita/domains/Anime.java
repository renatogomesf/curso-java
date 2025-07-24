package academy.devdojo.maratonajava.javacore.Isobrescrita.domains;

public class Anime {
    private String nome;
    private int episodios;

    // sobrescrevendo o metodo "toString" da classe Object. esse metodo caso seja chamado automaticamente da classe Object, retorna o packge(caminho até a clase), o nome da classe e um "@" com um hash (espaço em memória).

    // criando um metodo "toString" e usando a anotação "@Override" para garantir que está sobrescrevendo o metodo da classe pai Object. com isso, posso fazer um retorno padrão do meu modo quando a classe é chamada sozinha. sem o uso do "."(ponto) alguma coisa (propriedade ou metodo).
    @Override
    public String toString() {
        return this.nome + " " + this.episodios;
    }

    public Anime(String nome, int episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
