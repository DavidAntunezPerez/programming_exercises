public class PruebaPrimo {
  public static void main(String[] args) {
    int[] n = new int[100];
    for (int i = 0; i < n.length; i++) {
      n[i] = random(1, 100);
    }

    for (int num : n) {
      System.out.printf("%3d", num);
    }
    System.out.println();
    System.out.print("Primos: ");
    for (int num : n) {
      if (esPrimo(num)) {
        System.out.printf("%3d", num);
      }
    }
  } // main

  public static int random(int start, int end) {
    return (int) (Math.random() * (end - start + 1) + start);
  } // random

  public static boolean esPrimo(int numInt) {
    // Comrpueba Primo
    int contDivisores = 2; // No puede ser 1
    boolean pregPrimo = true; // Presupone que el número es primo
    do {
      if (numInt % contDivisores == 0 && numInt != contDivisores) {
        pregPrimo = false; // Si encuentra un divisor: Ya no es primo
      }
      contDivisores++;
    } while (contDivisores < numInt && pregPrimo == true);
    // Es menor que "<" porque no  puede ser el misom número
    return pregPrimo;

  }// esPrimo
} // class
