package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTeste01 {
    // Checked e Unchecked

    // Checked: são filhas da classe Exception (que é um Throwable) diretamente (PRECISA, OBRIGATORIAMENTE, FAZER O TRATAMENTO DO ERRO). e, quando não tratadas, vão lançar um erro em tempo de compilação. ou seja, nem consegue compilar o código. ex: IOException (Input Output Exception) quando se trabalha com arquivos.

    // Unchecked: são filhas da classe RuntimeException diretamente (que, por sua véz, é filha de Exception) (NÃO É OBRIGATÓRIO FAZER UM TRATAMENTO DESSE ERRO PARA O CÓDIGO COMPILAR). essas exceções lançadas pelo programa, quase 100% das vezes é problema do desenvolvedor por ter feito algo errado. ex: NullPointerException quando se tenta acessar um objeto que não existe. esses erros/exceptions ocorrem depois de compilar.

    // é possível lançar minha própria RuntimeException.


    public static void main(String[] args) {

        // exemplo de Exception Unchecked.
        //RuntimeException: NullPointerException
        Object object = null;
        System.out.println(object.toString());

        //RuntimeException: ArrayIndexOutOfBoundsException
        int[] nums = {1,2};
        System.out.println(nums[2]);
    }
}
