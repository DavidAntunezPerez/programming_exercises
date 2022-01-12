package Practice;
public class ExampleArray4 {
  public static void main(String[] args) throws InterruptedException {
    int[][] n = new int[3][2]; // array de 3 filas y 2 columnas
    n[0][0] = 25; 
    n[1][0] = 73;
    n[1][1] = 22;
    n[2][1] = 5;
    int fila, columna;
    for (fila = 0; fila < 3; fila++) {
      System.out.print("Fila: " + fila);
      for (columna = 0; columna < 2; columna++) {
        System.out.printf("%10d ", n[fila][columna]);
        Thread.sleep(1000); // retardo de un segundo
      }
      System.out.println();
    }
  }
}
