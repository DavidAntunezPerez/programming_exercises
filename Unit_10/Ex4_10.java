
/**
 * @author David Antunez Perez
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Ex4_10 {
  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<String>(10);
    System.out.print("Introduce una letra: ");
    String n = System.console().readLine();
    a.add(n);
    for (int i = 0; i < 9; i++) {
      System.out.print("Introduce otra letra: ");
      n = System.console().readLine();
      a.add(n);
    }
    System.out.println("Array Ordenado de menor a mayor:");
    Collections.sort(a);
    for (String num : a) {
      System.out.print(num + " ");
    }

  }
}
