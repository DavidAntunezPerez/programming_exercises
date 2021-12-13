/**
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
 * dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo
 * dígito, se
 * queda igual.
 * 
 * @author David Antunez Perez
 */
public class Ex55_5 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    int n = Integer.parseInt(System.console().readLine());
    int cont = 0;
    for (int i = n; i > 0;) {
      i /= 10;
      cont++;
    }
    int aux = n % 10;
    
    System.out.print(" "+aux);

  }
}
