public class ExampleArray3 {
  public static void main(String[] args) {
    String[] fruits = new String[6];
    System.out.println("Introduzca 6 nombres de fruta: ");
    for (int i = 0; i < 6; i++) {
      fruits[i] = System.console().readLine();
    }
    for (int i = 0; i < fruits.length; i++) {
      System.out.println("---------------");
      System.out.printf("| %1d | %-10s |\n",i,fruits[i]);
      System.out.println("---------------");
    }
  }
}
