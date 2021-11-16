/**
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden,
 * de izquierda a derecha. Usa long en lugar de int donde sea necesario para
 * admitir números largos.
 * 
 * @author David Antunez Perez
 */
public class Ex32_5 {
  public static void main(String[] args) {
    System.out.printf("Introduzca un número entero positivo: \n");
    int numInt = Integer.parseInt(System.console().readLine());

    int cifra = numInt;
    int cogNum = 0;
    int contDigit = 0;
        
    for ( int h = 1; h <= numInt; h *= 10 ) {
      contDigit++;
    }
        System.out.print("Dígitos pares: ");
    for ( int i = 1; i <= contDigit; i++ ) {
      int potencia10 = (int)(Math.pow(10,(contDigit-i)));
      cogNum = cifra / potencia10;
      System.out.print(cogNum+" ");
      cifra = cifra - (cogNum*potencia10);
    }
    System.out.printf("Suma de dígitos pares: \n");

  }
}
