/**
 * Escribe un programa que permita partir un número introducido por teclado en
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por el
 * 1. Suponemos que el usuario introduce correctamente los datos, es decir, el
 * número introducido tiene dos dígitos como mínimo y la posición en la que se
 * parte el número está entre 2 y la longitud del número. No se permite en este
 * ejercicio el uso de funciones de manejo de String (por ej. para extraer
 * subcadenas dentro de una cadena).
 * 
 * 
 * @author David Antunez Perez
 */
public class Ex43_5 {
  public static void main(String[] args) {
    // Separa número del último al primero
    System.out.print("Por favor, introduzca número: ");
    int numInt = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posición desde la que partir el número: ");
    int pos = Integer.parseInt(System.console().readLine());

    int cifra = numInt;
    int cogNum = 0;

    System.out.print("Los números partidos son el ");
      int p1 = (int) (Math.pow(10, pos));
      cogNum = cifra / p1;
      System.out.print(cogNum + " ");
      cifra = cifra - (cogNum * p1);
    System.out.print("y el ");
    int p2 = (int) (Math.pow(10, pos));
      cogNum = cifra % p2;
      System.out.print(cogNum + " ");
  }
}
