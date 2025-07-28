package academy.devdojo.maratonajava.javacore.Kenum.domains;

public class Cliente {

    //é possível criar uma classe enum dentro de outra classe. mas criar num arquivo separado é mais adequado.

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome = '" + nome + '\'' +
                ", tipoCliente = " + tipoCliente.nomeRelatorio +
                ", tipoClienteInt = " + tipoCliente.VALOR +
                ", tipoPagamento = " + tipoPagamento +
                '}';
    }
}
