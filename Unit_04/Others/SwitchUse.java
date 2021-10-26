/**
 * 
 * @author David Antúnez Pérez
 * 
 */


public class SwitchUse {
  
  public static void main (String[] args) {
    System.out.println("Introduce a month number (From 1 to 12)");
    int month = Integer.parseInt(System.console().readLine());
    
    String monthName;
    
    switch (month){
      case 1:
        monthName = "January";
        break;
      case 2:
        monthName = "February";
        break;
      default:
        monthName= "Another Month";
      }
    System.out.println("The month is " + monthName);
  }
}

