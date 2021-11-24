/**
 * Christmas Tree program made as an exercise in class
 * 
 * @author David Antunez Perez
 */
public class ChristmasTree {
  public static void main(String[] args) {
    System.out.print("Este programa pinta un árbol de Navidad.");
    System.out.print("Por favor, introduzca la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    int spa = h - 1;
    int floor = 1;
    int midSpa = 1;
    // colocar la estrella
    for (int i = h; i > 0; i--) {
      System.out.print(" ");
    }
    System.out.print("✵\n");
    if (h > 3) {
      while (floor <= h - 4) {

        // espacios externos
        for (int i = 1; i <= spa; i++) {
          System.out.print(" ");
        }
        // hojas del árbol derecha
        System.out.print("/");
        // espacios internos
        for (int i = 1; i <= midSpa; i++) {
          System.out.print(" ");
        }
        // hojas del árbol izquierda
        System.out.println("/");
        floor++;
        spa--;
        midSpa += 2;
      }

      if (h >= 5) {
        for (int i = h - 2; i <= h; i++) {
          System.out.print(" ");
        }
        for (int i = 7; i <= h * 2; i++) {
          System.out.print("-");
        }
        System.out.print("\n");
      }
    }
    // colocar tronco
    for (int i = h; i > 0; i--) {
      System.out.print(" ");
    }
    System.out.print("#\n");
    for (int i = h; i > 0; i--) {
      System.out.print(" ");
    }
    System.out.print("#");
  }
}
