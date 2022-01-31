package functions;

/**
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:
 */
public class Functions_20to28_8 {
  public static void main(String[] args) {
    // EJERCICIO 20
    int[] x = generaArrayInt(0, 5);
    for (int i = 0; i < x.length; i++) {
      System.out.println(x[i]);
    }
    // EJERCICIO 21

  }

  /**
   * Genera un array de tamaño n con números aleatorios
   * cuyo intervalo (mínimo y máximo) se indica como parámetro.
   * 
   * @param min menor del número del array
   * @param max mayor número del array
   * @return array aleatorio de n números
   */
  public static int[] generaArrayInt(int min, int max) {
    int total = max - min; // rango de números del array
    int[] n = new int[total];
    for (int i = 0; i < n.length; i++) {
      n[i] = (int) (Math.random() * total + min);
    }
    return n;
  }
  /**
   * Devuelve el valor mínimo de un array
   * @param n array a entregar
   * @return  menor número del array
   */
  public static int minimoArrayInt(int n[]) {
    int min = Integer.MAX_VALUE; // valor maximo posible
    for (int i = 0; i < n.length; i++) {
      // si es menor que el mínimo, se convierte en el menor
      if (n[i] < min) {
        min = n[i];
      }
    }
    // devuelve el valor mínimo
    return min;
  }
}
