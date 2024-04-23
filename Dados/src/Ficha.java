public class Ficha {
    
    public void mover (Dado unDado) {
        int casillas = unDado.lanzar();
        System.out.println("la ficha se mueve" + casillas + "casillas");
    }
  
}
