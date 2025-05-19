package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.domains.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("pelé");
        Jogador jogador02 = new Jogador("romário");
        Jogador jogador03 = new Jogador("cafu");

        // associação entre array e objeto. temos aqui um array de objetos, pois cada instanciamento da classe cria um objeto diferente e são colocados no array.
        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        for(Jogador jogador: jogadores){
            jogador.imprime();
        }
    }
}
