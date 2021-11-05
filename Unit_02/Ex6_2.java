/**
 * 
 * @author David Antúnez Pérez
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable..
 * 
 */


public class Ex6_2 {
  
  public static void main (String[] args) {
    double sinIva = 20d;
    double conIva = sinIva * 1.21;
    System.out.println("El precio sin IVA es: " + sinIva);
    System.out.println("El precio con IVA es: " + conIva);
	}
}

