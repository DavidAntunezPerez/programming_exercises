/**
 * Escribe un programa que pida un número por teclado y que luego lo “disloque”
 * de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
 * es impar. Usa long en lugar de int donde sea necesario para admitir números
 * largos.
 * 
 * @author David Antunez Perez
 */
public class Ex68_5 {
  public static void main(String[] args) {
    // Separa número del último al primero
    System.out.print("Por favor, introduzca número: ");
    int numInt = Integer.parseInt(System.console().readLine());

    int cifra = numInt;
    int cogNum = 0;
    int contDigit = 0;

    for (int h = 1; h <= numInt; h *= 10) {
      contDigit++;
    }

    for (int i = 1; i <= contDigit; i++) {
      int potencia10 = (int) (Math.pow(10, (contDigit - i)));
      cogNum = cifra / potencia10;
      cifra = cifra - (cogNum * potencia10);
      if (cogNum % 2 != 0) {
        cogNum--;
      } else if (cogNum % 2 == 0) {
        cogNum++;
      }
      System.out.print(cogNum);
    }

  }
}
