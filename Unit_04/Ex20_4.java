/**
 * 
 * @author David Antúnez Pérez
 * 
 */
public class Ex20_4 {
    public static void main(String[] args) {
      int n;
      boolean capicua = false;
      System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
      n = Integer.parseInt(System.console().readLine());
// una cifra
  if (n < 10) {
    capicua = true;
  }  
  // dos cifras
  if ((n >= 10) && (n < 100)) {
  if ((n / 10) == (n % 10)) {
  capicua = true;
  }
  }
  // tres cifras
  if ((n >= 100) && (n < 1000)) {
  if ((n / 100) == (n % 10)) {
  capicua = true;
  }
  }
  // cuatro cifras
  if ((n >= 1000) && (n < 10000)) {
  if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
  capicua = true;
  }
  }
  // cinco cifras
  if (n >= 10000) {
  if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
  capicua = true;
  }
  }
  if (capicua) {
  System.out.println("El número introducido es capicúa.");
  } else {
  System.out.println("El número introducido no es capicúa.");
  }
 }
}

