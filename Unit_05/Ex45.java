/**
 * Escribe un programa que cambie un dígito dentro de un número dando la
 * posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
 * empezando por el 1. Se recomienda usar long en lugar de int ya que el primero
 * admite números más largos. Suponemos que el usuario introduce correctamente
 * los datos.
 * 
 * 
 * @author David Antunez Perez
 */
public class Ex45 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero positivo: ");
    int nIntr = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el dígito que quieres insertar: ");
    int digit = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posicion donde quieres insertar: ");
    int pos = Integer.parseInt(System.console().readLine());
    int n = nIntr;
    // contar digitos
    int contDig = 0;
    do {
      n /= 10;
      contDig++;
    } while (n > 0);
    // num a la izquierda del dígito
    int left = nIntr / (int) (Math.pow(10, contDig - pos + 1));
    // num a la derecha del dígito
    int right = nIntr % (int) (Math.pow(10, contDig - pos));
    // mostramos resultado:
    System.out.print("El número resultante es:" + left + "" + digit + "" + right + "");
  }
}
