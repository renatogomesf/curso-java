package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class ExercicioCarro {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "celta";
        carro01.modelo = "LT";
        carro01.ano = 2014;

        Carro carro02 = new Carro();
        carro02.nome = "sw4";
        carro02.modelo = "platinum";
        carro02.ano = 2025;

        carro01 = carro02; // aqui carro 1 faz referência a carro 2 e imprime as mesma informações que carro 2. se remover essa referência cada um imprime seu carro.

        System.out.println("CARRO 01 / nome: " + carro01.nome + " moedelo: " + carro01.modelo + " ano: " + carro01.ano);

        System.out.println("CARRO 02 / nome: " + carro02.nome + " moedelo: " + carro02.modelo + " ano: " + carro02.ano);
    }
}
