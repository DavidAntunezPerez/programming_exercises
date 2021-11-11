/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos
 * 
 * @author DavidAntunezPerez
 */
public class Ex22_5 {
  public static void main(String[] args) {
  //   int n = 100;
  //   System.out.println("Los números primos entre 2 y 100 son: ");
  //   do {
  //     int r = n;
  //     n--;
  //     if (r % n != 0) {
  //       System.out.print(n + " ");
  //     }
  //   } while (n >= 2);
  int n = 100;
  int c = n - 1;
  boolean nPrim = true;
  System.out.println("Los números primos entre 2 y 100 son: ");
  do {
    if ((n % c) == 0) {
      nPrim = false;
    }
    c--;
  } while ((c > 2)&&(nPrim == true));
  if ((nPrim == true)||(n <= 2)) {
    System.out.println(n + " es un número primo.");
  }
  }
}
