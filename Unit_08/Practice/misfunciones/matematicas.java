package Practice.misfunciones;

/**
 * Funciones matemáticas variadas
 */
public class Matematicas {
  /**
   * Genera un valor entero aleatorio entre <code>inicio</code> y <code>fin</code>
   * 
   * @param start valor mínimo a devolver
   * @param end   valor máximo a devolver
   * @return un número aleatorio entre <code>inicio</code> y <code>fin</code>
   */
  public static int random(int start, int end) {
    return (int) (Math.random() * (end - start + 1) + start);
  } // random

  /**
   * Verifica si un número es o no primo (divisible entre sí y la unidad)
   * 
   * @param n número a comprobar (entero y positivo)
   * @return true si el número es primo y false si no lo es
   */
  public static boolean esPrimo(int n) {
    // Comprueba Primo
    boolean esPrimo = true;

    for (int i = 2; i < n; i++) {
      if ((n % i) == 0) {
        esPrimo = false;
      }
    }

    return esPrimo;
  }// esPrimo
} // class
