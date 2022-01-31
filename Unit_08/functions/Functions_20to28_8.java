package functions;

/**
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:
 */
public class Functions_20to28_8 {
  public static void main(String[] args) {
    // EJERCICIO 20
    int[] x = generaArrayInt(2, 10);
    for (int i = 0; i < x.length; i++) {
      System.out.println(x[i]);
    }
    // EJERCICIO 21 , 22 Y 23
    int min = minimoArrayInt(x);
    int max = maximoArrayInt(x);
    double average = mediaArrayInt(x);
    System.out.println("MIN:" + min + " MAX:" + max + " AVG:" + average);
    // EJERCICIO 24 Y 25
    System.out.println(estaEnArrayInt(3, x));
    System.out.println("ESTA EN LA POSICION DEL ARRAY: " + posicionEnArray(3, x));

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
   * 
   * @param n array a entregar
   * @return menor número del array
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

  /**
   * Devuelve el valor máximo de un array
   * 
   * @param n valor array indicado
   * @return mayor valor del array
   */
  public static int maximoArrayInt(int n[]) {
    int max = Integer.MIN_VALUE; // valor maximo posible
    for (int i = 0; i < n.length; i++) {
      // si es mayor que el máximo, se convierte en el menor
      if (n[i] > max) {
        max = n[i];
      }
    }
    // devuelve el valor mínimo
    return max;
  }

  /**
   * Devuelve la media de un array indicado
   * 
   * @param n array indicado
   * @return media (en double) de todos los valores del array
   */
  public static double mediaArrayInt(int n[]) {
    double result = 0;
    for (int i = 0; i < n.length; i++) {
      result += n[i];
    }
    result = (result / n.length);
    return result;
  }

  /**
   * Devuelve un valor boolean en función de si un número se encuentra o no
   * 
   * @param n Número a encontrar
   * @param x Array en el que buscar el número
   * @return Boolean (V o F) de si está o no
   */
  public static boolean estaEnArrayInt(int n, int x[]) {
    boolean esta = false;
    for (int i = 0; i < x.length; i++) {
      if (x[i] == n) {
        esta = true;
      }
    }
    return esta;
  }

  /**
   * Devuelve la posición en la que se encuentra un número en un array indicado
   * 
   * @param n número indicado
   * @param x array donde se encuentra el número
   * @return valor en el índice donde se encuentra ese número dentro del array
   */
  public static int posicionEnArray(int n, int[] x) {
    for (int i = 0; i < x.length; i++) {
      if (x[i] == n) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Voltea un array
   * 
   * @param x array introducido
   * @return array voteado
   */
  public static int[] volteaArrayInt(int[] x) {
    int[] a = new int[x.length];

    for (int i = 0; i < x.length; i++) {
      a[x.length - i - 1] = x[i];
    }

    return a;
  }
}
