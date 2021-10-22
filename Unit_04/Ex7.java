/**
 * 
 * @author David Antúnez Pérez
 * 
 */


public class Ex7 {
  
  public static void main (String[] args) {
     System.out.println(" CALCULADORA DE MEDIA DE TRES NOTAS");
     System.out.println("-----------------------------------");
      String line;
      System.out.print(" Escriba la primera nota: ");
      line = System.console().readLine();
      double a;
      a = Integer.parseInt(line);
      String line2;
      System.out.print(" Escriba la segunda nota: ");
      line2 = System.console().readLine();
      double b;
      b = Integer.parseInt(line2);
      String line3;
      System.out.print(" Escriba la primera nota: ");
      line3 = System.console().readLine();
      double c;
      c = Integer.parseInt(line3);
      double result = (a + b + c) / 3;
      System.out.println(" La media entre las notas " + a + ", " + b + " y " + c + " es " + result + ".");
  }
}

