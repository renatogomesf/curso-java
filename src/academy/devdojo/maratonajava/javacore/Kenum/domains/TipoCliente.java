package academy.devdojo.maratonajava.javacore.Kenum.domains;

//todos os atributos criados numa classe do tipo "enum" são constantes (não mudam).
public enum TipoCliente {
    //não precisam de tipo ou modificador de acesso.
    //PESSOA_FISICA,
    //PESSOA_JURIDICA,

    //outra forma de atributos de uma classe enum. desta forma é usado o numero atribuidos a elas e é obrigatório o uso de construtor.
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    // esse atributo deve vir sempre depois dos enuns
    public final int VALOR;
    public final String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }
}
