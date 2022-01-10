public class Ex04_7_2 {
  public static void main(String[] args) throws InterruptedException {
    int[][] n = new int[5][6]; // aumentamos el tamaño del array puesto que queremos meter las sumas
    int fila, columna;
    // asignamos valores aleatorios al array
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        // introducir número
        n[fila][columna] = (int) (Math.random() * 900 + 100);
        n[4][columna] += n[fila][columna]; // suma columna
        n[fila][5] += n[fila][columna]; // suma filas
        n[4][5] += n[fila][columna]; // suma total
      }
    }
    for (fila = 0; fila < 5; fila++) {
      for (columna = 0; columna < 6; columna++) {
        if((fila == 4)||(columna == 5)){  
          Thread.sleep(1000); // retardo de un segundo
        }
        System.out.printf("%10d ", n[fila][columna]);
      }
      System.out.println();
    }
  }
}
