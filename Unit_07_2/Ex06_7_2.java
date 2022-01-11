/**
 * @author David Antunez Perez
 * 
 *         Modifica el programa anterior de tal forma que no se repita ningún
 *         número en
 *         el array.
 */
public class Ex06_7_2 {
  public static void main(String[] args) {
    // creamos el array
    int[][] n = new int[6][10];
    // declaramos las variables
    int filas, columnas, max, min;
    boolean repeated = true;
    max = 0;
    min = 1000;
    // asignamos números aleatorios al array
    for (filas = 0; filas < 6; filas++) {
      System.out.print("Fila: " + filas);
      for (columnas = 0; columnas < 10; columnas++) {
        do {
          n[filas][columnas] = (int) (Math.random() * 1000);
          for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 10; y++) {
              if (n[x][y] != n[filas][columnas]) {
                repeated = false;
              }
            }
          }
        } while (repeated);
        // si el valor que sale es mayor que el número máximo, se vuelve el max
        if (n[filas][columnas] >= max) {
          max = n[filas][columnas];
        }
        // si el valor que sale es menor que el número mínimo, se vuelve el min
        if (n[filas][columnas] <= min) {
          min = n[filas][columnas];
        }
        // hacemos print del array
        System.out.printf("%10d ", n[filas][columnas]);
      }
      System.out.println();
    }
    // mostramos los valores máximos y mínimos por pantalla
    System.out.println();
    System.out.print("El valor máximo es " + max);
    System.out.println();
    System.out.print("El valor mínimo es " + min);
  }
}
