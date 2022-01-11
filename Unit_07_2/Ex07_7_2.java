/**
 * @author David Antúnez Pérez
 * 
 *         Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a
 *         una casilla
 *         de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina
 *         cerca!
 * 
 * 
 */
public class Ex07_7_2 {
  public static void main(String[] args) {
    // variables de las coordenadas seleccionadas por el usuario
    int x;
    int y;
    int fila, columna;
    boolean repeat = true; // para asegurar que no estan en el mismo lugar bomba y premio
    boolean end = false; // fin del programa
    int[][] n = new int[4][4];
    // creamos las variables para la posición de la bomba y el premio
    int xBomb = (int) (Math.random() * 4);
    int yBomb = (int) (Math.random() * 4);
    int xPrize = (int) (Math.random() * 4);
    int yPrize = (int) (Math.random() * 4);
    // aseguramos que el premio y la bomba no esten en el mismo lugar
    do {
      if ((xBomb == xPrize) && (yBomb == yPrize)) {
        xBomb = (int) (Math.random() * 4);
        yBomb = (int) (Math.random() * 4);
      } else {
        repeat = false;
      }
    } while (repeat);
    n[xBomb][yBomb] = 1; // la posición se verá marcada por el valor 1
    n[xPrize][yPrize] = 2; // la posición se verá marcada por el valor 2

    do { // para que el programa no pare hasta que se encuentre una de las dos cosas
      System.out.println("BUSCA EL TESORO");
      System.out.println("---------------");
      for (fila = 0; fila < 4; fila++) {
        System.out.print(fila + " | ");
        for (columna = 0; columna < 4; columna++) {
          System.out.printf("%2d ", n[fila][columna]);
        }
        System.out.println();
      }
      System.out.println("----------------");
      System.out.println("  |  0  1  2  3");
      // pedimos las coordenadas
      System.out.print("Coordenada x: ");
      x = Integer.parseInt(System.console().readLine());
      System.out.print("Coordenada y: ");
      y = Integer.parseInt(System.console().readLine());
      if (n[x][y] == 1) {
        System.out.print("La bomba ha explotado, has perdido.");
        end = true;
      } else if (n[x][y] == 2) {
        System.out.print("Enhorabuena, encontraste el tesoro, has ganado!");
        end = true;
      }
    } while (!end);
  }
}
