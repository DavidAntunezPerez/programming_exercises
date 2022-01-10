/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse
 * y viceversa.
 * 
 * @author David Antunez Perez
 */
public class Ex3_7 {
  public static void main(String[] args) {
    int[] n = {0 ,1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.print("ORDEN NORMAL : ");
    for(int i = 0; i < 10; i++){
      System.out.print(n[i] + " ");
    }
    System.out.println();
    System.out.print("ORDEN INVERSO: ");
    for(int i = 9; i >= 0; i--){
      System.out.print(n[i] + " ");
    }
  }
}
