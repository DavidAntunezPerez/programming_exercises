/**
 * 
 * @author David Antúnez Pérez
 * 
 */


public class Ex4 {
  
  public static void main (String[] args) {
     String line;
      System.out.print(" Select the number of hours of work during all the week: ");
      line = System.console().readLine();
      double hoursWork;
      hoursWork = Integer.parseInt(line);
      double salary;
      if (hoursWork <= 40){
        salary = hoursWork * 12;
        }
        else {
          salary = ((hoursWork - 40) * 16) + 480;
          }
        
        System.out.print(" The salary obtained is " + salary + "€");
    
  }
}

