/**
 * @author David Antúnez Pérez
 * 
 *         Realiza un programa que muestre por pantalla un array de 10 filas por
 *         10
 *         columnas relleno con números aleatorios entre 200 y 300. A
 *         continuación, el
 *         programa debe mostrar los números de la diagonal que va desde la
 *         esquina
 *         superior izquierda a la esquina inferior derecha, así como el máximo,
 *         el mínimo
 *         y la media de los números que hay en esa diagonal.
 */
public class Ex11_7_2 {
  public static void main(String[] args) {
    // definir array
    int[][] n = new int[10][10];
    // agregar numeros aleatorios al array
    int fila, columna;
    for (fila = 0; fila < n.length; fila++) {
      for (columna = 0; columna < n[0].length; columna++) {
        n[fila][columna] = (int) (Math.random() * 100 + 200);
      }
    }
    // creamos el máximo, el mínimo y la media
    int max = 200;
    int min = 300;
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
    System.out.println("DIAGONAL DEL ARRAY:");
    for (fila = 0; fila < n.length; fila++) {
      for (columna = 0; columna < n[0].length; columna++) {
        if ((fila == columna) || (fila - 1 == columna) || (fila == columna - 1)) {
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
