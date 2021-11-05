/**
 * @author David Antúnez Pérez
 * 
 */


public class Ex19_4 {
  
  public static void main (String[] args) {
    int num, cif = 0;
    System.out.print("INTRODUCE UN NÚMERO (máximo 5 cifras): ");
      String line;
      line = System.console().readLine();
      num = Integer.parseInt(line);
      if((num < 10)&&(num > -10)) {
        cif = 1;
        }
      else if ((num >= 10)&&(num <100)){
        cif = 2;
        }
      else if ((num >= 100)&&(num <1000)){
        cif = 3;
        }
      else if ((num >= 1000)&&(num < 10000)){
        cif = 4;
        }
      else if ((num >= 10000)&&(num < 100000)){
        cif = 5;
        }
      else if((num <= -10)&&(num >-100)) {
        cif = 2;
        }
      else if((num <= -100)&&(num >-1000)) {
        cif = 3;
        }
      else if((num <= -1000)&&(num >-10000)) {
        cif = 4;
        }
      else if((num <= -10000)&&(num >-100000)) {
        cif = 5;
        }
      System.out.println("El número dígitos del número es "+ cif);
    
    
  }
}


