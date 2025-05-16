package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains;

public class ImprimeEstudante {

    // métod com parâmetro com tipo referência. aqui o parâmetro "estudante" é do tipo (segue a estrutura) da classe "Estudante". com isso, ao usar o parâmetro, só poderá acessar os valores definidos na classe "Estudante".
    public void imprime(Estudante estudante){
        System.out.println("---------------------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        // por boas práticas não se faz auterações dentro de um objeto/métod, pois ele vai repassar essa auteração onde ele for chamado.
        estudante.nome = "gohan";
    }
}
