public class ChristmasTree {
  public static void main(String[] args) {
    System.out.print("Este programa pinta un árbol de Navidad.");
    System.out.print("Por favor, introduzca la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    int spa = h - 1;
    int floor = 1;
    System.out.print("✵\n");
    while(floor <= h - 1){
    // espacios externos
    for (int i = 1; i <= spa; i++) {
      System.out.print(" ");
    }
    // hojas del árbol
    for (int i = h - 3; i > 0; i--) {
      System.out.print("/\n");
    }
    floor++;
    spa--;
  }
    System.out.print("#\n#");
  }
}
