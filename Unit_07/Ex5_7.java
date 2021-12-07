/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 * @author David Antunez Perez
 */
public class Ex5_7 {
  public static void main(String[] args) {
    int max;
    int min;
    int[] n = new int[10];
    System.out.print("Introduce un número por teclado: ");
    n[0] = Integer.parseInt(System.console().readLine());
    max = n[0];
    min = n[0];
    for(int i = 0; i < 10; i++){
      System.out.print("Introduce otro número por teclado: ");
    }
  }
}
