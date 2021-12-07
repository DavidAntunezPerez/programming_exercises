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
    System.out.print("Introduce un número por teclado: ");
    int n = Integer.parseInt(System.console().readLine());
    max = n;
    min = n;
    for(int i = 0; i < 10; i++){
      System.out.print("Introduce otro número por teclado: ");
    }
  }
}
