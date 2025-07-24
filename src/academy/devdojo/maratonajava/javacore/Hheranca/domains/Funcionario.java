package academy.devdojo.maratonajava.javacore.Hheranca.domains;

// funcionário herda tudo da classe pessoa. seus atributos e métodos.
public class Funcionario extends Pessoa {
    private double salario;

    // construtores de uma classe que extende outra usam "super()" para repassar os parametros do construtor local para o construtor da classe pai e dentro vai os parametros pedidos pelo construtor da classe pai/extendida.
    public Funcionario(String nome) {
        super(nome);
    }

    // esse métod imprime está sobreescrevendo o métod da classe pessoa. quando funcionário chamar o metodo imprime() será chamado esse de funcionário. caso não existisse esse metodo aqui, seria chamado o metodo imprime da classe pessoa na qual é extendida.
    public void imprime() {

        // o "super" me da acesso aos metodos da classe pai pessoa. sem o super, funcionario só imprime o salário. como super e chamando o metodo impripe da classe pai, é executado primeiro o metodo da classe pai pessao e depois o resto que é pedido no metodo da classe filha funcionário.
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        // como a classe funcionario extende a classe pessoa e os atributos da classe pessoa estão com o modificador de acesso como "protected", a classe funcionario agora tem acesso aos atributos da classe pessoa através do "this."... caso o modificador de acesso fosse "public" também funcionaria. o que não ocorreria caso os modificadores de acesso fosse "private".
        System.out.println("eu " + this.nome + " ");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
