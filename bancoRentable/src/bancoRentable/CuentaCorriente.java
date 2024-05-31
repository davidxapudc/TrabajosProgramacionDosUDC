package bancoRentable;

public class CuentaCorriente extends Cuenta {
    private double cupoSobregiro;

    public CuentaCorriente(String numero, double cupo) {
        super(numero);
        this.cupoSobregiro = cupo;
    }

    @Override
    public boolean retirar(double cantidad) {
        if (Saldo + cupoSobregiro >= cantidad) {
            Saldo -= cantidad;
            return true;
        }
        return false;
    }
    
}