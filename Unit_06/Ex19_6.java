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

    for (int i = 0; i <= 50; i++) {
      int n = (int) (Math.random() * 300 - 100);
      System.out.print(n + " ");
    }
  }
}
