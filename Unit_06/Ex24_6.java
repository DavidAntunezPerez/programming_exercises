/**
 * Escribe un programa que, dado un número introducido por teclado, elija al
 * azar
 * uno de sus dígitos.
 * 
 * @author David Antunez Perez
 */ 
public class Ex24_6 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numIntr = Long.parseLong(System.console().readLine());

    long num = numIntr;

    // calcula la longitud del número
    int lenght = 0;

    do {
      num /= 10;
      lenght++;
    } while (num > 0);

    // elige una posición al azar dentro del número
    int position = (int) (Math.random() * lenght) + 1;

    // extrae el dígito de esa posición
    System.out.println((numIntr / (long) (Math.pow(10, lenght - position))) % 10);
  }
}
