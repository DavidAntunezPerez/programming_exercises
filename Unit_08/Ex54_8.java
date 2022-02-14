public class Ex54_8 {
  public static void main(String[] args) {

  }

  public static int ocurrencias(int digito, int n) {
    int repeticiones = 0;
    // Separa número del último al primero
    int cifra = n;
    int cogNum = 0;
    for (int i = 1; i <= n; i *= 10) {
      cogNum = cifra % 10;
      if (cogNum == digito) {
        repeticiones++;
      }
      cifra = (cifra - cogNum) / 10;
    }
    return repeticiones;
  }

  public static int ocurrencias(int digito, int[] a) {

  }
}
