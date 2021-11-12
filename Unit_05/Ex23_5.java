/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada de
 * números mientras su suma no supere el valor 10000. Cuando esto último ocurra,
 * se debe mostrar el total acumulado, el contador de los números introducidos y
 * la media.
 * 
 * @author David Antunez Perez
 */
public class Ex23_5 {
  public static void main(String[] args) {
    double total = 0; // Total sumado
    double nIntr = 0; // Número de números introducidos.
    double n = 0;
    do {
      System.out.print("Introduce un número: ");
      n = Double.parseDouble(System.console().readLine());
      if (n <= 10000) {
        total += n;
        nIntr++;
      } else if (n > 10000) {
        System.out.println(
            "ERROR. El número no puede superar 10000, pues este es el límite, por favor, ingrese otro número.");
      }

    } while (total <= 10000);

    System.out.printf(
        "Programa finalizado.\nHas introducido una cantidad de %.2f números. Los números suman %.2f . La media de estos es %.2f .",
        nIntr, total, total / nIntr);
  }

}
