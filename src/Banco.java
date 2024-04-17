import java.util.ArrayList;

public class Banco {
  String nombre;
  ArrayList<Cuenta> cuentas;

  public Banco(String nombre) {
    this.nombre = nombre;
    this.cuentas = new ArrayList<Cuenta>();
  }

  public Cuenta buscarCuenta(String numero) {
    for (Cuenta cuentaTemporal : this.cuentas) {
      if (cuentaTemporal.getNumero().equals(numero)) {
        return cuentaTemporal;
      }
    }
    return null;
  }

  public boolean adicionarCuenta( String numero,double saldoInicial,String tipo,Cliente titular) {
    if (buscarCuenta(numero) != null) {
      return false;
    } else {
      Cuenta nuevaCuenta = new Cuenta(numero, tipo, saldoInicial, titular);
      this.cuentas.add(nuevaCuenta);
      return true;
    }
  }


  public String consultarClienteConMayorSaldo() {
    double mayorSaldo = 0;
    Cliente clienteConMayorSaldo = null;

    for (Cuenta cuenta : cuentas) {
        if (cuenta.getSaldo() > mayorSaldo) {
            mayorSaldo = cuenta.getSaldo();
            clienteConMayorSaldo = cuenta.getTitular();
        }
    }
    if (clienteConMayorSaldo == null) {
        return "No hay cuentas en el banco";
    }
   else 
    {
        return clienteConMayorSaldo.getNombre();
    }
}
  public double consultarTotalDinero() {
    double totalDinero = 0;

    for (Cuenta cuenta : this.cuentas) {
      totalDinero += cuenta.getSaldo();
    }
    return totalDinero;
  }


  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ArrayList<Cuenta> getCuentas() {
    return this.cuentas;
  }

  public void setCuentas(ArrayList<Cuenta> cuentas) {
    this.cuentas = cuentas;
  }

}


