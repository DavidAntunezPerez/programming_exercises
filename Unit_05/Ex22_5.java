/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos
 * 
 * @author DavidAntunezPerez
 */
public class Ex22_5 {
  public static void main(String[] args) {
    boolean primo = true;
    System.out.println("Los números primos entre 2 y 100 son: ");

    for (int n = 2; n <= 100; n++) {
      primo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          primo = false;
        }
      }
      if (primo) {
        System.out.print(n + " ");
      }
    }
  }
}
