
import java.util.ArrayList;

public class BancoMain {
    public static void main(String[] args) {

        boolean pudoCrear;
        Banco banco = new Banco("MuchoDinero");
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Juan", "123"));
        clientes.add(new Cliente("Pedro", "456"));
        clientes.add(new Cliente("Maria", "789"));
        clientes.add(new Cliente("Ana", "101"));
        pudoCrear = banco.adicionarCuenta("123", 1000, "Ahorros",clientes.get(0));
        System.out.println(pudoCrear);
        pudoCrear = banco.adicionarCuenta("456", 5000, "Corriente",clientes.get(1) );
        System.out.println(pudoCrear);
        pudoCrear = banco.adicionarCuenta("789", 3000, "Ahorros",clientes.get(2)); 
        System.out.println(pudoCrear);
        pudoCrear = banco.adicionarCuenta("101", 8000, "Corriente",clientes.get(3));
        System.out.println(pudoCrear);
        System.out.println("Total dinero en el banco: " + banco.consultarTotalDinero());    

     
        System.out.println("Cliente con mayor saldo: " + banco.consultarClienteConMayorSaldo());
       
}
}
