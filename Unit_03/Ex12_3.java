/**
 * @author David Antúnez Pérez
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo 
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 *
 */


public class Ex12_3 {
  
  public static void main (String[] args) {
     String line;
     System.out.print(" Mark obtained in the first exam: ");
     line = System.console().readLine();
     double number1;
     number1 = Integer.parseInt(line);
     System.out.print(" Average you want to obtain: ");
     line = System.console().readLine();
     double number2;
     number2 = Integer.parseInt(line);
     System.out.println( " Mark in first exam: " + number1 );
     System.out.println( " The mark you want to obtain: " + number2);
     double result = ((100 * number2)-(40 * number1)) / (60);
     System.out.println( " To get " + number2 + ", you will have to get " + result + " in the second exam");
  }
}
