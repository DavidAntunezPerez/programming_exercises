/**
 * @author David Antúnez Pérez
 * 
 * 
 */


public class IfUse3 {
  
  public static void main (String[] args) {
    System.out.print("Please select a number from 5 to 99: ");
    String line = System.console().readLine();
    int x = Integer.parseInt(line);
    
    if ((x < 5) || (x > 99)){
      System.out.println("THE NUMBER MUST BE BETWEEN 5 AND 99");
      System.out.println("One more try, select a number from 5 to 99: ");
      line = System.console().readLine();
      x = Integer.parseInt(line);
      } 
      if ((x > 5) || (x < 99)){
         System.out.println("Good job! "+ x + " is a correct number");
        }
      else {
        System.out.println("Wrong number again >:(");
        }
  }
}
