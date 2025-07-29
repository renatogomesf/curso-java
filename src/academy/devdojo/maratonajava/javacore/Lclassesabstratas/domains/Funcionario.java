package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domains;

//clases abstratas não podem ser instanciadas. elas servem como um template para outras classes que extenderem ela.
//classes abstratas são criadas para serem extendidas/serem super classe.
//não permite o uso do "final"
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    //ainda é preciso o uso do construtor, pois a classe que irá extender precisa usar o super() para passar os dados.
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
