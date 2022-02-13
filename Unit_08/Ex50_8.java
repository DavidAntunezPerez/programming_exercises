import java.util.Arrays;

public class Ex50_8 {
  public static void main(String[] args) {
    int[] x = { 1, 2, 3, 4, 5, 6, 7 };
    int[] y = { 1, 2, 3, 4, 5, 6, 7 };
    System.out.println(
        Arrays.toString(mezcla(x, y)));
  }

  public static int[] mezcla(int[] a, int[] b) {
    int[] result = new int[a.length + b.length];
    int contb = 0;
    int conta = 0;
    int par = 2;
    for (int i = 0; i < result.length; i++) {
      if (((par % 2) == 0) && (conta < a.length)) {
        result[i] = a[conta];
        conta++;
        par++;
      } else if (((par % 2) != 0) && (contb < b.length)) {
        result[i] = b[contb];
        contb++;
        par++;
      } else if (conta > a.length) {
        result[i] = b[contb];
        contb++;
      } else if (contb > b.length) {
        result[i] = a[conta];
        conta++;
      }
    }
    return result;
  }

}
