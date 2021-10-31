/**
 *
 * @author David Antúnez Pérez
 * 
 */

public class Ex9 {
  
  public static void main (String[] args) {
     System.out.println(" CALCULADORA DE ECUACIONES DE SEGUNDO GRADO");
     System.out.println("-------------------------------------------");
      String line;
      System.out.print(" Escriba la variable a: ");
      line = System.console().readLine();
      double a;
      a = Integer.parseInt(line);
      System.out.print(" Escriba la variable b: ");
      line = System.console().readLine();
      double b;
      b = Integer.parseInt(line);
      System.out.print(" Escriba la variable c: ");
      line = System.console().readLine();
      double c;
      c = Integer.parseInt(line);
      double result1 = (-b+Math.sqrt((b*b)-4*a*c))/ (2*a);
      double result2 = (-b-Math.sqrt((b*b)-4*a*c))/ (2*a);
      System.out.println("El resultado de la ecuación de variables a = "+a+" b = "+b+" c = "+c+" es: "+result1+" y "+result2);
 }
}
