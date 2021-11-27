/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor
 * 
 * @author David Antunez Perez
 */
public class Ex13_6 {
  public static void main(String[] args) {
    int d1;
    int d2;
    do {
      d1 = (int) (Math.random() * 6 + 1);
      System.out.println("La tirada del primer dado ha dado como resultado: " + d1);
      d2 = (int) (Math.random() * 6 + 1);
      System.out.println("La tirada del segundo dado ha dado como resultado: " + d2);
    } while (d1 != d2);
    System.out.println("Los dados han coincidido.");
  }
}
