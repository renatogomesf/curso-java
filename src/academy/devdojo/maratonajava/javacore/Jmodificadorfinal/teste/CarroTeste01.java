package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.teste;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domains.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        // demonstração de erro ao tentar atribuir valor a uma variável constante (final).
        //Carro.VELOCIDADE_LIMITE = 180;

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("lucas");
        System.out.println(carro.COMPRADOR);
    }
}
