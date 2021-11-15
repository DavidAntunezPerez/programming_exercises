import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.html.HTMLDocument.BlockElement;

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
      if (n < 0) {
        System.out.println("ERROR. El número debe ser positivo.");
      }
    } while (n < 0);
    boolean div = false;
    for (int i = n; i > 0; i--) {
      for (int j = i - 1; j > 0; j--) {
        if (i % j != 0) {
          div = true;
          j = 0;
        }
      }
      if (div == false) {
        System.out.print(i + " ");
      }
    }
  }
}
