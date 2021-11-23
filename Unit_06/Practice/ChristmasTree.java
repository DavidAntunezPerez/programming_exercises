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
    while (floor <= h - 3) {

      // espacios externos
      for (int i = 1; i <= spa; i++) {
        System.out.print(" ");
      }
      // hojas del árbol
      System.out.print("/");
      for (int i = 1; i <= midSpa; i++) {
        System.out.print(" ");
      }
      System.out.println("/");
      floor++;
      spa--;
      midSpa += 2;
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
