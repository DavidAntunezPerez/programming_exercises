/**
 * @author David Antunez Perez
 * 
 *         Realiza un programa que rellene un array de 6 filas por 10 columnas
 *         con
 *         números enteros positivos comprendidos entre 0 y 1000 (ambos
 *         incluidos). A
 *         continuación, el programa deberá dar la posición tanto del máximo
 *         como del
 *         mínimo.
 * 
 */
public class Ex05_7_2 {
  public static void main(String[] args) {
    // creamos el array
    int[][] n = new int[6][10];
    // declaramos las variables
    int filas, columnas, max, min;
    max = 0;
    min = 1000;
    // asignamos números aleatorios al array
    for (filas = 0; filas < 6; filas++) {
      System.out.print("Fila: " + filas);
      for (columnas = 0; columnas < 10; columnas++) {
        n[filas][columnas] = (int) (Math.random() * 1000);
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
