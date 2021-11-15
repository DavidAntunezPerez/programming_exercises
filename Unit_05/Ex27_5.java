/**
 * @author David Antunez Perez
 * 
 *         Escribe un programa que muestre, cuente y sume los múltiplos de 3 que
 *         hay entre 1 y un número leído por teclado.
 * 
 */
public class Ex27_5 {
  public static void main(String[] args) {
    System.out.print("Introduce un número mayor de 1: ");
    int nInt = Integer.parseInt(System.console().readLine());
    System.out.print("Los múltiplos de 3 entre 1 y " + nInt + " son ");
    for (int i = nInt; i >= 1; i--) {
      if (i % 3 == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
