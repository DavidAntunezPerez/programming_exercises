/**
 * @author David Antunez Perez
 * 
 *         Realiza un programa que pida primero un número y a continuación un
 *         dígito. El programa nos debe dar la posición (o posiciones) contando
 *         de izquierda a derecha que ocupa ese dígito en el número introducido.
 */
public class Ex26_5 {
  public static void main(String[] args) {
    System.out.print("Escribe un número entero: ");
    int nIntr = Integer.parseInt(System.console().readLine());
    System.out.print("Escribe un dígito: ");
    int digit = Integer.parseInt(System.console().readLine());
    System.out
        .print("Contando de izq a der, " + digit + " aparece dentro de " + nIntr + " en las siguientes posiciones:");
    int n = nIntr;
    int inv = 0;
    int position = 1;

    if ((n == 0) && (digit == 0)) {
      System.out.print(position);
    }
    while (n > 0) {
      inv = (inv * 10) + (n % 10);
      n /= 10;
    }
    while (inv > 0) {
      if (inv % 10 == digit) {
        System.out.print(position + " ");
      }
      inv /= 10;
      position++;
    }
  }
}
