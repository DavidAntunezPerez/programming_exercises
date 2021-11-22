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

    int numero;
    int suma = 0;
    int cuentaNumeros = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    boolean esPrimo;

    do {
      numero = Integer.parseInt(s.nextLine());

      // comprueba si el número introducido es primo
      esPrimo = true;
      for (int i = 2; i < numero; i++) {
        if ((numero % i) == 0) {
          esPrimo = false;
        }
      }
      
      // si no es primo, se contabiliza
      if (!esPrimo) {
        suma += numero;
        cuentaNumeros++;
        
        maximo = numero > maximo ? numero : maximo;
        minimo = numero < minimo ? numero : minimo;
      }
      
    } while (!esPrimo);
    
    System.out.println("Ha introducido " + cuentaNumeros + " números no primos.");
    System.out.println("Máximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Media: " + (double)suma / cuentaNumeros);
    s.close();
  }
}
