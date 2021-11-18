public class RandomMark {
  public static void main(String[] args) {
    // Para nota aleatoria entre toda la clase
    for (int i = 1; i <= 21; i++) {
      System.out.print("El alumno " + i + " ha sacado un ");
      System.out.print((int) (Math.random() * 10+1) + " .");
    }
  }
}
