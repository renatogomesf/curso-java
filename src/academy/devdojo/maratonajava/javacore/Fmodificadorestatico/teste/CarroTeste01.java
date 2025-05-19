package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domains.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro("BMW", 280);
        Carro carro02 = new Carro("Mercedes", 275);
        Carro carro03 = new Carro("Audi", 290);

        // o métod de modificar a velocidade só afeta o carro 01, ou seja, só afeta um objeto específico pois a propriedade velocidadeLimte não é estática.
        // mas, ao muda-lo para estático, essa mudança é propagada para as demais vezes que a classe carro for instanciada.
        carro01.setVelocidadeLimite(180);// está dando erro pois o métod está como estático...

        // passando o métod para estático, agora ele pertence à classe e para acessa-lo, precisa usar o nome da classe... pois ele não pertence a uma instancia em si.
        Carro.setVelocidadeLimite(300);
        System.out.println(Carro.getVelocidadeLimite());

        carro01.impirme();
        carro02.impirme();
        carro03.impirme();
    }
}
