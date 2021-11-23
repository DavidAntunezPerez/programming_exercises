import java.util.Scanner;
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
    System.out.println("Por favor, vaya introduciendo números enteros positivos. ");
    System.out.println("Para terminar, introduzca un número primo:");

    Scanner s = new Scanner(System.in);

    int n;
    int suma = 0;
    int count = 0;
    // int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int max = 0;
    boolean esPrimo;

    do {
      n = Integer.parseInt(s.nextLine());

      // comprueba si el número introducido es primo
      esPrimo = true;
      for (int i = 2; i < n; i++) {
        if ((n % i) == 0) {
          esPrimo = false;
        }
      }
      
      // si no es primo, cuenta
      if (!esPrimo) {
        suma += n;
        count++;
        if (n > max){
          max = n;
        }
        // max = n > max ? n : max;
        min = n < min ? n : min;
      }
      
    } while (!esPrimo);
    
    System.out.println("Ha introducido " + count + " números no primos.");
    System.out.println("Máximo: " + max);
    System.out.println("Mínimo: " + min);
    System.out.println("Media: " + (double)suma / count);
    s.close();
  }
}
