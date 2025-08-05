package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        // como agora que o metodo "divisao" retorna um erro (do tipo runtime. tratamento opicional), caso esse erro não seja tratado, o código para aqui e não segue para o "System.out.println("finalizado")". para prosseguir, precisaria de mais um tratamento de erro aqui usando o try/catch.
        System.out.println(divisao(1, 0));

        System.out.println("finalizado");
    }

    // throws IllegalArgumentException: é um aviso para que usar o metodo. significa que o metodo PODE - não necessariamente irá lançar - lançar um erro do tipo IllegalArgumentException.
    // é comum não ver exceptions do tipo runtime com declaração de throws.

    /**
     * @param a qualquer valor inteiro
     * @param b não pode ser zero
     * @return retorna um inteiro
     * @throws IllegalArgumentException caso b seja zero
     * */
    private static int divisao(int a, int b) throws IllegalArgumentException{

        // caso caia dentro desse "if", o código abaixo não será executado. o código só continua caso dê false.
        if (b == 0) {

            // lançando um erro por conta própria para caso o valor de b seja 0(zero).
            // o lançamento de exceptoin expecíficas é necessário. neste caso de um dos argumentos serem ilegais, temos o "IllegalArgumentException()" do próprio java.
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }

        // com o uso do if lançando um erro, não se faz necessário o uso de um try/catch. podendo fazer o retorno direto de a/b.
        return a / b;

        // o "try/catch" não para a execução do código. esse metodo precisa de um retorno, caso dê tudo certo dentro do "try", o metodo tem seu rerorno e ta tudo ok. agora, caso caia no "catch", o metodo fica sem retorno, o que gera erro no metodo. deste modo, ao final do "try/catch", é colocado um "return 0 (retorno do tipo exigido pelo metodo)" para que não gere erros.
//        try {
//            return a / b;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//
//        return 0;
    }
}
