/**
 * @author David Antunez Perez
 * 
 *         Modifica el programa anterior de tal forma que los números que se
 *         introducen
 *         en el array se generen de forma aleatoria (valores entre 100 y 999).
 *  
 */
public class Ex03_7_2 {
  public static void main(String[] args) {
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
        System.out.printf("%10d ", n[fila][columna]);
      }
      System.out.println();
    }
  }
}
