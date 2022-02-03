package Ex03dap;

/**
 * @author David Antunez Perez 1º DAM , 14/12/21
 */
public class Ex03dap3_3 {
  public static void main(String[] args) {
    int ancho = 0;
    int largo = 0;
    // Preguntamos por anchura y altura
    do {
      System.out.print("Escribe la anchura del triangulo: ");
      ancho = Integer.parseInt(System.console().readLine());
      System.out.print("Escribe la altura del triangulo: ");
      largo = Integer.parseInt(System.console().readLine());
    } while ((ancho <= 0) && (largo <= 0));
    for (int f = 0; f < largo; f++) {
      // Print de un sólo triángulo
      int floor = 1;
      int lenght = 1;
      int spa = 4 - 1;
      while (floor <= 4) {
        for (int l = 0; l < ancho; l++) {
          // espacios de la pirámide
          for (int i = 1; i <= spa; i++) {
            System.out.print(" ");
          }
          // carácteres de la pirámide
          for (int i = 1; i <= lenght; i++) {
            System.out.print("*");
          }
          System.out.print(" ");
        }
        System.out.println();
        floor++;
        spa--;
        lenght += 1;
      }
      System.out.println();
    }
  }
}
