package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // temos 8 tipos primitivos: int, double, float, char, byte, short, long, boolean

        // para nomeclatura de variáveis, quando a palavra é simples, começa com letra minúscula. agora, quando a palavra for composta, a letra de cada palavra depois da primeira começa maiúscula. "titlecase"

        int ageOfFather;
        int age = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M'; // recebe literalmente uma letra

        System.out.println("a idade é " + age);
    }
}
