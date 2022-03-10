
/**
 * @author David Antunez Perez
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 */
import java.util.ArrayList;

public class Ex2_10 {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<Integer>(10);
    int random = 0;
    int max = 0;
    int min = 100;
    int sum = 0;
    int rNum = (int) (Math.random() * 2);
    int rSize = 0;
    switch (rNum) {
      case 0:
        rSize = 10;
        break;
      case 1:
        rSize = 20;
        break;
    }
    for (int i = 0; i < rSize; i++) {
      random = (int) (Math.random() * 101);
      a.add(random);
      sum += random;
      if (min > random) {
        min = random;
      }
      if (max < random) {
        max = random;
      }
      System.out.print(a.get(i) + " ");
    }
    System.out.println();
    System.out.println("Nº de elementos: " + a.size());
    System.out.println("Nº mayor: " + max);
    System.out.println("Nº menor: " + min);
    System.out.println("Media: " + (sum / rSize));

  }
}
