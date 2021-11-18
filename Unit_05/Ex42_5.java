/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido. Al lado de cada número se debe indicar si se trata de un primo o
 * no.
 * 
 * @author David Antunez Perez
 */
public class Ex42_5 {
  public static void main(String[] args) {
    System.out.print("Introduce un número entero positivo: ");
    int numInt = Math.abs(Integer.parseInt(System.console().readLine())); // Número Introducido
    int contDivisores = 2; // No puede ser 1
    boolean pregPrimo = true; // Presupone que el número es primo
    for (int i = numInt; i <= numInt + 5; i++) {
      pregPrimo = true;
      do {
        if ((i % contDivisores == 0) && (i != contDivisores)) {
          pregPrimo = false; // Si encuentra un divisor: Ya no es primo
        }
        contDivisores++;
      } while ((contDivisores < i) && (pregPrimo == true));
      // Es menor que "<" porque no puede ser el mismo número
      contDivisores = 2;
      if (pregPrimo == true) {
        System.out.print(i + " es primo\n");
      } 
      else if (pregPrimo == false) {
        System.out.print(i + " no es primo\n");
      }
    }
  }
}
