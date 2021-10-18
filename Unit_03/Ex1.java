/**
 * 
 * @author David Antúnez Pérez
 */

public class Ex1
 {
   public static void main (String[] args) {
     String line;
     System.out.println("Please, put a number: ");
     line = System.console().readLine();
     double number1;
     number1 = Integer.parseInt(line);
     System.out.println("Put another number, please: ");
     line = System.console().readLine();
     double number2;
     number2 = Integer.parseInt(line);
     System.out.println( " First number is: " + number1 );
     System.out.println( " Second number is: " + number2);
     double mult = number1 * number2;
     System.out.println( " First numer multiplied by second number is: " + mult);
  
  }
}
