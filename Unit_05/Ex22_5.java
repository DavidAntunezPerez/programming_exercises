/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos
 * 
 * @author DavidAntunezPerez
 */
public class Ex22_5 {
  public static void main(String[] args) {
    System.out.println("Los números primos entre 2 y 100 son: ");
    for (int i = 2; i % 2 != 0; i++) {
      System.out.print(i + " ");
    }
  }
}
