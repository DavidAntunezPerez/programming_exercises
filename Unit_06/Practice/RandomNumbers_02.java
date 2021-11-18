public class RandomNumbers_02 {
  public static void main(String[] args) {
    // hacemos casting a int para quitar los decimales
    for (int i = 0; i < 10; i++) {
      System.out.print((int)(Math.random() * 10) + "  \n");
      System.out.print((int)(Math.random() * 11) + "  \n"); // al multiplicar por 11 saldria del 0 al 10
    }
  }
}
