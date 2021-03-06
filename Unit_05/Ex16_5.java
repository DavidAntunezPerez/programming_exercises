/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad
 * 
 * @author David Antunez Perez
 */
public class Ex16_5 {
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    int n = Integer.parseInt(System.console().readLine());
    int c = n - 1;
    boolean nPrim = true;
    do {
      if ((n % c) == 0) {
        nPrim = false;
      }
      c--;
    } while ((c > 2)&&(nPrim == true));
    if ((nPrim == true)||(n <= 2)) {
      System.out.println(n + " es un número primo.");
    } else {
      System.out.println(n + " NO es un número primo.");
    }
  }
}
