import functions.Functions_1to14_8;

public class Ex16_8 {
  public static void main(String[] args) {
    for (int i = 1; i <= 99999; i++) {
      if (Functions_1to14_8.esCapicua(i)) {
        System.out.printf("%10d", i);
      }
    }
  }
}
