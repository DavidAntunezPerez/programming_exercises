/**
 *
 * @author David Antúnez Pérez
 * 
 */


public class Ex13 {
  
  public static void main (String[] args) {
    System.out.println(" ORDENADOR DE NÚMEROS ENTEROS");
     System.out.println("--------------------");
      String line;
      System.out.print(" Escriba el primer número: ");
      line = System.console().readLine();
      int num1;
      num1 = Integer.parseInt(line);
      System.out.print(" Escriba el segundo número: ");
      line = System.console().readLine();
      int num2;
      num2 = Integer.parseInt(line);
      System.out.print(" Escriba el tercer número: ");
      line = System.console().readLine();
      int num3;
      num3 = Integer.parseInt(line);
      if ((num1>num2)&&(num2>num3)&&(num1>num3)){
        System.out.println("El resultado es: "+ num1 + ", " + num2 + ", "+ num3 + " .");
        }
      else if ((num1<num2)&&(num1>num3)&&(num2>num3)){
        System.out.println("El resultado es: "+ num2 + ", " + num1 + ", "+ num3 + " .");
        }
      else if ((num1>num2)&&(num2<num3)&&(num3<num1)){
        System.out.println("El resultado es: "+ num1 + ", " + num3 + ", "+ num2 + " .");
        }
      else if ((num1<num2)&&(num1<num3)&&(num3>num2)){
        System.out.println("El resultado es: "+ num3 + ", " + num2 + ", "+ num1 + " .");
        }
      else if ((num1>num2)&&(num2<num3)&&(num3>num1)){
        System.out.println("El resultado es: "+ num3 + ", " + num1 + ", "+ num2 + " .");
        }
      else if ((num1<num2)&&(num1<num3)&&(num3>num2)){
        System.out.println("El resultado es: "+ num2 + ", " + num3 + ", "+ num1 + " .");
        }
  }
}

