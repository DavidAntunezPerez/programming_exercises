/**
 * @author David Antúnez Pérez
 * 
 *         Escribe un programa que calcule el factorial de un número entero
 *         leído por teclado.
 */
public class Ex28_5 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
    int result = 0;
    
    System.out.print(n+"! = "+ result);
  }
}
