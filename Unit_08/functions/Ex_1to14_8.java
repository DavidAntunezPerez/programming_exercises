package functions;

/**
 * Funciones matemáticas variadas
 */
public class Ex_1to14_8 {
  /**
   * 1.
   * Esta función nos dice si un número es Capicua o no
   * 
   * @param n número a verificar
   * @return boolean falsa o verdadera segun si es capicua o no
   */
  public static boolean esCapicua(int n) {
    int numIngre = n;
    int numVuelta = 0;
    boolean esCapicua = false;
    int cifra = numIngre;
    for (int i = 1; i <= numIngre; i *= 10) { // da la vuelta al número
      int cogNum = 0;
      cogNum = cifra % 10;
      numVuelta = (numVuelta * 10) + cogNum;
      cifra = (cifra - cogNum) / 10;
    }
    if (numIngre == numVuelta) { // si el número introducido y su volteado son iguales es capidua
      esCapicua = true;
    } else {
      esCapicua = false;
    }
    return esCapicua;
  }// esCapicua

  /**
   * 2.
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

  /**
   * 3.
   * Devuelve el menor primo que es mayor al número que
   * se pasa como parámetro
   * 
   * @param n número introducido
   * @return siguiente número primo
   */
  public static int siguientePrimo(int n) {
    int result; // resultado final
    boolean esPrimo = true;
    do {
      // Comprueba Primo
      esPrimo = true;

      for (int i = 2; i < n; i++) {
        if ((n % i) == 0) {
          esPrimo = false;
        }
      }
      if (!esPrimo) { // si no es primo, pasa al número siguiente
        n++;
      }
    } while (!esPrimo);
    result = n;
    return result;
  }// siguientePrimo

  /**
   * 4.
   * Devuelve el valor de una potencia dados base y exponente
   * 
   * @param base      base de la potencia
   * @param exponente exponente de la potencia
   * @return
   */
  public static int potencia(int base, int exponente) {
    int result = (int) (Math.pow(base, exponente)); // elevamos la base al exponente y ya tenemos el resultado
    return result;
  }// potencia

  public static int digitos(int n) {
    // Separa número del último al primero
    int numInt = n;
    int contCif = 0;
    int cifra = numInt;
    int cogNum = 0;
    for (int i = 1; i <= numInt; i *= 10) {
      cogNum = cifra % 10;
      cifra = (cifra - cogNum) / 10;
      contCif++;
    }
    return contCif;
  }
} // class
