package bancoRentable;

public class CuentaAhorros extends Cuenta implements Rentable {
    private double interes;

    public CuentaAhorros(String numero, double interes) {
        super(numero);
        this.interes = interes;
    }

    public boolean retirarSaldo(double cantidad) {
        if (Saldo >= cantidad) {
            Saldo -= cantidad;
            return true;
        }
        return false;          
    }

    public double consultarSaldo() {
        return getSaldo();
    }

    public double calcularIntereses() {
        return Saldo * interes;
    }

    @Override
    public boolean retirar(double cantidad) {
        return retirarSaldo(cantidad);
    }

}

