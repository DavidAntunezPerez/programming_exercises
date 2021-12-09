/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al
 * índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el
 * array resultante.
 * 
 * @author David Antunez Perez
 */
public class Ex11_7 {
  public static void main(String[] args) {
    int[] n = new int[10];
    for (int i = 0; i < n.length; i++) {
      System.out.print("Introduce un número: ");
      n[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println("ARRAY ORIGINAL: ");
    for (int i = 0; i < n.length; i++) {
      System.out.printf(" %4d", i);
    }
    System.out.println();
    for (int i = 0; i < n.length; i++) {
      System.out.printf(" %4d", n[i]);
    }
    System.out.println();
    System.out.println("ARRAY CON PRIMOS PRIMERO:");
    for (int i = 0; i < n.length; i++) {
      System.out.printf(" %4d", i);
    }
    System.out.println();
    // Comrpueba Primo
    for (int i = 0; i < n.length; i++) {
      int numInt = n[i]; // Número Introducido
      // Primo
      int contDivisores = 2; // No puede ser 1
      boolean pregPrimo = true; // Presupone que el número es primo
      do {
        if (numInt % contDivisores == 0 && numInt != contDivisores) {
          pregPrimo = false; // Si encuentra un divisor: Ya no es primo
        }
        contDivisores++;
      } while (contDivisores < numInt && pregPrimo == true);
      if (pregPrimo == true) {
        System.out.printf(" %4d", n[i]);
      }
    }
    for (int i = 0; i < n.length; i++) {
      int numInt = n[i]; // Número Introducido
      // Primo
      int contDivisores = 2; // No puede ser 1
      boolean pregPrimo = true; // Presupone que el número es primo
      do {
        if (numInt % contDivisores == 0 && numInt != contDivisores) {
          pregPrimo = false; // Si encuentra un divisor: Ya no es primo
        }
        contDivisores++;
      } while (contDivisores < numInt && pregPrimo == true);
      if (pregPrimo == false) {
        System.out.printf(" %4d", n[i]);
      }
    }
  }
}
