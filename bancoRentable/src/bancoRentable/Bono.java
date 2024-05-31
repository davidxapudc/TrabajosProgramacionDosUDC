package bancoRentable;

public class Bono implements Rentable {
    private double saldo;
    private double interes;

    public Bono(double saldo, double interes) {
        this.saldo = saldo;
        this.interes = interes;
    }


    public double consultarSaldo() {
        return saldo;
    }


    public double calcularIntereses() {
        return saldo * interes;
    }
}

