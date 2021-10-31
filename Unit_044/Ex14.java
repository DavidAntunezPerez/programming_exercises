 /**
 * @author David Antúnez Pérez
 * 
 */


public class Ex14 {
  
  public static void main (String[] args) {
    System.out.println(" DETECTOR DE PARES E IMPARES");
     System.out.println("----------------------------");
      String line;
      System.out.print(" Escriba un número: ");
      line = System.console().readLine();
      int num;
      num = Integer.parseInt(line);
      if (num % 2 == 0){
        System.out.println(" El número es par.");
        }
        else {
          System.out.println(" El número es impar.");
          }
      

  }
}
