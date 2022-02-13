public class Ex13_7_2 {
  public static void main(String[] args) {
    String[] pais = { "España   ", "Rusia    ", "Japón    ", "Australia" };
    int[][] datos = new int[4][10];
    int fila, columna;
    int min = 211;
    int max = 0;
    int avg = 0;
    for (fila = 0; fila < datos.length; fila++) {
      for (columna = 0; columna < datos[0].length; columna++) {
        datos[fila][columna] = (int) (Math.random() * 71 + 140);
      }
      System.out.println();
    }
    System.out.println("");
    for (fila = 0; fila < datos.length; fila++) {
      System.out.print(pais[fila]+": ");
      for (columna = 0; columna < datos[0].length; columna++) {
        System.out.print(datos[fila][columna]+" ");
        if(datos[fila][columna] < min){
          min = datos[fila][columna];
        }
        if(datos[fila][columna] > max){
          max = datos[fila][columna];
        }
        avg += datos[fila][columna];
        if(columna == 9){
          System.out.print("| "+ avg + " ");
          System.out.print(min + " ");
          System.out.print(max + " ");
          avg = 0;
          min = 141;
          max = 0;
        }
      }
      System.out.println();
    }
  }
}
