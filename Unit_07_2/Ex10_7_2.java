/**
 * @author David Antunez Perez
 *         Realiza el juego de las tres en raya.
 * 
 */
public class Ex10_7_2 {
  public static void main(String[] args) {
    // variables de las coordenadas seleccionadas por el usuario
    int x;
    int y;
    int fila, columna;
    boolean end = false; // fin del programa
    int[][] n = new int[3][3]; // Array principal que gestionará el código
    String[][] gArray = new String[3][3]; // Array gráfico secundario
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        gArray[i][j] = " "; // hacemos que no se vea nada en cada hueco del array para marcar las casillas
      }
    }
    do { // para que el programa no pare hasta que se encuentre una de las dos cosas
      System.out.println("TRES EN RAYA");
      System.out.println("------------");
      for (fila = 0; fila < 3; fila++) {
        System.out.print(fila + " | ");
        for (columna = 0; columna < 3; columna++) {
          System.out.printf(" " + gArray[fila][columna] + " ");
        }
        System.out.println();
      }
      System.out.println("------------");
      System.out.println("  |  0  1  2");
      // pedimos las coordenadas del jugador 1º
      System.out.println("TURNO JUGADOR 1:");
      System.out.println();
      System.out.print("Coordenada x: ");
      x = Integer.parseInt(System.console().readLine());
      System.out.print("Coordenada y: ");
      y = Integer.parseInt(System.console().readLine());
      gArray[x][y] = "X";
    } while (!end);
    for (fila = 0; fila < 4; fila++) {
      System.out.print(fila + " | ");
      for (columna = 0; columna < 4; columna++) {
        System.out.printf(" " + gArray[fila][columna] + " ");
      }
      System.out.println();
    }
    System.out.println("------------");
    System.out.println("  |  0  1  2");
  }
}
