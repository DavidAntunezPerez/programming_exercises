import functions.Functions_1to14_8;

public class Ex35_8 {
  public static String convierteEnPalotes(int n) {
    int contDigit = Functions_1to14_8.digitos(n);
    String palotes = "";
    // Separa número del último al primero
    int cifra = n;
    int cogNum = 0;

    for (int i = 1; i <= contDigit; i++) {
      int potencia10 = (int) (Math.pow(10, (contDigit - i)));
      cogNum = cifra / potencia10;
      System.out.print(cogNum + "\n");
      cifra = cifra - (cogNum * potencia10);
    }
    return palotes;
  }
}
