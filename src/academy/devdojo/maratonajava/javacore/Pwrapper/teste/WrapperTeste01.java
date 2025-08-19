package academy.devdojo.maratonajava.javacore.Pwrapper.teste;

public class WrapperTeste01 {
    public static void main(String[] args) {

        // Wrapper são objetos que vão encapsular os tipos primitivos e transformar em objetos.

        // tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'w';
        boolean booleanP = false;

        // tipos wrapper/objeto (classes representando tipos primitivos. agora são objetos). basta começar o nome do tipo com letra maiúscula. com exceção do "int" e "char"... int vira Integer e char vira Character
        // com tipos de referência e por serem classes, é possível usar metodos. diferente do tipo primitivo.
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L; // o uso da indicação de long com o "L" para o tipo long é obrigatório.
        Float floatW = 10F; // o uso da indicação de long com o "F" para o tipo float é obrigatório.
        Double doubleW = 10D; // o uso da indicação de long com o "D" para o tipo double é obrigatório.
        Character charW = 'w';
        Boolean booleanW = false;
    }
}
