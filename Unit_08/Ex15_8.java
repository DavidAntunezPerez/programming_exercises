import functions.Functions_1to14_8;

public class Ex15_8 {
  public static void main(String[] args) {
    for (int i = 1; i <= 1000; i++) {
      if (Functions_1to14_8.esPrimo(i)) {
        System.out.printf("%5d", i);
      }
    }
  }
}
