
// Funcion para calcular la media del trimestre , primero , sin funciones
import java.util.Scanner;

public class Funtions_01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // Introducción de notas y pedirlas por pantalla
    System.out.println("Introduzca la nota del primer examen:");
    double nota1 = Double.parseDouble(s.nextLine());
    System.out.println("Introduzca la nota del segundo examen:");
    double nota2 = Double.parseDouble(s.nextLine());

    double average = nota1 * 0.4 + nota2 * 0.6;

    System.out.printf("La nota media del trimestre es %.2f", average);
  }
}
