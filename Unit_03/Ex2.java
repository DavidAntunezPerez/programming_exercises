/**
 *Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
 * @author David Antúnez Pérez
 * 
 */


public class Ex2 {
  
  public static void main (String[] args) {
    String line;
    System.out.print(" Selecciona la cantidad de euros a convertir: ");
    line = System.console().readLine();
    int euros;
    euros = Integer.parseInt(line);
    double total; 
    total = euros * 166.386;
    System.out.println(" " + euros + "€ equivale a " + total + " pesetas.");
    
  }
}

