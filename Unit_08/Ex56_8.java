public class Ex56_8 {
  public static void main(String[] args) {
    int[][] x = generaArrayBiInt(5, 5, 100, 200);
    int fila, columna;
    for (fila = 0; fila < x.length; fila++) {
      System.out.print("Fila: " + fila);
      for (columna = 0; columna < x[0].length; columna++) {
        System.out.printf("%10d ", x[fila][columna]);
      }
      System.out.println();
    }
    int[] n = corteza(x);
    System.out.println("CORTEZA DEL ARRAY:");
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
  }

  public static int[] corteza(int[][] n) {
    int[] aux = new int[n.length * n[0].length];
    int fila, columna;
    int cont = 0;
    for (fila = 0; fila < n.length; fila++) {
      for (columna = 0; columna < n[0].length; columna++) {
        if ((fila == 0) || (columna == 0) || (fila == n.length - 1) || (columna == n[0].length - 1)) {
          aux[cont] = n[fila][columna];
          cont++;
        }
      }
    }
    int[] result = new int[cont];
    for (int i = 0; i < result.length; i++) {
      result[i] = aux[i];
    }
    return result;
  }

  // GENERA ARRAY BIDIMENSIONAL
  public static int[][] generaArrayBiInt(int xlength, int ylength, int min, int max) {
    int[][] x = new int[xlength][ylength];
    for (int i = 0; i < xlength; i++) {
      for (int j = 0; j < ylength; j++) {
        x[i][j] = (int) (Math.random() * (max - min)) + min;
      }
    }
    return x;
  }

}
