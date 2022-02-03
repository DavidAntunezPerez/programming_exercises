public class Ex35_8 {
  public static int decimalBinario(int nIntr) {
    String binario = "";
    while (nIntr > 0) {
      if (nIntr % 2 == 0) {
        binario = "0" + binario;
      } else {
        binario = "1" + binario;
      }
      nIntr = nIntr / 2;
    }
    int result = Integer.parseInt(binario);
    return result;
  }

  public static String convierteEnPalotes(int n) {
    int Binario = decimalBinario(n);
    String palotes = "";
    
  }
}
