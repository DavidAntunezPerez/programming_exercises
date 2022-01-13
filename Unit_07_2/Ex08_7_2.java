/**
 * @author David Antunez Perez
 * 
 *         Escribe un programa que, dada una posición en un tablero de ajedrez,
 *         nos diga
 *         a qué casillas podría saltar un alfil que se encuentra en esa
 *         posición. Como se
 *         indica en la figura, el alfil se mueve siempre en diagonal. El
 *         tablero cuenta con
 *         64 casillas. Las columnas se indican con las letras de la “a” a la
 *         “h” y las filas
 *         se indican del 1 al 8
 */
public class Ex08_7_2 {
  public static void main(String[] args) {
    int fila, columna;
    int[][] n = new int[8][8]; // array principal
    System.out.print("Introduzca la posición numérica del alfil(1 - 8): ");
    int lPos = Integer.parseInt(System.console().readLine());
    lPos -= 1;
    System.out.println();
    System.out.print("Introduzca ahora la posición alfabética del alfil (a - h):");
    String cPos = System.console().readLine();
    // asignamos cada valor numérico del array a su correspondiente letra
    switch (cPos) {
      case "a":
        columna = 0;
        break;
      case "b":
        columna = 1;
        break;
      case "c":
        columna = 2;
        break;
      case "d":
        columna = 3;
        break;
      case "e":
        columna = 4;
        break;
      case "f":
        columna = 5;
        break;
      case "g":
        columna = 6;
        break;
      case "h":
        columna = 7;
        break;
    }
    // resultado por pantalla
    System.out.print("El alfil puede moverse hacia las siguientes posiciones: ");

  }
}
