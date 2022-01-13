/**
 * @author David Antunez Perez
 *         Realiza el juego de las tres en raya.
 * 
 */
public class Ex10_7_2 {
  public static void main(String[] args) {
    int fila, columna;
    int[][] n = new int[3][3];
    System.out.println(" _________ ");
    for (fila = 0; fila < 3; fila++) {
      System.out.print("|");
      for (columna = 0; columna < 3; columna++) {
        System.out.printf("%2d ", n[fila][columna]);
      }
      System.out.print("|");
      System.out.println();
    }
    System.out.println(" --------- ");
  }
}
