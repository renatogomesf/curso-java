package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domains;

public class Carro {
    private String nome;

    // aqui o atributo com tipo referência está sendo inicializado fazendo uma referência a uma outra classe/objeto (a sua estrutura... atributos e metodos). por ser final, essa referência não muda. mas os valores dentro da classe/objeto podem mudar.
    public final Comprador COMPRADOR = new Comprador();

    // atributos que não queremos que sejam modificados nos chamamos de constates. uma vez criados eles vão permanecer da mesma forma até o código se parado e não podem ter seu valor alterado.
    // no java, algo que deve ser constante (atributo ou metodo) é definido pela palavra "final". para o uso do "final" é obrigatório passar um valor pro atributo. ele não aceita o essa forma "public static final double VELOCIDADE_LIMITE;" sem atribuir um valor. ou seja, tem que ser dessa forma "public static final double VELOCIDADE_LIMITE = **valor**"
    // existe uma conversão no java que, atributos constantes, devem sem tudo maiúsculo e, caso tenha mais de uma palavra, deve ser separado por underscore/underline.
    public static final double VELOCIDADE_LIMITE = 250;
    //public static final double VELOCIDADE_LIMITE;

    // outras forma de atribuir o valor à variável.
    static {
        //VELOCIDADE_LIMITE = 250;
    }

    // para inicializar desta forma, é preciso que o atributo não seja static.
    public Carro() {
        //VELOCIDADE_LIMITE = 250;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
