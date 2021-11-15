/**
 * @author David Antúnez Pérez
 * 
 *         Escribe un programa que calcule el factorial de un número entero
 *         leído por teclado.
 */
public class Ex28_5 {
  public static void main(String[] args) {
    int n;
    do {
      System.out.print("Introduzca un número entero: ");
      n = Integer.parseInt(System.console().readLine());
      if ( n < 0){
        System.out.print("ERROR. El número debe ser entero.");
      }
    } while (n < 0);

    int result = 1;
    int add;
    for (int i = n; i > 0; i--) {
      add = i;
      result *= add;
    }
    System.out.print(n + "! = " + result);
  }
}
