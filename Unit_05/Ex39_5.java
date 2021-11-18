/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto con
 * su factorial.
 * 
 * 
 * @author David Antunez Perez
 */
public class Ex39_5 {
  public static void main(String[] args) {
    int n;
    do {
      System.out.print("Introduzca un número entero: ");
      n = Integer.parseInt(System.console().readLine());
      if (n < 0) {
        System.out.print("ERROR. El número debe ser entero.");
      }
    } while (n < 0);
    System.out.print("Del 1 al " + n + " , los factoriales son: ");
    int result = 1;
    int add;
    for (int i = n; i > 0; i--) {
      System.out.print(i + "! = " + result+ ", ");
      add = i;
      result *= add;
    }
  }
}
