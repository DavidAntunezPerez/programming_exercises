/**
 * 
 * @author David Antúnez Pérez
 * 
 */

public class Ex8_4 {
  
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
      
      if ((result > 6)&&(result < 9)){
        System.out.println(" Has sacado una media de notable. Esfuerzate un poco más y llegarás al sobresaliente.");
        }
        
      else if ((result>=5)&&(result<=6)){
        System.out.println(" Has sacado una media de suficiente. Vas muy justo, esfuerzate más.");
        }
        
        else if(result<5){
          System.out.println(" Has sacado una media de insuficiente, estudia más.");
          }
          else{
          System.out.println(" ¡Has sacado una media de sobresaliente! ¡Sigue asi!");
          }
  }
}


