/**
 * @author David Antúnez Pérez
 * 
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 * otra variable como cadena de caracteres y asígnale como valor la concatenación 
 * de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 * por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 * 
 */


public class Ex8_2 {
  
  public static void main (String[] args) {
    char num1 = '1';
    char num2 = '2';
    char num3 = '3';
    char num4 = '4';
    char num5 = '5';
    //String mix = num1 + num2 + num3 + num4 + num5;
    String mix = "" + num1 + num2 + num3 + num4 + num5;
    System.out.println(mix);
    
  }
}

