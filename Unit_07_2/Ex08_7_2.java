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
    String[][] gArray = new String[8][8]; // array gráfico
    System.out.print("Introduzca la posición numérica del alfil(1 - 8): ");
    int lPos = Integer.parseInt(System.console().readLine());
    int cnPos = 0;
    lPos -= 1; // para igualarlo a las posiciones del array
    System.out.println();
    System.out.print("Introduzca ahora la posición alfabética del alfil (a - h):");
    String cPos = System.console().readLine();
    // asignamos cada valor numérico del array a su correspondiente letra
    switch (cPos) {
      case "a":
        cnPos = 0;
        break;
      case "b":
        cnPos = 1;
        break;
      case "c":
        cnPos = 2;
        break;
      case "d":
        cnPos = 3;
        break;
      case "e":
        cnPos = 4;
        break;
      case "f":
        cnPos = 5;
        break;
      case "g":
        cnPos = 6;
        break;
      case "h":
        cnPos = 7;
        break;
    }
    // generar tablero
    // posición alfil
    n[lPos][cnPos] = 4;
    // diagonal superior-izquierda
    int cont = 1; // contador
    do { // bucle para asignar los movimientos a todas las casillas en ese rango
      if ((lPos - cont >= 0) && (cnPos - cont >= 0)) {
        n[lPos - cont][cnPos - cont] = 1;
      }
      cont++;
    } while (cont < 8);
    // diagonal superior-derecha
    cont = 1;
    do { // bucle para asignar los movimientos a todas las casillas en ese rango
      if ((lPos - cont >= 0) && (cnPos + cont <= 7)) {
        n[lPos - cont][cnPos + cont] = 1;
      }
      cont++;
    } while (cont < 8);
    // diagonal inferior-izquierda  
    cont = 1;
    do { // bucle para asignar los movimientos a todas las casillas en ese rango
      if ((lPos + cont <= 7) && (cnPos - cont >= 0)) {
        n[lPos + cont][cnPos - cont] = 1;
      }
      cont++;
    } while (cont < 8);
    // diagonal inferior-derecha  
    cont = 1;
    do { // bucle para asignar los movimientos a todas las casillas en ese rango
      if ((lPos + cont <= 7) && (cnPos + cont <= 7)) {
        n[lPos + cont][cnPos + cont] = 1;
      }
      cont++;
    } while (cont < 8);
    for (fila = 0; fila < n.length; fila++) {
      for (columna = 0; columna < n[0].length; columna++) {
        System.out.printf("%1d ", n[fila][columna]);
      }
      System.out.println();
    }
    // resultado por pantalla
    System.out.print("El alfil puede moverse hacia las siguientes posiciones: ");

  }
}
