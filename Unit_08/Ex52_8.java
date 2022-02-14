public class Ex52_8 {
  public static void main(String[] args) {
    int[] x = {1, 2, 3, 4, 5, 6, 7};
    System.out.println(aleatorioDeArray(x));
  }
  public static int aleatorioDeArray(int[] a){
    int n = (int) (Math.random() * a.length);
    return a[n];
  }
}
