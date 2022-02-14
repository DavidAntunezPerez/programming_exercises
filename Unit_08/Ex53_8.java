public class Ex53_8 {
  public static void main(String[] args) {
    int[][] n = new int[5][5];
    int fila, columna;
    for (fila = 0; fila < n.length; fila++) {
      System.out.print("Fila: " + fila);
      for (columna = 0; columna < n[0].length; columna++) {
        n[fila][columna] = (int) (Math.random() * 201 + 100);
        System.out.printf("%10d ", n[fila][columna]);
      }
      System.out.println();
    }

    System.out.println(nEsimo(n, 25));
  }

  public static int nEsimo(int[][] n, int posicion) {
    if (posicion > n.length * n[0].length) {
      return -1;
    } else {
      int cont = 0;
      int aux = posicion;
      do {
        aux -= n.length;
        if (aux > 0) {
          cont++;
        }
      } while (aux > 0);
      return n[cont][posicion - (n.length * cont) - 1];
    }
  }

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
