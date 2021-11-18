public class RandomNumbers_01 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.print(Math.random() * 10 + " "); // al multiplicar por 10 aumentamos el rango de 1 - 9
    }
  }
}
