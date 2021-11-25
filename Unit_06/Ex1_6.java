/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author David Antunez Perez
 */
public class Ex1_6 {
  public static void main(String[] args) {
    int add = 0; // suma de números
    int n;
    for (int i = 0; i < 3; i++) {
      n = (int) (Math.random() * 6 + 1);
      add += n;
      System.out.print(n + " ");
    }
    System.out.print("\n");
    System.out.println("La suma de todos los números es: " + add);
  }
}
