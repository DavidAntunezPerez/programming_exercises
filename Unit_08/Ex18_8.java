/**
 * Escribe un programa que pase de decimal a binario.
 */
public class Ex18_8 {
  public static void main(String[] args) {
    System.out.println(decimalBinario(82));

  }

  public static long decimalBinario(int nIntr) {
    String binario = "";
    while (nIntr > 0) {
      if (nIntr % 2 == 0) {
        binario = "0" + binario; 
      } else {
        binario = "1" + binario;
      }
      nIntr = nIntr / 2; 
    }
    long result = Long.parseLong(binario);
    return result;
  }
}
