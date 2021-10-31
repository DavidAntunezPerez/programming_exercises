/**
 * 
 * @author David Antúnez Pérez
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 *
 * 
 */


public class Ex7 {
  
  public static void main (String[] args) {
    String line;
     System.out.print(" Introduce el precio sin IVA: ");
     line = System.console().readLine();
    double sinIva;
    sinIva = Integer.parseInt(line);
    double conIva = sinIva * 1.21;
    System.out.println(" El precio con IVA es: " + conIva);
  }
}
