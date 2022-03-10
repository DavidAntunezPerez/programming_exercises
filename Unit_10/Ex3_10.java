
/**
 * @author David Antunez Perez
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList
 */

import java.util.ArrayList;
import java.util.Collections;

public class Ex3_10 {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<Integer>(10);
    System.out.print("Introduce un número: ");
    int n = Integer.parseInt(System.console().readLine());
    a.add(n);
    for (int i = 0; i < 9; i++) {
      System.out.print("Introduce otro número: ");
      n = Integer.parseInt(System.console().readLine());
      a.add(n);
    }
    System.out.println("Array Ordenado de menor a mayor:");
    Collections.sort(a);
    for (int num : a) {
      System.out.print(num + " ");
    }

  }
}
