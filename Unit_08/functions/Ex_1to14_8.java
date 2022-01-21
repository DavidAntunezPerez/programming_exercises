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

  /**
   * 5.
   * Introduces un número y te devuelve el número de cifras
   * 
   * @param n número introducido
   * @return número de cifras del número
   */
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

  /**
   * 6.
   * Voltea un número
   * 
   * @param n número a voltear
   * @return número volteado
   */
  public static int voltea(int n) {
    int inv = 0;
    while (n > 0) {
      inv = (inv * 10) + (n % 10);
      n /= 10;
    }
    return inv;
  }

  /**
   * 7.
   * Devuelve el dígito que está en la posición n de un número entero.
   * Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * @param n        número indicado
   * @param posicion posición del número que queremos obtener
   * @return posición del número indicado
   */
  public static int digitoN(int n, int posicion) {
    n = voltea(n);
    while (posicion-- > 0) {
      n = n / 10;
    }
    return (int) n % 10;
  }

  /**
   * 8.
   * Da la posición de la primera ocurrencia de un dígito
   * dentro de un número entero. Si no se encuentra, devuelve -1.
   * Las posiciones comienzan desde 0 hasta el numero mayor de digitos.
   * 
   * @param n      número a introducir
   * @param digito dígito del cual obtendremos la posición
   * @return posicion del dígito o -1 si no la encuentra
   */
  public static int posicionDeDigito(int n, int digito) {
    int result = 0;
    int nIntr = voltea(n);
    boolean trueResult = false; // verificar que result tenga un valor
    int cifra = nIntr;
    int cogNum = 0;
    int contcif = 0;
    for (int i = 1; i <= nIntr; i *= 10) {
      cogNum = cifra % 10;
      if (cogNum == digito) {
        result = contcif;
        trueResult = true;
      }
      cifra = (cifra - cogNum) / 10;
      if (!trueResult) {
        contcif++;
      }
    }
    if (!trueResult) {
      result = -1;
    }
    return result;
  }

  /**
   * 9.
   * Le quita a un número n dígitos por detrás (por la
   * derecha).
   * 
   * @param n     numero a quitar cifras
   * @param veces veces que queremos quitar una cifra detrás
   * @return número con las cifras quitadas
   */
  public static int quitaPorDetras(int n, int veces) {
    for (int i = 0; i < veces; i++) {
      n = n / 10;
    }
    return n;
  }

  /**
   * 9.
   * Le quita a un número n dígitos por delante (por la
   * izquierda).
   * 
   * @param n     número indicado
   * @param veces veces que queremos quitar un número por delante
   * @return numero con esas veces quitadas delante
   */
  public static int quitaPorDelante(int n, int veces) {
    n = voltea(n);
    for (int i = 0; i < veces; i++) {
      n /= 10;
    }
    n = voltea(n);
    return n;
  }
  /**
   * 11.
   * Pega un número, otro por detras
   * @param n numero original
   * @param nAñadido numero a pegar por detras
   * @return numero pegado por detras
   */
  public static int pegaPorDetras (int n, int nAñadido){
    return juntaNumeros(n, nAñadido);
  }
  /**
   * 12.
   * Pega un número, otro por delante
   * @param n numero original
   * @param nAñadido numero a pegar por delante
   * @return numero pegado por delante
   */
  public static int pegaPorDelante (int n, int nAñadido){
    return juntaNumeros(nAñadido, n);
  }
  public static int trozoDeNumero(int n, int quitarDerecha, int quitarIzquierda){
    int result = n;
    // Quitar Derecha
    result /= potencia(10, quitarDerecha);
    // Quitar Izquierda
    
    return result;
  }
  /**
   * 14.
   * Junta dos números en uno solo
   * @param x Número 1
   * @param y Número 2
   * @return numeros unidos en uno solo
   */
  public static int juntaNumeros(int x, int y) {
    return (int) (x * potencia(10,digitos(y))) + y;
    }
} // class
