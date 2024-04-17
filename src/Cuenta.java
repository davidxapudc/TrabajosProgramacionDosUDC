

public class Cuenta {
    String numero;
    String tipo;
    double saldo;
    Cliente titular;

    public Cuenta(String numero, String tipo, double saldo,Cliente titular) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public Cuenta (String numero, String tipo,Cliente titular) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public Cuenta() {

    }

    public String getNumero() {
        return this.numero;
    }


    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return this.saldo;
    }


    public Cliente getTitular() {
        return  this.titular;
    }

    public void consignarSaldo(double saldo) {
        this.saldo += saldo;
    }

    public boolean retirarSaldo(double cantidadARetirar) {
        if (cantidadARetirar <= this.saldo) {
            this.saldo -= cantidadARetirar;
            return true;
        } else {
            return false;
        }           
    }



}