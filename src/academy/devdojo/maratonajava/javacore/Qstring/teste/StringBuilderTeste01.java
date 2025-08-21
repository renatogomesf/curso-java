package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "william suane";
        nome.concat(" devDojo");
        System.out.println(nome);

        // com o StringBuilder, perde-se a função de "strings imutáveis". porque StringBuilder não é uma string... é uma classe que trabalha com strings. ou seja, ele MUDA a string original e não fica fazendo cópias e consumindo memória.
        //caso não passe parâmetros, o StringBuilder usa/aloca, por padrão, 16 caractere de espaço na memória.
        StringBuilder sb = new StringBuilder("william suane");

        // para adicionar algo na variável da stringbuffer ou a uma string inicializada no "new", não se faz da forma normal como "sb = 'texto'" ou com o uso do "concat()". usa-se o "append()". e ele permite todos os tipos primitovos e não primitivos.
        sb.append(" devdojo").append(" academy");

        // verificar sempre o retorno. com substring retorna string, precisa jogar numa variável do tipo string.
        String teste = sb.substring(0,3);

        // reverse() retorna uma StringBuilder, o que permite o uso direto sem assossiar a uma variável.
        sb.reverse();
        sb.reverse();

        // delete(0,3): deleta caractere iniciando em um indice determinado (neste caso, 0) até outro indice desejado (neste caso, 3). deletas os caracteres das posições 0,1,2. sempre lembrar que é 1 a menos do valor final colocado no metodo.
        sb.delete(0,3);

        System.out.println(sb);
        System.out.println(teste);
    }
}
