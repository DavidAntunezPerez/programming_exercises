/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
 * 7.
 * 
 * @author David Antúnez Pérez
 */
public class Ex18_5 {
  public static void main(String[] args) {
    System.out.print("Introduce el primer número: ");
    int n1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    int n2 = Integer.parseInt(System.console().readLine());
    for(int i = n2; (i > n1) && (i < n2);i-=7 ){
      System.out.println(i);
    }
  }
}
