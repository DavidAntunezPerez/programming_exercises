public class Ex47_9 {
  public static void main(String[] args) {
    int[]x = {1, 2, 3, 4, 5, 6, 7};
    System.out.println(convierteArrayenString(x));
  }
  public static String convierteArrayenString(int[] x) {
    String result = "";
    for (int i = 0; i < x.length; i++){
      result += x[i];
    }
    return result;
  }
}
