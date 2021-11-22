/**
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir
 * números largos.
 * 
 * @author David Antunez Perez
 */
public class Ex48_5 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero: ");
    int numInt = Integer.parseInt(System.console().readLine());
    // contamos los dígitos
    int n = numInt;
    int contDig = 1;
    do {
      n /= 10;
      contDig++;
    } while (n > 0);
    
    System.out.print("Dígitos que aparecen en el número: ");

    System.out.print("Dígitos que no aparecen: ");
  }
}
