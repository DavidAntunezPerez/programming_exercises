/**
 * 
 * @author David Antúnez Pérez
 * 
 */


public class Ex20 {
  public static void main(String[] args) {
    boolean capicua = false;
    System.out.print("Introduzca un número entero (de 5 cifras como máximo): ");
    int n = Integer.parseInt(System.console().readLine());
    if (n < 10) {
    capicua = true;
    }
    if ((n >= 10) && (n < 100)) {
      if ((n / 10) == (n % 10)) {
        capicua = true;
    }
   }
   if ((n >= 1000) && (n < 10000)){
      if(((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))){
        capicua=true;
    }
   }
   if ((n >= 1000) && (n < 10000)){
    if(((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))){
      capicua=true;
   }
  }
  if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))){
    if((n/10000) == (n%10)){
      capicua=true;
   }
  if(capicua){
    System.out.println("El número es capicua.");
  }
  else{
    System.out.println("El número no es capicua.");
   }
  }
 }
}

