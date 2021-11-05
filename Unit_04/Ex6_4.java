/**
 *@author David Antúnez Pérez
 * 
 * 
 * 
 */


public class Ex6_4 {
  
  public static void main (String[] args) {
      String line;
      System.out.print(" Selecciona la altura a la que se encuentra el objeto (en metros): ");
      line = System.console().readLine();
      double height;
      height = Integer.parseInt(line);
      double result = Math.sqrt((2 * height) / 9.81);
      System.out.print("El tiempo que tardará en caer el objeto desde " + height + " metros será de " + result + " segundos.");
  }
}

