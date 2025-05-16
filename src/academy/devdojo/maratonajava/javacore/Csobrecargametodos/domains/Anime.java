package academy.devdojo.maratonajava.javacore.Csobrecargametodos.domains;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    // sobrecarga de métod é ter dois métod com o mesmo nome mas com a quantidade dos parâmetros diferente. o métod a ser chamado vai depender dos parâmetros passados.
    // caso não passe o "genero" na chamada do métod "init", ele irá considerar esse primeiro métod.
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    // caso seja passado o "genero" na chamada do métod "init", então ele irá chamar esse segundo métod.
    public void init(String nome, String tipo, int episodios, String genero) {

        // para não ter repetição de código entre os métods com sobrecarga, é possível chamar aquele que se repete e passar os valores.
        this.init(nome, tipo, episodios);
        //this.nome = nome;
        //this.tipo = tipo;
        //this.episodios = episodios;
        this.genero = genero;
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
