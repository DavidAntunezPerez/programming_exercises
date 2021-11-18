/**
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * 
 * @author David Antunez Perez
 */
public class Ex41_5 {
  public static void main(String[] args) {
    // Separa número del último al primero
    System.out.print("Por favor, introduzca número: ");
    int numInt = Integer.parseInt(System.console().readLine());
    int cifra = numInt;
    int cogNum = 0;
    int contPos = 0;
    int contNeg = 0;
    for (int i = 1; i <= numInt; i *= 10) {
      cogNum = cifra % 10;
      System.out.print(cogNum + "\n");
      if (cogNum % 2 == 0) {
        contPos++;
      }
      if (cogNum % 2 != 0) {
        contNeg++;
      }
      cifra = (cifra - cogNum) / 10;
    }
    System.out
        .printf("En el número " + numInt + " , hay " + contPos + " números pares y " + contNeg + " números impares.");
  }
}
