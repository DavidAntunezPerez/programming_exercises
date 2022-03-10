
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
    ArrayList<Integer> a = new ArrayList<Integer>();
    for (int i = 0; i < a.size(); i++) {
      a.add((int) (Math.random() * 101));
      System.out.print(a.get(i) + " ");
    }
  }
}
