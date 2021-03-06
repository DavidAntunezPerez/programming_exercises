/**
 * @author David Antunez Perez
 * 
 *         Escribe un programa que pida 20 números enteros. Estos números se
 *         deben
 *         introducir en un array de 4 filas por 5 columnas. El programa
 *         mostrará las
 *         sumas parciales de filas y columnas igual que si de una hoja de
 *         cálculo se
 *         tratara. La suma total debe aparecer en la esquina inferior derecha
 */
public class Ex02_7_2 {
  public static void main(String[] args) {
    int[][] n = new int[5][6]; // aumentamos el tamaño del array puesto que queremos meter las sumas
    int fila, columna;
    // asignamos valores al array
    System.out.println("Introduce 20 números y ve pulsando ENTER:");
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        // introducir número
        n[fila][columna] = Integer.parseInt(System.console().readLine());
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
