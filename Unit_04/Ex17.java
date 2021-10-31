/**
 * 
 * @author David Antúnez Pérez
 * 
 */


public class Ex17 {
  
  public static void main (String[] args) {
          System.out.print("INTRODUCE UN NÚMERO: ");
      int num;
      String line;
      line = System.console().readLine();
      num = Integer.parseInt(line);
      int ultdig = num % 10;
      System.out.println("El último dígito entero a la izquierda de la coma es "+ultdig);
  }
}

