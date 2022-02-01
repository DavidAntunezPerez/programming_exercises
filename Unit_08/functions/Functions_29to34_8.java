package functions;

public class Functions_29to34_8 {
  public static int[][] generaArrayBiInt(int min, int max) {
    int[][] x = new int[min][max];
    int filas, columnas;
    for(filas = 0; filas < x.length; filas++){
      for(columnas = 0; columnas < x[0].length; columnas++){
        x[filas][columnas] = (int) (Math.random() * (max + min) + min);
      }
      System.out.println();
    }
    return x;
  }
}
