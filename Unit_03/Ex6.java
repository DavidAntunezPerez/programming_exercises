/**
 * @author David Antúnez Pérez
 * 
 * 
 */


public class Ex6 {
  
  public static void main (String[] args) {
     String line;
     System.out.print(" Triangle height: ");
     line = System.console().readLine();
     double number1;
     number1 = Integer.parseInt(line);
     System.out.print(" Triangle base: ");
     line = System.console().readLine();
     double number2;
     number2 = Integer.parseInt(line);
     System.out.println( " Triangle height is: " + number1 );
     System.out.println( " Triangle base is: " + number2);
     double result = (number1 * number2) / 2;
     System.out.println( " The area of the triangle is: " + result);
  }
}

