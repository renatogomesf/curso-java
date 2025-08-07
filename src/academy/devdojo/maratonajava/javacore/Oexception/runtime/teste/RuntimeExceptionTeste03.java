package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();

            // finally sempre será executado. independente se cair no try ou no catch ou caso algum erro seja gerado. ótimo quando algo precisa ser finalizado ou fechado independente do resultado.
        } finally {
            System.out.println("fechando recurso liberado pelo SO");
        }

        // sempre exite a possibilidade de cai no catch, então precisa de um return fora do bloco para suprir o retorno do metodo.
        return null;
    }

    public static void abreConexao2() {

        // bloco sem o catch. não é possível o uso somente do try. precisa sempre vir acompnhado pelo catch ou finally.
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados no arquivo");

        } finally {
            System.out.println("fechando recurso liberado pelo SO");
        }

    }
}
