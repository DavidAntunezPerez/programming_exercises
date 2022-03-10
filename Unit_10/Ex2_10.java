
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
    for (int i = 0; i < a.size(); i++) {
      random = (int) (Math.random() * 101);
      a.add(random);
      System.out.print(a.get(i) + " ");
    }
    System.out.println("Nº de elementos: " + a.size());

  }
}
