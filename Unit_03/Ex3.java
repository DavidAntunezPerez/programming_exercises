/**
 * 
 * @author David Antúnez Pérez
 * Conversor Pesetas a Euros
 * 
 */


public class Ex3 {
  
  public static void main (String[] args) {
    String line;
    System.out.print(" Selecciona la cantidad de pesetas a convertir: ");
    line = System.console().readLine();
    int euros;
    euros = Integer.parseInt(line);
    double total; 
    total = euros * 0.006;
    System.out.println(" " + euros + " pesetas equivalen a " + total + " € .");
    
  }
}
