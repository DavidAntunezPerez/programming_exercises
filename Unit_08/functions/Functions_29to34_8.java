package functions;

public class Functions_29to34_8 {
  public static void main(String[] args) {
    int filas, columnas;
    int[][]x = generaArrayBiInt(5, 10);
    for(filas = 0; filas < x.length; filas++){
      for(columnas = 0; columnas < x[0].length; columnas++){
        System.out.print(x[filas][columnas]+ " ");
      }
      System.out.println();
    }
  }
  public static int[][] generaArrayBiInt(int min, int max) {
    int[][] x = new int[min][max];
    int filas, columnas;
    for(filas = 0; filas < x.length; filas++){
      for(columnas = 0; columnas < x[0].length; columnas++){
        x[filas][columnas] = (int) (Math.random() * (max + min) + min);
      }
    }
    return x;
  }
}
