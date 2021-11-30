/**
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 * luego el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 * 
 * @author David Antunez Perez
 */
public class Ex19_6 {
  public static void main(String[] args) {
    int add = 0;
    int max = -100;
    int min = 200;
    for (int i = 0; i <= 50; i++) {
      int n = (int) (Math.random() * 300 - 100);
      System.out.print(n + " ");
      add += n;
      if ((n % 2 == 0) && (n > max)) {
        max = n;
      }
      if ((n % 2 != 0) && (n < min)) {
        min = n;
      }
    }
    System.out.println();
    System.out.println("La suma de todos los números es " + add);
    System.out.println("El mayor de los pares es " + max);
    System.out.println("El menor de los impares es " + min);
  }
}
