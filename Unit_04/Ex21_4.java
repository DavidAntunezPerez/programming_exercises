/**
 * Sentencia if
 *
 * @author Sergio Morales García Y David Antúnez Pérez 1ºDAM
 */
public class Ex21_4 {
    public static void main(String[] args) {
    System.out.println("Este programa indica cual es la media de la asignatura Programación.");
    System.out.print("Introduzca la nota del primer examen: ");
    double nota1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la nota del segundo examen: ");
    double nota2 = Integer.parseInt(System.console().readLine());
    double notaFinal = (nota1 + nota2) / 2;
    if (notaFinal >= 5){
        System.out.println("Tu media de la asignatura es: " + notaFinal);
    } 
   else if (notaFinal < 5){
      System.out.println("Has suspendido, tienes que presentarte a la recuperación.");
      System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto / no apto)");
      String resRecup;
      resRecup = System.console().readLine();
      switch (resRecup){
          case "apto":
          case "Apto":
          case "APTO":
          System.out.println("Tu media de la asignatura es: 5");
          break;
          case "no apto" :
          case "No apto":
          case "NO APTO":
          case "No Apto":
            System.out.println("Tu media de la asignatura es: " + notaFinal);
          break;
          default:
          System.out.println("Lo siento, eso no es un resultado válido, debe escribir 'apto' o 'no apto'.");
      }
    }
  }
}