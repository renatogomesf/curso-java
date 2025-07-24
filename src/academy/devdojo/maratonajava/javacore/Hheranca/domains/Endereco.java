package academy.devdojo.maratonajava.javacore.Hheranca.domains;

public class Endereco {
    private String rua;
    private String cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    // exemplo de como uma classe na mesma pasta da classe com suas propriedades e metodos com o modificador de acesso "protected" pode acessar suas propriedaes e metodos da classe chamada mesmo estando com protected.
    public void imprime(){
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "teste";
    }
}
