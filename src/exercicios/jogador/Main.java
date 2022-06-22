package exercicios.jogador;

public class Main {
    public static void main(String[] args) {

        Time time1 = new Time("Seleção Brasileira");

        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Cafú");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        jogador3.setTime(time1);

        time1.setJogadores(jogadores);

        time1.imprime();

    }
}
