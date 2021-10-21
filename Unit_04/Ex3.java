/**
 * @author David Antúnez Pérez
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente 
 * nombre del día de la semana.
 *
 * 
 */


public class Ex3 {
  
  public static void main (String[] args) {
    String line;
    System.out.print(" Escribe un número del 1 al 7: ");
    line = System.console().readLine();
    int number;
    number = Integer.parseInt(line);
    switch (number) {
      case 1:
        System.out.println(" El primer día de la semana es el Lunes");
        break;
      case 2:
        System.out.println(" El segundo día de la semana es el Martes");
        break;
      case 3:
        System.out.println(" El tercer día de la semana es el Miércoles");
        break;
      case 4:
        System.out.println(" El cuarto día de la semana es el Jueves");
        break;
      case 5:
        System.out.println(" El quinto día de la semana es el Viernes");
        break;
      case 6:
        System.out.println(" El sexto día de la semana es el Sábado");
        break;
      case 7:
        System.out.println(" El séptimo día de la semana es el Domingo");
        break;
      default:
      System.out.println(" El número indicado no cumple los requisitos del programa.");
    }
  }
}

