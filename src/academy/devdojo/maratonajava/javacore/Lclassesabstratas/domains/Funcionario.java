package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domains;

//clases abstratas não podem ser instanciadas. elas servem como um template para outras classes que extenderem ela.
//classes abstratas são criadas para serem extendidas/serem super classe.
//não permite o uso do "final"
//classes abstratas podem ter metodos abstratos e não abstratos(metodos concretos)
//se uma classe abstrata extende outra classe abstrata, ela não é obrigada a implementar seus metodos. mas as classes que estenden essa classe funcionario agora são obrigadas a implementar os metodos de funcionario e da classe abstrata pessoa.
public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    //ainda é preciso o uso do construtor, pois a classe que irá extender precisa usar o super() para passar os dados.
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

        //o metodo abstrato precisa ser chamado no construtor.
        calculaBonus();
    }

    //FORÇA todas as subclasses/classes filhas a prover a implementação/o corpo deste metodo.
    //metodos abstratos não possuem corpo. o corpo será definido pelas classes que extenderem essa classe.
    //metodos abstratos só podem existir dentro de classes abstratas.
    public abstract void calculaBonus();

    //como o estou implementando o metodo aqui de forma concreta, deixa de ser obrigatorio que as classes filhas implementem o metodo imprime da classe pessoa. e agora gerente e desenvolvedor tem acesso a esse metodo.
    @Override
    public void imprime() {
        System.out.println("imprimindo...");
    }
}
