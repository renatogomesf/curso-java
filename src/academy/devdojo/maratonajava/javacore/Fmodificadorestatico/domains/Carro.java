package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domains;

public class Carro {
    private String nome;
    private double velocidadeMaxima;

    // agora a propriedade velocidade limite pertence à classe carro. antes era atribuidada a cada objeto/instancia que era criado individualmente... cada objeto/instância poderia fazer sua modificação e ter seu valor específico. mas agora como é estático, caso esse valor seja modificado por alguma instancia/objeto, será modificado para todos os demais.
    // se torna algo estático... (quando uma classe tem algo por padrão) mesmo valor para todas as vezes que essa classe for instanciada. caso não fosse estático, o valor poderia ser diferente a cada instanciamento.
    // por ser estático, deixa de usar o "this" para acessar seu valor, porque agora pertence à classe. pois o this é usado para fazer referencia à propriedade do objeto em si. então, agora usa-se o nome da classe e o nome do atributo estático desejado.
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void impirme() {
        System.out.println("=========================");
        System.out.println("nome: " + this.nome);
        System.out.println("velocidade máxima: " + this.velocidadeMaxima);
        System.out.println("velocidade limite: " + Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // métods estáticos só podem acessar e modificar propriedades estáticas. não dá para acessar ou modificar propriedades nõa estáticas pois elas podem mudar a cada vez que a classe for instanciada.
    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    // static torna o atributo ou métod pertencente à classe. com isso, para acessar e modificar seu valor, usa-se o nome da classe e o atributo em seguida.
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
