/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo
 * 
 * @author David Antunez Perez
 */
public class Ex21_5 {
  public static void main(String[] args) {
    int i = 1;
    int cont = 0; // Número de números introducidos.
    int result = 0;
    int imp = 0;
    while (i > 0) {
      System.out.print("Escriba un número: ");
      i = Integer.parseInt(System.console().readLine());
      if (i > 0) {
        result += i;
        cont++;
        System.out.println("(Para finalizar la introducción de datos escriba un número negativo o 0)");
      }
      if (i % 2 != 0) {
        imp++;
      }
    }
    System.out.printf("Se han introducido " + cont + " números.\nDe los cuales " + imp + " son impares y " + cont
        + " es el mayor número par.");
  }
}
