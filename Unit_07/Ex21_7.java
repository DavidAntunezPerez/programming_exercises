/**
 * Escribe un programa que rellene un array de 15 elementos con números enteros
 * comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
 * array “cincuerizado”, según el siguiente criterio: si el número que hay en
 * una posición del array es múltiplo de 5, se deja igual, y si no, se cambia
 * por el
 * siguiente múltiplo de 5 que exista a partir de él.
 * 
 * @author David Antunez Perez
 */
public class Ex21_7 {
  public static void main(String[] args) {
    int[] n = new int[15];
    for (int i = 0; i < n.length; i++) {
      n[i] = (int) (Math.random() * 501);
    }
    // Mostrar Indice + Array
    System.out.println("ARRAY ORIGINAL");
    for (int i = 0; i < n.length; i++) {
      System.out.printf(" %-4d", i);
    }
    System.out.println();
    for (int i = 0; i < n.length; i++) {
      System.out.printf("%-5s", n[i]);
    }
    // Mostrar array ordenado
    System.out.println();
    System.out.print("ARRAY CINCUERIZADO\n");
    for (int i = 0; i < n.length; i++) {
      System.out.printf(" %-4d", i);
    }
    System.out.println();
    for (int i = 0; i < n.length; i++) {
      if (n[i] % 5 == 0) {
        n[i] = n[i];
      } else if (n[i] % 5 != 0) {
        for (int j = 0; j < 9; j++) {
          n[i]++;
          if (n[i] % 5 == 0) {
            j = 9;
          }
        }
      }
      System.out.printf("%-5s", n[i]);
    }
  }
}
