public class ChristmasTree {
  public static void main(String[] args) {
    System.out.print("Este programa pinta un árbol de Navidad.");
    System.out.print("Por favor, introduzca la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("✵\n");
    for (int i = h - 3; i > 0; i--) {
      System.out.print("/\n");
    }
    System.out.print("#\n#");
  }
}
