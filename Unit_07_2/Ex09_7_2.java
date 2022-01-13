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
    int capa;
    int i;
    int j;
    int aux1;
    int aux2;
    // hacemos que la matriz contenga números generados al azar
    System.out.println("                               MATRIZ ORIGINAL");
    System.out.println("                               ---------------");
    for (fila = 0; fila < 12; fila++) {
      for (columna = 0; columna < 12; columna++) {
        m[fila][columna] = (int) (Math.random() * 101);
        System.out.printf("%6d ", m[fila][columna]); // lo mostramos por pantalla
      }
      System.out.println();
    }
    // mostramos el resultado por pantalla
    System.out.println();
    System.out.println("                               MATRIZ RESULTADO");
    System.out.println("                               ----------------");
    int aux = m[11][11];
    for (capa = 0; capa < 6; capa++) {

      // rota por arriba
      aux1 = m[capa][11 - capa];
      for (i = 11 - capa; i > capa; i--) {
        m[capa][i] = m[capa][i - 1];
      }

      // rota por la derecha
      aux2 = m[11 - capa][11 - capa];
      for (i = 11 - capa; i > capa + 1; i--) {
        m[i][11 - capa] = m[i - 1][11 - capa];
      }
      m[capa + 1][11 - capa] = aux1;

      // rota por abajo
      aux1 = m[11 - capa][capa];
      for (i = capa; i < 11 - capa - 1; i++) {
        m[11 - capa][i] = m[11 - capa][i + 1];
      }
      m[11 - capa][11 - capa - 1] = aux2;

      // rota por la izquierda
      for (i = capa; i < 11 - capa - 1; i++) {
        m[i][capa] = m[i + 1][capa];
      }
      m[11 - capa - 1][capa] = aux1;

    } // for capa

    m[0][0] = aux;
    // mostrar por pantalla
    for (fila = 0; fila < 12; fila++) {
      for (columna = 0; columna < 12; columna++) {
        System.out.printf("%6d ", m[fila][columna]); // lo mostramos por pantalla
      }
      System.out.println();
    }
  }
}
