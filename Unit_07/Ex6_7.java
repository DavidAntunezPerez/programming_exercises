/**
 * @author David Antunez Perez
 * 
 *         Escribe un programa que lea 15 números por teclado y que los almacene
 *         en un
 *         array. Rota los elementos de ese array, es decir, el elemento de la
 *         posición 0
 *         debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
 *         encuentra en
 *         la última posición debe pasar a la posición 0. Finalmente, muestra el
 *         contenido
 *         del array.
 */
public class Ex6_7 {
  public static void main(String[] args) {
    int[] n = new int[15];
    for (int i = 0; i < n.length; i++) {
      System.out.print("Introduzca un número por teclado: ");
      n[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.print("Array en orden inicial: ");
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < n.length; i++) {
      if (i != 0) {
        n[i] = n[i - 1];
      } else if (i == 0) {
        n[0] = n[14];
      }
    }
    System.out.print("Array movido una posición: ");
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
  }
}
