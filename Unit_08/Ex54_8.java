public class Ex54_8 {
  public static void main(String[] args) {
    int[] a = { 714, 81, 9, 11 };
    System.out.println(ocurrencias(5, 25153));
    System.out.println(ocurrencias(6, a));
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
    int repeticiones = 0;
    for (int j = 0; j < a.length; j++) {
      // Separa número del último al primero
      int numInt = a[j];
      int cifra = numInt;
      int cogNum = 0;
      for (int i = 1; i <= numInt; i *= 10) {
        cogNum = cifra % 10;
        if (cogNum == digito) {
          repeticiones++;
        }
        cifra = (cifra - cogNum) / 10;
      }
    }
    return repeticiones;
  }
}
