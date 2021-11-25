/**
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría
 * a dar la vuelta y se colocaría a la derecha. Si el número tiene un solo
 * dígito, se queda igual.
 * 
 * @author David Antunez Perez
 */
public class Ex52_5 {
  public static void main(String[] args) {
    System.out.print("Escribe un número ");
    int numInt = Integer.parseInt(System.console().readLine());
    int n = numInt;
    int cif = 0; // contador de cifras
    do {
      n /= 10;
      cif++;
    } while (n > 0);
    System.out.print("El resultado es ");
  }
}
