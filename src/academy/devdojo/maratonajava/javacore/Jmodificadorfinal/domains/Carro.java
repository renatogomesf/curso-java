package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domains;


// terá casos em que eu não quero que minha classe seja extendida. para isso, usa-se o modificador "final". quando usa "final" nenhuma outra classe onde extender essa. isso impede que o comportamento dessa classe (como os atributos e metodos funcionam) seja modificado, tornando ela constante. mas ainda é possível instancia-la e modificar seu valores para criar objetos diferentes.
//ex: public final class Carro
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

    // usando o modificador "final" num metodo, impede que ele seja sobrescrito por uma classe que extenda essa classe.
    //ex: se uma classe extende essa, quando eu instanciar a classe filha eu posso chamar o metodo "imprime" dessa classe na classe pai e, caso eu deseje, eu posso criar outro metodo "imprime" dentro da classe filha (que extende essa classe pai) com o mesmo nome e, na hora de instanciar, será chamado o metodo da classe filha ao invés da classe pai (ou seja, sobrescrevendo). com o modificador final no metodo, eu impesso essa sobrescrita, o que proibe que eu crie um metodo "imprime" na clase filha (gera erro). sendo permitido somente a chamada do metodo da classe pai na hora de instanciar.
    // em outras palavras, usando o final, eu digo que o comportamento do meu metodo deve ser o mesmo para todas as classes que extendem essa classe. não permitindo modificar.
    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
