/**
 * @author David Antúnez Pérez
 * Escribe un programa que calcule el volumen de un cono.
 */


public class Ex9_3 {
  
  public static void main (String[] args) {
    String line;
    System.out.print(" Cone height (in cm): ");
    line = System.console().readLine();
    double number1;
    number1 = Integer.parseInt(line);
    System.out.print(" Cone radius (in cm): ");
    line = System.console().readLine();
    double number2;
    number2 = Integer.parseInt(line);
    System.out.println( " Cone height is " + number1 + "cm");
    System.out.println( " Cone base is " + number2 + "cm");
    double result = (number1 * Math.pow(number2, 2) * Math.PI) / 3;
    System.out.printf( " The area of the cone is " + result + " cm^3");
  }
}

