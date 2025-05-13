package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //ARITIMÉTICOS (+, -, /, *)===================================================
        int numero01 = 10;
        int numero02 = 20;
        //o resultado entre dois números INTEIROS sempre será um número inteiro;
        double resultado = numero01 / numero02;
        //System.out.println(resultado);

        double numero03 = 10;
        double numero04 = 20;
        //para dar o resultado correto, precisa indicar que não são inteiros;
        double resultado2 = numero03 / numero04;
        //System.out.println(resultado2);

        // % (resto da divisão)======================================================
        int resto = 20 % 2;
        //System.out.println(resto); // resto 0

        int resto2 = 21 % 2;
        //System.out.println(resto2); // resto 1

        // LÓGICOS (<, >, <=, >=, ==, !=) retorna valor booleano. true ou false. =======
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMenorIgualVinte = 10 <= 20;
        boolean isDezMaiorIgualVinte = 10 >= 20;
        //System.out.println("10 maior que 20: "+isDezMaiorQueVinte);
        //System.out.println("10 menor que 20: "+isDezMenorQueVinte);
        //System.out.println("10 maior igual 20: "+isDezMaiorIgualVinte);
        //System.out.println("10 menor igual 20: "+isDezMenorIgualVinte);

        //LÓGICOS (&&:(AND), ||:(OR), !:(NOT))========================================
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        //System.out.println(isDentroDaLeiMaiorQueTrinta);
        //System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000f;

        boolean isPlayStationCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;

        //System.out.println(isPlayStationCompravel);

        //ATRIBUIÇÃO (=, +=, -=, *=, /=, %=)=======================================
        double bonus = 1800;
        //bonus = bonus + 1000;
        bonus += 1000;

        double bonus2 = 1800;
        bonus2 -= 1000;

        double bonus3 = 1800;
        bonus3 *= 10;

        double bonus4 = 1800;
        bonus4 /= 1000;

        double bonus5 = 1800;
        bonus5 %= 100;

        //System.out.println(bonus);
        //System.out.println(bonus2);
        //System.out.println(bonus3);
        //System.out.println(bonus4);
        //System.out.println(bonus5);

        //INCREMENTO E DECREMENTO
        int contador = 0;
        contador ++;
        //System.out.println(contador);

        int contador2 = 0;
        contador2 --;
        //System.out.println(contador2);

        // a ordem do incremento ou decremento tem diferença.
        int contador3 = 0;
        System.out.println("pos-incremento: "+ contador3++); // imprime 0 e depois incrementa.
        System.out.println("pre-incremento: "+ ++contador3); // incrementa e depois imprime.
    }
}
