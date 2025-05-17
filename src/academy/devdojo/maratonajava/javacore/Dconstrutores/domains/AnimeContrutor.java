package academy.devdojo.maratonajava.javacore.Dconstrutores.domains;

public class AnimeContrutor {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    // construtor possui modificador de acesso.
    // NÃO POSSUI retorno algum. ou seja, não põe informação de retorno.
    // TEM QUE TER o mesmo nome da classe.
    // é sempre a primeira coisa a ser executada.
    // pode ter sobrecarga de varios construtores.
    public AnimeContrutor(String nome, String tipo, int episodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    // é possível fazer sobrecarga de construtor também.
    public AnimeContrutor(String nome, String tipo, int episodios, String genero, String estudio) {
        // para chamar um construtor dentro de outro construtor, usa-se "this();" e ele precisa vir em primeiro lugar. e, para não ter repetição de código, basta passar os parâmetros pro construtor que está sendo chamado.
        // só é permitido chamar um construtor dentro de um construtor. o que também significa que o "this();" só pode ser usado dentro de um construtor.
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public AnimeContrutor() {
        System.out.println("construtor sem parametros");
    }




    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
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
