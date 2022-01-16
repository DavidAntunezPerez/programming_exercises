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
    int turnos = 9; // contador de turnos
    int[][] n = new int[3][3]; // Array principal que gestionará el código
    String[][] gArray = new String[3][3]; // Array gráfico secundario
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        gArray[i][j] = " "; // hacemos que no se vea nada en cada hueco del array para marcar las casillas
      }
    }
    do { // para que el programa no pare hasta que gane o se acaben los turnos
      // print por pantalla
      System.out.println();
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
      System.out.println();
      // pedimos las coordenadas del jugador 1º
      System.out.println("TURNO JUGADOR 1:");
      System.out.print("Coordenada x: ");
      x = Integer.parseInt(System.console().readLine());
      System.out.print("Coordenada y: ");
      y = Integer.parseInt(System.console().readLine());
      gArray[y][x] = "X";
      n[x][y] = 1;
      // print por pantalla
      System.out.println();
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
      System.out.println();
      // para verificar si el P1 ha ganado el juego
      if ((n[0][0] + n[1][0] + n[2][0] == 3) || (n[0][1] + n[1][1] + n[2][1] == 3)
          || (n[0][2] + n[1][2] + n[2][2] == 3) || (n[0][0] + n[0][1] + n[0][2] == 3)
          || (n[1][0] + n[1][1] + n[1][2] == 3) || (n[2][0] + n[2][1] + n[2][2] == 3)
          || (n[0][0] + n[1][1] + n[2][2] == 3) || (n[2][0] + n[1][1] + n[0][2] == 3)) {
        turnos = 0; // la partida acaba
        System.out.print("FIN DEL JUEGO\n");
        System.out.println("GANA EL JUGADOR 1");
      } else { // Para que continue el P2
        // coordenadas jugador 2
        System.out.println("TURNO JUGADOR 2:");
        System.out.print("Coordenada x: ");
        x = Integer.parseInt(System.console().readLine());
        System.out.print("Coordenada y: ");
        y = Integer.parseInt(System.console().readLine());
        gArray[y][x] = "O";
        n[x][y] = 5;
        if ((n[0][0] + n[1][0] + n[2][0] == 15) || (n[0][1] + n[1][1] + n[2][1] == 15)
            || (n[0][2] + n[1][2] + n[2][2] == 15) || (n[0][0] + n[0][1] + n[0][2] == 15)
            || (n[1][0] + n[1][1] + n[1][2] == 15) || (n[2][0] + n[2][1] + n[2][2] == 15)
            || (n[0][0] + n[1][1] + n[2][2] == 15) || (n[2][0] + n[1][1] + n[0][2] == 15)) {
          turnos = 0; // la partida acaba
          System.out.print("FIN DEL JUEGO\n");
          System.out.println("GANA EL JUGADOR 2");
        }

      }
      turnos--;
    } while (turnos > 0);
  }
}
