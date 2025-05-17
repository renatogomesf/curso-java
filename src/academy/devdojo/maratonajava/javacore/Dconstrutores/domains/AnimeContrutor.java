package academy.devdojo.maratonajava.javacore.Dconstrutores.domains;

public class AnimeContrutor {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    // construtor possui modificador de acesso.
    // NÃO POSSUI retorno algum. ou seja, não põe informação de retorno.
    // TEM QUE TER o mesmo nome da classe.
    // é sempre a primeira coisa a ser executada.
    public AnimeContrutor(String nome, String tipo, int episodios, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    // é possível fazer sobrecarga de construtor também.
    public AnimeContrutor(){

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int espisodios) {
        this.episodios = espisodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
