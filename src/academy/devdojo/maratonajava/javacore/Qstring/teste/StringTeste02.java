package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "luffy";

        String numeros = "012345";

        String nome2 = "       luffy       ";

        // METODOS DE STRING

        // charAt(): trata a string como se fosse um array. ou seja, cada caractere da string recebe uma posição partindo do 0 (zero). ou seja, é possível acessar uma letra em específico passando a posição dela. charAt(0) acessa a letra da posição 0 (zero).
        System.out.println(nome.charAt(1));

        // length(): traz o tamanho da string.
        System.out.println(nome.length());

        // replace("letra que deseja trocar", "letra que será adicionada"): muda todas as letras desejada, mesmo que estejam repetidas, por outra letra à sua escolha.
        System.out.println(nome.replace("f", "r"));

        // toUpperCase()/toLowerCase(): transforma todas as letras para maiúscula / minúscula.
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());

        // substring(onde começa,onde termina(mas não inclui onde termina)): recorta/tras uma parte da string definindo o indice de onde começa e o indice de onde termina. mas o indice de onde termina não será mostrado. se eu digo que quero que comece no indice 0 e termine no 2, ele irá mostrar todos os carcteres do 0 a 1 e terminar no 2 sem mostrar.
        System.out.println(numeros.substring(0, 2));

        // ou você só diz onde quer começar e será mostrado a partir do indice indicado até o fnal da string.
        System.out.println(numeros.substring(2));

        // trim(): remove os espaços em branco do início e fim da string
        System.out.println(nome2.trim());
        System.out.println(nome2);
    }
}
