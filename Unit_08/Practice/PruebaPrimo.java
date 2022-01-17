import java.util.Scanner;

public class PruebaPrimo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] n = new int[200];
    for (int i = 0; i < n.length; i++) {
      n[i] = random(1, 100);
    }

    for (int num : n) {
      System.out.printf("%3d", num);
    }
  }

  public static int random(int start, int end) {
    return (int) (Math.random() * (end - start + 1) + start);
  }
}
