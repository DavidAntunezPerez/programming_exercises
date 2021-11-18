public class RandomNumbers_03 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.print((int)(Math.random() * 6+ 25) + " "); // al multiplicar por 10 aumentamos el rango de 1 - 9
    }
  }
}
