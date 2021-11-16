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
    System.out.printf("Introduzca otro número entero positivo: ");
    int numInt2 = Integer.parseInt(System.console().readLine());
    //numInt
    int cifraPar = numInt;
    int cifraImpar = numInt;
    int cogNumimp = 0;
    int cogNumpar = 0;
    int contDigit = 0;
    //numInt2
    int cifraPar2 = numInt2;
    int cifraImpar2 = numInt2;
    int cogNumimp2 = 0;
    int cogNumpar2 = 0;
    int contDigit2 = 0;


    for (int h = 1; h <= numInt; h *= 10) {
      contDigit++;
    }

    System.out.print("El número formado por los dígitos impares es: ");
    for (int i = 1; i <= contDigit; i++) {
      int potencia10 = (int) (Math.pow(10, (contDigit - i)));
      cogNumimp = cifraImpar / potencia10;
      cogNumimp2 = cifraImpar2 / potencia10;
      if (cogNumimp % 2 != 0) {
        System.out.print(cogNumimp);
      }
      if(cogNumimp2 % 2 != 0){
        System.out.print(cogNumimp2);
      }
      cifraImpar = cifraImpar - (cogNumimp * potencia10);
      cifraImpar2 = cifraImpar2 - (cogNumimp2 * potencia10);
    }
    System.out.print("\nEl número formado pro dígitos pares es: ");
    for (int i = 1; i <= contDigit; i++) {
      int potencia10 = (int) (Math.pow(10, (contDigit - i)));
      cogNumpar = cifraPar / potencia10;
      cogNumpar2 = cifraPar2 / potencia10;
      if (cogNumpar % 2 == 0) {
        System.out.print(cogNumpar);
      }
      if (cogNumpar2 % 2 == 0) {
        System.out.print(cogNumpar2);
      }
      cifraPar2 = cifraPar2 - (cogNumpar2 * potencia10);
      cifraPar = cifraPar - (cogNumpar * potencia10);
    }

  }
}
