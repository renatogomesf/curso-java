package academy.devdojo.maratonajava.javacore.Ycolecoes.domains;

import java.util.Objects;


// para poder fazer a organização de uma lista através do "sort()", precisa implementar a interface Comparable<"tipo desejado">
public class Manga implements Comparable<Manga>{
    private Long id;
    private String nome;
    private double preco;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(nome, "Nome não pode ser null");

        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // metodo usado para comparar que vem da implementação do Comparable. retorna um inteiro.
    // é aqui onde EU DEFINO como o java vai comparar.
    @Override
    public int compareTo(Manga outroManga) {

        // ----- REGRA PARA DEFINIR RETORNO -----
        // retorna negativo se this < outroManga
        // retorna 0 (zero) se this == outroManga
        // retorna positivo se this > outroManga

//        if (this.id < outroManga.getId()){
//            return -1;
//        }else if (this.id.equals(outroManga.getId())){
//            return 0;
//        } else {
//            return 1;
//        }

        // como o id está tipado como um Wrapper, ele já tem o metodo "compareTo", pois o classe wrapper Long implementa Comparable. basta chamar.
        // return this.id.compareTo(outroManga.getId());

        // tipo primitivo não possui o metodo compareTo... mas tem como transformar o tipo primitivo em wrapper e usar o metodo.
        // return Double.valueOf(preco).compareTo(outroManga.getPreco());
        // return Double.compare(preco, outroManga.getPreco());


        return this.nome.compareTo(outroManga.getNome());
    }
}
