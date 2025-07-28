package academy.devdojo.maratonajava.javacore.Kenum.domains;

//todos os atributos criados numa classe do tipo "enum" são constantes (não mudam).
public enum TipoCliente {
    //não precisam de tipo ou modificador de acesso.
    //PESSOA_FISICA,
    //PESSOA_JURIDICA,

    //outra forma de atributos de uma classe enum. desta forma é usado o numero ou qualquer outro valor atribuido a elas e é obrigatório o uso de construtor.
    //quando um dos enum for chamado (PESSOA_FISICA ou PESSOA_JURIDICA), os valores atribuidos a ele será passado pros parâmetros do construtor que, por sua vez, atribui aos atributos/variáveis definidos depois dos enuns. com desta forma é possível acessar somente o valor desejado como 1 ou 2 ao invés da string completa, facilitando no manejo das informações.
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    // esse atributo deve vir sempre depois dos enuns
    public final int VALOR;
    public final String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    // busca por um valor de um enum (neste caso buscara uma string) e irá retornar o proprio enum.
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {

        // values(): retorna um array com todos os enuns.
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.nomeRelatorio.equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }
}
