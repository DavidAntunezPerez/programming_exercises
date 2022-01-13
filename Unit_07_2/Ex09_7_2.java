/**
 * @author David Antunez Perez
 *         Realiza un programa que sea capaz de rotar todos los elementos de una
 *         matriz
 *         cuadrada una posición en el sentido de las agujas del reloj. La
 *         matriz debe tener
 *         12 filas por 12 columnas y debe contener números generados al azar
 *         entre 0 y
 *         100. Se debe mostrar tanto la matriz original como la matriz
 *         resultado, ambas
 *         con los números convenientemente alineados.
 */
public class Ex09_7_2 {
  public static void main(String[] args) {
    int[][] m = new int[12][12]; // matriz cuadradada de 12 x 12
    int fila, columna;
    // hacemos que la matriz contenga números generados al azar
    System.out.println("                             MATRIZ ORIGINAL");
    System.out.println("                             ---------------");
    for (fila = 0; fila < 12; fila++) {
      for (columna = 0; columna < 12; columna++) {
        m[fila][columna] = (int) (Math.random() * 101);
        System.out.printf("%5d ", m[fila][columna]); // lo mostramos por pantalla
      }
      System.out.println();
    }
    // mostramos el resultado por pantalla
    System.out.println();
    System.out.println("                             MATRIZ RESULTADO");
    System.out.println("                             ----------------");
    int aux = m[11][11];
    for (int i = 11; i > 0; i--) {
      m[i][i] = m[i - 1][i - 1];
    }
    m[0][0] = aux;
    // Mostrar por pantalla
    for (fila = 0; fila < 12; fila++) {
      for (columna = 0; columna < 12; columna++) {
        System.out.printf("%5d ", m[fila][columna]); // lo mostramos por pantalla
      }
      System.out.println();
    }
  }
}
