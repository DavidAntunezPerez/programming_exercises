/**
 * @author David Antúnez Pérez
 * Realiza un conversor de kB a MB
 */


public class Ex11 {
  
  public static void main (String[] args) {
    String line;
    System.out.print(" Number of Kb: ");
    line = System.console().readLine();
    double number1;
    number1 = Integer.parseInt(line);
    System.out.println( " Selected value: " + number1 + "kB");
    double result = number1 / 1000;
    System.out.println( " Value converted: " + result + "MB");
  }
}

