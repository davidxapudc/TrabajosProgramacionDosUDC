package bancoRentable;


public abstract class Cuenta {
    private String Numero;
    protected double Saldo;

    public Cuenta (String Numero){
        this.Numero = Numero;
        this.Saldo = 0.0;

    }

    public double getSaldo(){
        return Saldo;
    }

    public String getNumero(){
        return Numero;
    }

    public void consignar(double cantidad){
        Saldo += cantidad;

    }

    public abstract boolean retirar(double cantidad);
    }
    







