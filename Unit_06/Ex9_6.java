/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100
 * y que no termine de generar números hasta que no saque el 24. El programa
 * deberá decir al final cuántos números se han generado.
 * 
 * @author David Antunez Perez
 */
public class Ex9_6 {
  public static void main(String[] args) {
    int n;
    int cont = 0;
    do {
      n = (int) (Math.random() * 100);
      System.out.print(n + " ");
      cont++;
    } while (n != 24);
    System.out.print("\nSE HAN GENERADO " + cont + " NÚMEROS EN TOTAL.\n");
  }
}
