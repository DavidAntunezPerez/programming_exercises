package Others;
public class Unit3Try2
 {
  
  public static void main (String[] args) {
     String line;
     System.out.println("Please, put a number: ");
     line = System.console().readLine();
     int number1;
     number1 = Integer.parseInt(line);
     System.out.println("Put another number, please: ");
     line = System.console().readLine();
     int number2;
     number2 = Integer.parseInt(line);
     int total;
     total = (2 * number1) + number2;
     System.out.print( " First number is: " + number1 );
     System.out.print( " Second number is: " + number2 );
     System.out.print(" Total is "+total);
     
  }
}
