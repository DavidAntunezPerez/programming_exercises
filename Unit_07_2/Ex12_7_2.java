/**
 * @author David Antúnez Pérez
 * 
 *         Realiza un programa que muestre por pantalla un array de 9 filas por
 *         9
 *         columnas relleno con números aleatorios entre 500 y 900. A
 *         continuación, el
 *         programa debe mostrar los números de la diagonal que va desde la
 *         esquina
 *         inferior izquierda a la esquina superior derecha, así como el máximo,
 *         el mínimo
 *         y la media de los números que hay en esa diagonal.
 */
public class Ex12_7_2 {
  public static void main(String[] args) {
    // definir array
    int[][] n = new int[9][9];
    // agregar numeros aleatorios al array
    int fila, columna;
    for (fila = 0; fila < n.length; fila++) {
      for (columna = 0; columna < n[0].length; columna++) {
        n[fila][columna] = (int) (Math.random() * 400 + 500);
      }
    }
    // creamos el máximo, el mínimo y la media
    int max = 500;
    int min = 900;
    int sum = 0;
    int count = 0; // contador de números
    double average;
    // print de los números
    System.out.println("ARRAY ORIGINAL:");
    for (fila = 0; fila < n.length; fila++) {
      for (columna = 0; columna < n[0].length; columna++) {
        System.out.printf("%4d", n[fila][columna]);
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("DIAGONAL DEL ARRAY:");
    for (fila = 8; fila >= 0; fila--) {
      for (columna = 0; columna < n[0].length; columna++) {
        if (fila + columna == 8) {
          System.out.printf("%4d", n[fila][columna]);
          if (n[fila][columna] > max) {
            max = n[fila][columna];
          }
          if (n[fila][columna] < min) {
            min = n[fila][columna];
          }
          sum += n[fila][columna];
          count++;
        }
      }
      System.out.println();
    }
    average = (double) sum / (double) count; // Para que la media salga con decimales
    System.out.println();
    System.out.println("El mínimo es " + min);
    System.out.println("El máximo es " + max);
    System.out.println("La media es " + average);
  }
}