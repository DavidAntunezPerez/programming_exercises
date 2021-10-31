/**
 *@author David Antúnez Pérez
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora
 */


public class Ex8 {
  
  public static void main (String[] args) {
    String line;
     System.out.print(" Number of hours of work during all the week: ");
     line = System.console().readLine();
     double hoursWork;
     hoursWork = Integer.parseInt(line);
     double salary = hoursWork * 12;
     System.out.print(" The salary obtained is " + salary + "€");
    
  }
}

