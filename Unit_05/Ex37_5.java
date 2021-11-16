/**
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 * 
 * @author David Antunez Perez
 */
public class Ex37_5 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numInt = Integer.parseInt(System.console().readLine());
    // Separa número del último al primero

    int cifra = numInt;
    int cogNum = 0;
    int contDigit = 0;

    for (int h = 1; h <= numInt; h *= 10) {
      contDigit++;
    }

    for (int i = 1; i <= contDigit; i++) {
      int potencia10 = (int) (Math.pow(10, (contDigit - i)));
      cogNum = cifra / potencia10;
      System.out.print(cogNum + "\n");
      cifra = cifra - (cogNum * potencia10);
    }
  }
}
