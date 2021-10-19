/**
 * @author David Antúnez Pérez
 * 
 * 
 */


public class Ex5 {
  
  public static void main (String[] args) {
     String line;
     System.out.print(" Rectangle height: ");
     line = System.console().readLine();
     double number1;
     number1 = Integer.parseInt(line);
     System.out.print(" Rectangle base: ");
     line = System.console().readLine();
     double number2;
     number2 = Integer.parseInt(line);
     System.out.println( " Rectangle height is: " + number1 );
     System.out.println( " Rectangle base is: " + number2);
     double result = (number1 * number2);
     System.out.println( " The area of the rectangle is: " + result);
  }
}



