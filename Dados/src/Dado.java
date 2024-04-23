import java.util.Random;
public class Dado {

 Random random;

    public Dado(Random random) {
        this.random = random;
    }

    public int lanzar() {
        Random random = new Random();
        // Generamos un número aleatorio entre 1 y 6 (inclusive)
        return random.nextInt(6) + 1;
    }
    
}