/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al
 * índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el
 * array resultante.
 * 
 * @author David Antunez Perez
 */
public class Ex11_7 {
  public static void main(String[] args) {
    int[] n = new int[10];
    for (int i = 0; i < n.length; i++) {
      System.out.print("Introduce un número: ");
      n[i] = Integer.parseInt(System.console().readLine());
    }
  }
}
