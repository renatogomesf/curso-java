package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // temos 8 tipos primitivos: int, double, float, char, byte, short, long, boolean

        // para nomeclatura de variáveis, quando a palavra é simples, começa com letra minúscula. agora, quando a palavra for composta, a letra de cada palavra depois da primeira começa maiúscula. "titlecase"

        //Tipo	     Tamanho (bits)	   Valor Mínimo/Máximo	            Exemplo de Uso
        //byte	     8	               -128	127	                        Pequenos números inteiros
        //short	     16	               -32.768	32.767	                Números inteiros maiores que byte
        //int	     32	               -2³¹ 2³¹-1 	                    Números inteiros padrão
        //long	     64	               -2⁶³	2⁶³-1	                    Números inteiros muito grandes
        //float      32	               ±1.4 × 10⁻⁴⁵	±3.4 × 10³⁸	        Números de ponto flutuante simples
        //double	 64	               ±4.9 × 10⁻³²⁴ ±1.8 × 10³⁰⁸	    Ponto flutuante de precisão dupla
        //char	     16	               '\u0000' (0)	'\uffff' (65.535)	Armazena um caractere Unicode
        //boolean	 1                 false true	                    Valores lógicos

        int ageOfFather;
        int age = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0d; //o conpilado sabe que tem espaço depois do ponto, não é preciso especificar com 'd' ao final. fica opcional
        float salarioFloat = 2500.0f; // o conpilado não sabe que tem espaço depois do ponto, então é preciso especificar com 'f' ao final para especificar
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;

        // recebe literalmente uma letra. o valor decimal que for colocado (de 1 a 127) será traduzido para seu equivalente na tabela ASCII. ex: char caractere = 87 -> imprime 'w', char caractere = 37 -> imprime '%'
        char caractereASCII = 37;

        // recebe literalmente uma letra. o valor que for colocado da tabela Unicode será traduzido para seu equivalente ex: char caractere = '\\u"valorUnicode"', char caractere = '\\u0041' -> imprime 'A'
        char caractereUnicode = '\u0041';
        char caractereUnicode2 = '\u0047';


        System.out.println("a idade é " + age);
        System.out.println("ASCII " + caractereASCII);
        System.out.println("Unicode " + caractereUnicode);
        System.out.println("Unicode " + caractereUnicode2);



        // CASTING
        //Casting: força um tamanho diferente de tipo dentro de outro syntax ("tipo a ser considerado"). Um tipo maior Dentro de um menor. Ele vai cortando bit para poder caber e sai um valor estranho. Colocar um long dentro do int
        int age2 = (int) 10000000000L;
        byte teste = (byte) 128;

        System.out.println("casting com int colocando um long " + age2);
        System.out.println("casting com byte colocando um int " + teste);

        // mas caso o valor caiba, ele imprime normal.
        float salarioFloat2 = (float) 2500.0d;
        System.out.println("casting com float colocando um double " + salarioFloat2);



        // Strings: não é tipo primitivo. é um referenc tipe. é uma classe, começa com a letra Maiúscula e usa áspas duplas "".
        String texto = "pode adicionar um grande texto. não tem limite";
        System.out.println(texto);
    }
}
