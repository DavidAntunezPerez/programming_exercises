/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada de
 * números mientras su suma no supere el valor 10000. Cuando esto último ocurra,
 * se debe mostrar el total acumulado, el contador de los números introducidos y
 * la media.
 * 
 * @author David Antunez Perez
 */
public class Ex23_5 {
  public static void main(String[] args) {
    double total= 0; // Total sumado
    double nIntr = 0; // Número de números introducidos.
    double n = 0; 
    do{
    System.out.print("Introduce un número: ");
      n = Double.parseDouble(System.console().readLine());
      total += n;
      nIntr++;
    }while(total <= 10000)
    
    System.out.println("Programa finalizado. Has introducido una cantidad de "+nIntr+" números. La media de estos");
  }

}
