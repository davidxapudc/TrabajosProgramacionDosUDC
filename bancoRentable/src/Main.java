import bancoRentable.Bono;
import bancoRentable.CuentaAhorros;
import bancoRentable.CuentaCorriente;

public class Main {

 public static void main(String[] args) {

        CuentaAhorros cuentaAhorros = new CuentaAhorros("123456", 5.0);
        cuentaAhorros.consignar(1000000.0);

        System.out.println("Saldo cuenta de ahorros: " + cuentaAhorros.consultarSaldo()); 

        Bono bono = new Bono(5000000.0, 10.0);
        System.out.println("Saldo bono: " + bono.consultarSaldo()); 

        CuentaCorriente CuentaCorriente = new CuentaCorriente("654321", 500000.0);
        CuentaCorriente.consignar(1000000.0);
        System.out.println("Saldo cuenta corriente: " + CuentaCorriente.getSaldo());

    }
}

