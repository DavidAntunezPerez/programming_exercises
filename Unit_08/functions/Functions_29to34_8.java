package functions;

public class Functions_29to34_8 {
  public static void main(String[] args) {

  }

  /**
   * Genera un array bidimensional
   * 
   * @param xlength longitud filas
   * @param ylength longitud columnas
   * @param min     minimo número intervalo
   * @param max     maximo número intervalo
   * @return array bidimensional
   */
  public static int[][] generaArrayBiInt(int xlength, int ylength, int min, int max) {
    int[][] x = new int[xlength][ylength];
    for (int i = 0; i < xlength; i++) {
      for (int j = 0; j < ylength; j++) {
        x[i][j] = (int) (Math.random() * (max - min)) + min;
      }
    }
    return x;
  }

  /**
   * Devuelve una fila indicada en un array bidimensional
   * 
   * @param x    array bidimensional
   * @param fila fila indicada
   * @return array de una dimensión de la fila
   */
  public static int[] filaDeArrayBiInt(int[][] x, int fila) {
    int[] f = new int[x[0].length];
    for (int i = 0; i < x[0].length; i++) {
      f[i] = x[fila][i];
    }
    return f;
  }

  /**
   * Devuelve la fila indicada en un array bidimensional
   * 
   * @param x       array bidimensional
   * @param columna columna del array
   * @return columna indicada del array
   */
  public static int[] columnaDeArrayBiInt(int[][] x, int columna) {
    int[] f = new int[x.length];
    for (int i = 0; i < x.length; i++) {
      f[i] = x[i][columna];
    }
    return f;
  }

  /**
   * Devuelve la coordenada en forma de array de un número indicado, si no,
   * devuelve {-1 , -1}
   * 
   * @param x      array bidimensional indicado
   * @param numInt número del que sacar coordenada
   * @return fila y columna en array
   */
  public static int[] coordenadasEnArrayBiInt(int[][] x, int numInt) {
    for (int i = 0; i < x.length;) {
      for (int j = 0; j < x[0].length; j++) {
        if (x[i][j] == numInt) {
          int[] c = { i, j };
          return c;
        }
      }
    }
    int[] c = { -1, -1 };
    return c;
  }

  /**
   * Dice si un número es o no punto de silla, es decir,
   * mínimo en su fila y máximo en su columna.
   * 
   * @param x       array bidimensional
   * @param fila    fila indicada
   * @param columna columna indicada
   * @return verdadero o falso, segun si es punto de silla o no
   */
  public static boolean esPuntoDeSilla(int[][] x, int fila, int columna) {
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[0].length; j++) {
        if ((x[i][j] == x[fila][columna]) && (fila == 0) && (columna == x[0].length)) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Devuelve un array que contiene una de las diagonales del array
   * bidimensional que se pasa como parámetro. Se pasan como parámetros
   * fila, columna y dirección. La fila y la columna determinan el número que
   * marcará las dos posibles diagonales dentro del array. La dirección es
   * una cadena de caracteres que puede ser “nose” o “neso”. La cadena
   * “nose” indica que se elige la diagonal que va del noroeste hacia el sureste,
   * mientras que la cadena “neso” indica que se elige la diagonal que va del
   * noreste hacia el suroeste.
   * 
   * @param x         array bidimensional original
   * @param direccion direccion (nose o neso)
   * @return si se ha indicado bien, un array de una dimensión con la diagonal
   *         indicada, si no, un array de una dimension lleno de 0
   */
  public static int[] diagonal(int[][] x, String direccion) {
    int[] ext = new int[(x.length + x[0].length) / 2];
    int count = 0;
    // caso de que sea neso
    if (direccion == "nose") {
      for (int fila = 8; fila >= 0; fila--) {
        for (int columna = 0; columna < x[0].length; columna++) {
          if (fila == columna) {
            ext[count] = x[fila][columna];
            count++;
          }
        }
        System.out.println();
      }
      return ext;
    } else if (direccion == "neso") {
      for (int fila = 8; fila >= 0; fila--) {
        for (int columna = 0; columna < x[0].length; columna++) {
          if (fila + columna == ext.length - 1) {
            ext[count] = x[fila][columna];
            count++;
          }
        }
        System.out.println();
      }
      return ext;
    } else
      return ext;
  }
}
