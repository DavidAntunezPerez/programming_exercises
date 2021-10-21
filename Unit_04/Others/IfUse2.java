/**
 * @author David Antúnez Pérez
 * 
 * 
 */


public class IfUse2 {
  
  public static void main (String[] args) {
    System.out.print("Please select a number from 1 to 99: ");
    String line = System.console().readLine();
    int x = Integer.parseInt(line);
    
    if (x > 9){
      System.out.println("Your number has more than one digit!");
      } 
      else {
        System.out.println("Your number has one digit");
        }
  }
}
