/**
 * @author David Antúnez Pérez
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 */


public class Ex2_4 {
  
  public static void main (String[] args) {
    String line;
    System.out.print(" ¿Qué hora es? Escríbelo en números enteros. ");
    line = System.console().readLine();
    System.out.println("");
    int hour;
    hour = Integer.parseInt(line);
    if ((hour > 5) && (hour < 13)) {
      System.out.println( " Buenos días ");
      }
    else if ((hour > 12) && (hour < 21))    {
      System.out.println( " Buenas tardes ");
      }
    else if ((hour > 20) ||  (hour < 6)) {
      System.out.println( " Buenas noches ");
      }
  }
}

