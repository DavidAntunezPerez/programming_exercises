/**
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
 * número al usuario. Se debe comprobar que el número introducido por teclado
 * se encuentra dentro del array, en caso contrario se mostrará un mensaje por
 * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca
 * uno
 * correctamente. A continuación, el programa rotará el array hacia la derecha
 * las veces que haga falta hasta que el número introducido quede situado en la
 * posición 0 del array. Por último, se mostrará el array rotado por pantalla.
 * 
 * @author David Antunez Perez
 */
public class Ex18_7 {
  public static void main(String[] args) {
    // Declarar array
    int[] n = new int[10];
    // Llenar array de números random
    for (int i = 0; i < n.length; i++) {
      n[i] = (int) (Math.random() * 100);
    }
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
    boolean valid = false;
    do {
      // Pedir número a usuario
      System.out.print("Por favor, indique un número entre 0 y 100: ");
      int nIntr = Integer.parseInt(System.console().readLine());
      // Comprobar que se encuentra en el array

      for (int i = 0; i < n.length; i++) {
        if (n[i] == nIntr) {
          valid = true;
        }
      }
      if (!valid) {
        System.out.print("Su número no se encuentra entre los números dados, inténtelo de nuevo.");
        System.out.println();
      }
    } while (!valid);
  }
}
