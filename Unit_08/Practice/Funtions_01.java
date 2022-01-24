


// Funcion para calcular la media del trimestre con funciones
import java.util.Scanner;

public class Funtions_01 {
  // LA FUNCIÓN SE PONE POR AQUI
  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      // Introducción de notas y pedirlas por pantalla
      System.out.println("Introduzca la nota del primer examen:");
      double nota1 = Double.parseDouble(s.nextLine());
      System.out.println("Introduzca la nota del segundo examen:");
      double nota2 = Double.parseDouble(s.nextLine());

      System.out.printf("La nota media del trimestre es " + mediaTrimestre(nota1, nota2));
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
  }

  // FUNCIONES:
  public static double mediaTrimestre(double notaExamen1, double notaExamen2) {
    /**
     * si no devolviera nada ponemos void, siempre decimos el tipo y "nombre" de los
     * datos que va a entregar, se pueden repetir con el main
     */
    double result;
    result = notaExamen1 * 0.4 + notaExamen2 * 0.6;
    return result; // cuando quiero devolver un dato utilizo return
    // tambien se puede return notaExamen1 * 0.4 + notaExamen2 * 0.6; pero es menos intuitivo
  }
}
