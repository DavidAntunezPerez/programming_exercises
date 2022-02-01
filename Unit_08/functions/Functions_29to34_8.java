package functions;

public class Functions_29to34_8 {
  public static void main(String[] args) {

  }
  /**
   * Genera un array bidimensional 
   * @param xlength longitud filas
   * @param ylength longitud columnas
   * @param min minimo número intervalo
   * @param max maximo número intervalo
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
   * @param x array bidimensional
   * @param fila fila indicada
   * @return array de una dimensión de la fila
   */
  public static int[] filaDeArrayBiInt(int[][] x, int fila) {
    int [] f = new int [x[0].length];
    for (int i = 0; i < x[0].length;i++){
      f[i] = x[fila][i];
    }
    return f;
  }

  public static int[] columnaDeArrayBiInt(int[][] x, int columna){
    int [] f = new int [x.length];
    for (int i = 0; i < x.length;i++){
      f[i] = x[i][columna];
    }
    return f;
  }
}