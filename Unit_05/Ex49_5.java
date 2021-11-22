/**
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie
 * de números enteros positivos introducidos por teclado. El programa terminará
 * cuando el usuario introduzca un número primo. Este último número no se tendrá
 * en cuenta en los cálculos. El programa debe indicar también cuántos números
 * ha introducido el usuario (sin contar el primo que sirve para salir).
 * 
 * @author David Antunez Perez
 */
public class Ex49_5 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca varios números enteros, para terminar, introduzca un número primo: ");
    int contDivisores = 2; // No puede ser 1
    boolean pregPrimo = true; // Presupone que el número es primo
    do {
      int numInt = Integer.parseInt(System.console().readLine());
      //comprobación de número primo
      pregPrimo = true;
      do {
        pregPrimo = true;
        if (numInt % contDivisores == 0 && numInt != contDivisores) {
          pregPrimo = false; // Si encuentra un divisor: Ya no es primo
        }
        contDivisores++;
      } while (contDivisores < numInt && pregPrimo == true);
    } while (pregPrimo == false);
  }
}
