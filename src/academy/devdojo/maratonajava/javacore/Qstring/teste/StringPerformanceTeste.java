package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringPerformanceTeste {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        // é possível usar "_" (underline) nos número para ajudar a visualização e divição de centenas e milhares ou milhões.
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("tempo gasto para String: " + (fim - inicio) + " ms");


        inicio = System.currentTimeMillis();
        concatStringBuilder(30_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para StringBuilder: " + (fim - inicio) + " ms");


        inicio = System.currentTimeMillis();
        concatStringBuffer(30_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para StringBuffer: " + (fim - inicio) + " ms");
    }

    //quanto maior a string e as iterações nela, menor a performance.
    private static void concatString(int tamanho) {
        String texto = "";

        // por conta da imutabilidade das strings, num loop onde é adicionado algo a uma string, ela vai criando novas copias com a adição nova. se comerçar vazia e adicionar um caractere, o java salva esse unico caractere na pool de strings... caso você vá fazendo concatenações, ele mantem a string anterior na pool, faz uma copia dela com o novo caractere que foi concatenado.
        for (int i = 0; i < tamanho; i++) {
            texto += i; // 0, 01, 012, 0123
        }
    }

    // StringBuilder e StringBuffer fazem basicamente a mesna coisa. melhoram o desenpenho quando se trabalha com strings. PRECISOU CONCATENAR MUITA STRING, USAR UM DOS DOIS.
    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    // usado especialmente em ambientes muilt thread. muitiplas threads acessando um único recurso. com o buffer, somente uma thread pode acessar o recurso por vez. sem ele, todas acessam de uma vez o que pode causar inconsistencia nos dados.
    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
