package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.domains.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domains.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("cafu");
        Jogador jogador2 = new Jogador("pelé");
        Jogador jogador3 = new Jogador("neymar");
        Time time = new Time("brasil");

        Jogador[] jogadores = {jogador, jogador2, jogador3};

        jogador.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- jogador ---");
        jogador.imprime();
        jogador2.imprime();
        jogador3.imprime();
        System.out.println("--- time ---");
        time.imprime();
    }
}
