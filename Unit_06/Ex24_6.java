/**
 * Escribe un programa que, dado un número introducido por teclado, elija al
 * azar
 * uno de sus dígitos.
 * 
 * @author David Antunez Perez
 */
public class Ex24_6 {
  public static void main(String[] args) {
    // Separa número del último al primero
    System.out.print("Por favor, introduzca número: ");
    int numInt = Integer.parseInt(System.console().readLine());
    int cifra = numInt;
    int cogNum = 0;
    for (int i = 1; i <= numInt; i *= 10) {
      cogNum = cifra % 10;
      System.out.print(cogNum + "\n");
      cifra = (cifra - cogNum) / 10;
    }
  }
}
