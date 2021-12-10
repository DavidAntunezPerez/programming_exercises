/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al
 * índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
 * ambos
 * números están entre 0 y 9. El programa deberá colocar el número de la
 * posición
 * inicial en la posición final, rotando el resto de números para que no se
 * pierda
 * ninguno. Al final se debe mostrar el array resultante.
 * 
 * @author David Antunez Perez
 */
public class Ex12_7 {
  public static void main(String[] args) {
    int[] n = new int[10];
    for (int i = 0; i < n.length; i++) {
      System.out.print("Introduce un número: ");
      n[i] = Integer.parseInt(System.console().readLine());
    }
    for (int i = 0; i < n.length; i++) {
      System.out.printf(" %4d", i);
    }
    System.out.println();
    for (int i = 0; i < n.length; i++) {
      System.out.printf(" %4d", n[i]);
    }
    System.out.println();
    int pInicial = 9;
    int pFinal = 0;
    do {
      System.out.print("Escribe el número inicial: ");
      pInicial = Integer.parseInt(System.console().readLine());
      System.out.print("Escribe el número final: ");
      pFinal = Integer.parseInt(System.console().readLine());
      if (pFinal < pInicial) {
        System.out.print("El valor inicial no puede ser mayor que el final.\n");
      }
    } while (pFinal < pInicial);
    int aux = n[pFinal];
    n[pFinal] = n[pInicial];
    int aux2 = n[9];
    for (int i = 9; i > 0; i--) {
      n[i] = n[i - 1];
    }
    n[0] = aux2;
  

    // resultado final
    for (int i = 0; i < n.length; i++) {
      System.out.printf(" %4d", i);
    }
    System.out.println();
    for (int i = 0; i < n.length; i++) {
      System.out.printf(" %4d", n[i]);
    }
  }
}
