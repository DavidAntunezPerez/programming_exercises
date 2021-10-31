/**
 * @author David Antúnez Pérez
 * Realiza un conversor de Mb a Kb
 */


public class Ex10 {
  
  public static void main (String[] args) {
    String line;
    System.out.print(" Number of MB: ");
    line = System.console().readLine();
    double number1;
    number1 = Integer.parseInt(line);
    System.out.println( " Selected value: " + number1 + "MB");
    double result = number1 * 1000;
    System.out.println( " Value converted: " + result + "kB");
  }
}

