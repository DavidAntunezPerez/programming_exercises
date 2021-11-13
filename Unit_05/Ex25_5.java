/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 * 
 * @author David Antunez Perez
 */
public class Ex25_5 {
  public static void main(String[] args) {
    System.out.print("Introduce un número entero: ");
    int numIntr = Integer.parseInt(System.console().readLine());
    int n = numIntr;
    int inv = 0;
    while (n > 0) {
      inv = (inv * 10) + (n % 10);
      n /= 10;
    }
    System.out.print("El número invertido es " + inv);
  }
}
