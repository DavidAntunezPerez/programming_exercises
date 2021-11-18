/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
 * 7.
 * 
 * @author David Antúnez Pérez
 */
public class Ex18_5 {
  public static void main(String[] args) {
    int n1;
    int n2;
    do {
      System.out.print("Introduce el menor número: ");
      n1 = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce el mayor número: ");
      n2 = Integer.parseInt(System.console().readLine());
      if (n1 >= n2) {
        System.out.println("ERROR. El primer número debe ser menor que el segundo.");
      }
    } while (n1 >= n2);

    for (int i = n1 + 7; (i > n1) && (i < n2); i += 7) {
      System.out.print(i + " ");
    }
  }
}
