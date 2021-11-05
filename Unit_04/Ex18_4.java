/**
 * @author David Antúnez Pérez
 */


public class Ex18_4 {
  
  public static void main (String[] args) {
    int num, cif = 0;
    System.out.print("INTRODUCE UN NÚMERO (máximo 5 cifras): ");
      String line;
      line = System.console().readLine();
      num = Integer.parseInt(line);
      if(num < 10) {
        cif = num;
        }
      else if ((num >= 10)&&(num <100)){
        cif = num / 10;
        }
      else if ((num >= 100)&&(num <1000)){
        cif = num / 100;
        }
      else if ((num >= 1000)&&(num < 10000)){
        cif = num / 1000;
        }
      else if ((num >= 10000)&&(num < 100000)){
        cif = num / 10000;
        }
      System.out.println("El primer dígito del número es "+ cif);
    
    
  }
}

