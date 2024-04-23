import java.util.Random;

public class MainJuegoDados {

    public static void main(String[] args) {
        
        Jugador jugador = new Jugador();
        Random random = new Random();
        Dado dado1 = new Dado(random);
        Dado dado2 = new Dado(random);
        jugador.jugar(dado1,dado2);

    }
}


