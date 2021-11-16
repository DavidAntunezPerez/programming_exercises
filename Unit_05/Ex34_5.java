/**
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando
 * los dígitos de la siguiente manera: primer dígito del primer número, primer
 * dígito del segundo número, segundo dígito del primer número, segundo dígito
 * del segundo número, tercer dígito del primer número… Para facilitar el
 * ejercicio, podemos suponer que el usuario introducirá dos números de la misma
 * longitud y que siempre habrá al menos un dígito par y uno impar. Usa long en
 * lugar de int donde sea necesario para admitir números largos.
 * 
 * @author David Antunez Perez
 */
public class Ex34_5 {
  public static void main(String[] args) {
    System.out.printf("Introduzca un número entero positivo: ");
    int numInt = Integer.parseInt(System.console().readLine());
    int add = 0; // Suma de todos los números
    int cifra = numInt;
    int cogNum = 0;
    int contDigit = 0;

    for (int h = 1; h <= numInt; h *= 10) {
      contDigit++;
    }
    System.out.print("Dígitos pares: ");
    for (int i = 1; i <= contDigit; i++) {
      int potencia10 = (int) (Math.pow(10, (contDigit - i)));
      cogNum = cifra / potencia10;
      if(cogNum % 2 == 0){
      System.out.print(cogNum + " ");
      add += cogNum;
    }
      cifra = cifra - (cogNum * potencia10);
    }
    System.out.printf("Suma de dígitos pares: " + add);

  }
}
