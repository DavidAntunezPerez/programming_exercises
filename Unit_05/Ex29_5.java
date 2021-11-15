/**
 * 
 * @author David Antunez Perez
 * 
 *         Escribe un programa que muestre por pantalla todos los números
 *         enteros positivos menores a uno leído por teclado que no sean
 *         divisibles entre otro también leído de igual forma.
 */
public class Ex29_5 {
  public static void main(String[] args) {
    int n;
    do {
      System.out.print("Introduce un número positivo: ");
      n = Integer.parseInt(System.console().readLine());
      if ( n < 0){
        System.out.println("ERROR. El número debe ser positivo.");
      }
    } while (n < 0);
  }
}
