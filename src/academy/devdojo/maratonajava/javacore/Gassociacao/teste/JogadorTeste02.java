package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.domains.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domains.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        // duas classes diferentes
        Jogador jogador01 = new Jogador("pelé");
        Time time = new Time("Brasil");

        // uma classe sendo usada dentro da outra. o que permite acessar métods da classe time dentro da classe jogado... pois tornou a propriedade "time" da classe jogador um objeto.
        jogador01.setTime(time);
        jogador01.imprime();
    }
}
