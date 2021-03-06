/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares
 * si es necesario.
 * 
 * @author David Antunez Perez
 */
public class Ex10_7 {
  public static void main(String[] args) {
    int[] n = new int[20];
    for (int i = 0; i < n.length; i++) {
      n[i] = (int) (Math.random() * 100);
    }
    System.out.println("ARRAY NORMAL: ");
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
    System.out.println("ARRAY CON PARES PRIMERO: ");
    for (int i = 0; i < n.length; i++) {
      if (n[i] % 2 == 0) {
        System.out.print(n[i] + " ");
      }
    }
    for (int i = 0; i < n.length; i++) {
      if (n[i] % 2 != 0) {
        System.out.print(n[i] + " ");
      }
    }
  }
}
