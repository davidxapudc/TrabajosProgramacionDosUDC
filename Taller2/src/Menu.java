import java.util.Scanner;
import javax.swing.*;;

public class Menu {
    public static void main(String[] args) {
// creo el scanner y el objeto de la clase Numeros
     Scanner scanner= new Scanner(System.in);
     Numeros numeros=new Numeros();
     int operacion;
    //Se ingresan los dos números por medio de la terminal como se pide en el enunciado
    System.out.println("**Bienvenido al programa,antes de ir al menu tendra que digitar los dos números**");
    System.out.println("Ingrese el primer número");
    double numeroUno=(scanner.nextDouble());
    System.out.println("Ingrese el segundo número");
    double numeroDos=(scanner.nextDouble());
    //creo el menu y lo enseño por la terminar como se pide en el enunciado
    do {
        System.out.println("**Bienvenido al menu**\n" + //
        "1.Sumar dos números\n" +
        "2.Restar dos números\n" +
        "3.Multiplicar dos números\n"+
        "4.Dividir dos números\n" + 
        "5.Salir del menu"+
        "\nIngrese el número correspondiente a la operación que desea realizar:");
        operacion=scanner.nextInt();
        scanner.close();
        //después de seleccionar la opción por medio de un swtich se valida la información para que el programa realice la operacion correspondiente y se enseñe el resultado como se solcita por medio de JOptionPane
        switch (operacion) {
            case 1:
            JOptionPane.showMessageDialog(null, numeros.Suma(numeroUno,numeroDos), "El resultado de la suma es:", 1);
            break;
            case 2:
            JOptionPane.showMessageDialog(null, numeros.Resta(numeroUno, numeroDos), "El resultado de la resta es:", 1);
            break;
            case 3:
            JOptionPane.showMessageDialog(null, numeros.Multiplicaicon(numeroUno, numeroDos), "El resultado de la multiplicacion es:", 1);
            break;
            case 4:
            //como es una division primero debo de validar si se divide por 0 ya que eso arrojaria un error
            if(numeroDos!=0)
            {JOptionPane.showMessageDialog(null, numeros.Division(numeroUno, numeroDos), "El resultado de la division es:", 1);
            break;
            }
            else{
            JOptionPane.showMessageDialog(null,"No se puede dividir por 0", "ERROR:", 3);
            break;
            }
            case 5:
            System.out.println("Ha salido del menu,hasta pronto");
            default:
            System.out.println("ERROR,ha digitado un número no valido");
            break;
        }
    } while (operacion!=5);
    }




}
