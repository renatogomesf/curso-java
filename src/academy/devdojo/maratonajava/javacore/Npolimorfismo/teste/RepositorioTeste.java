package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {

        // é possível, também, usar uma interface como tipo de uma variável e instanciar todas as classes que implementem esta interface. ou seja, é o mesmo polimorfismo entre classes com herança. aqui a variável "repositorio" assume varias formas. mas somente das classes que implementem seu tipo inteface.
        // com isso, da acesso aos metodos do objeto instanciado.
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        Repositorio repositorio2 = new RepositorioMemoria();
        repositorio2.salvar();

        Repositorio repositorio3 = new RepositorioArquivo();
        repositorio3.salvar();
    }
}
