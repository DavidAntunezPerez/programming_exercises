import java.util.Arrays;

public class Ex48_8 {
  public static void main(String[] args) {
    int[] x = {1, 2, 3, 4, 5, 6, 7};
    int[] y = {1, 2, 3, 4, 5, 6, 7};
    System.out.println(
    "Array Indicado: "+ Arrays.toString(concatena(x, y)));
  }

  public static int[] concatena(int[] a, int[] b) {
    int[] result = new int[a.length + b.length];
    int cont = 0;
    for (int i = 0; i < result.length; i++) {
      if (i < a.length) {
        result[i] = a[i];
      } else if((i >= a.length)) {
        result[i] = b[cont];
        cont++;
      }
    }
    return result;
  }

}
