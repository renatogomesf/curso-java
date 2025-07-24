package academy.devdojo.maratonajava.javacore.Hheranca.domains;

// todas as classes do java extendem a classe "Object". pois todas as classes são objetos.
public class Pessoa {

    // protected: mantem os atributos/metodos privados, mas dá acesso a essas propriedades/metodos às classes que extenderem essa classe pessoa (em qualquer pasta que estejam) ou classes que estejam na mesma pasta que essa classe pessoa (como se as prorpiedades/metodos estivessem públicas). ou seja, todas as subclasses (classes filhas onde quer que estejam) ou classes que estejam na mesma pasta da classe com propriedades e metodos com protected.
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("dentro do bloco de inicialização estático de PESSOA");
    }

    {
        System.out.println("dentro do bloco de inicialização de PESSOA 1");
    }

    {
        System.out.println("dentro do bloco de inicialização de PESSOA 2");
    }

    public Pessoa(String nome) {
        System.out.println("dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
