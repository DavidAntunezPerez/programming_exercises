/**
 * @author David Antúnez Pérez
 * 
 * 
 */


public class Ex5_4 {
  
  public static void main (String[] args) {
      System.out.println(" First degree ecuations calculator.");
      System.out.println(" This calculator will solve first degree ecuations estructured as: ax+b=0 ");
      String line;
      System.out.print(" Select a value: ");
      line = System.console().readLine();
      double a;
      a = Integer.parseInt(line);
      String line2;
      System.out.print(" Select b value: ");
      line2 = System.console().readLine();
      double b;
      b = Integer.parseInt(line2);
      double result = -b / a;
      System.out.println(" x = " + result);
      if((a==0)&&(b==0)) {
        System.out.println(" La ecuación no tiene solución");        
        }
      }
  }

