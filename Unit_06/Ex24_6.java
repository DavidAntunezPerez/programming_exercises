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
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    // calcula la longitud del número
    int longitud = 0;

    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);

    // elige una posición al azar dentro del número
    int posicion = (int) (Math.random() * longitud) + 1;

    // extrae el dígito de esa posición
    System.out.println((numeroIntroducido / (long) (Math.pow(10, longitud - posicion))) % 10);
  }
}
