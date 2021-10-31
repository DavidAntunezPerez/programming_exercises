/**
 * 
 * @author David Antúnez Pérez
 * 
 *
 * 
 */


public class Ex4 {
 
  public static void main (String[] args) {
     String line;
     System.out.print(" Please, put a number: ");
     line = System.console().readLine();
     double number1;
     number1 = Integer.parseInt(line);
     System.out.print(" Put another number, please: ");
     line = System.console().readLine();
     double number2;
     number2 = Integer.parseInt(line);
     System.out.println( " First number is: " + number1 );
     System.out.println( " Second number is: " + number2);
     double plus = number1 + number2;
     System.out.println( " First number plus second number is: " + plus);
     double minus = number1 - number2;
     System.out.println( " First number minus second number is: " + minus);
     double mult = number1 * number2;
     System.out.println( " First numer multiplied by second number is: " + mult);
     double div = number1 / number2;
     System.out.println( " First numer divided by second number is: " + div);
  
  }
}

