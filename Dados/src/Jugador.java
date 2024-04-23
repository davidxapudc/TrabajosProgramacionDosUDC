

public class Jugador {

    public void jugar(Dado dado1, Dado dado2) {
        int valor1 = dado1.lanzar();
        int valor2 = dado2.lanzar();
        System.out.println("Dado 1: " + valor1);
        System.out.println("Dado 2: " + valor2);
        if (valor1 > valor2) {
            System.out.println("Gano el primer dado");
        } else if (valor1 < valor2) {
            System.out.println("Gano el segundo dado");
        } else {
            System.out.println("Empataron");
        }
    }
}