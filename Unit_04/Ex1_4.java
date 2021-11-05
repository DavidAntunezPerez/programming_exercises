/**
 * 
 * @author David Antúnez Pérez
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 */


public class Ex1_4 {
  
  public static void main (String[] args) {
    String line;
    System.out.print(" Escribe un día de la semana de Lunes a Viernes (En mayúscula la primera letra y con tilde si es necesario): ");
    line = System.console().readLine();
    System.out.println("------------------");
    System.out.println("");
     
    switch(line) {
      case "Lunes":
        System.out.println(" El Lunes a primera hora tenemos Programación en 1º DAM");
        break;
      case "Martes":
        System.out.println(" El Martes a primera hora tenemos Programación en 1º DAM");
        break;      
      case "Miércoles":
        System.out.println(" El Miércoles a primera hora tenemos Sistemas Informáticos en 1º DAM");
        break;      
      case "Jueves":
        System.out.println(" El Jueves a primera hora tenemos Programación en 1º DAM");
        break;      
      case "Viernes":
        System.out.println(" El Viernes a primera hora tenemos Sistemas Informáticos en 1º DAM");
        break;      
      default:
        System.out.println(" Eso no es un día de la semana. Sigue las instrucciones.");
        
    
    }
  }
}

