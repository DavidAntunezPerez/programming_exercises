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
public class Ex17_7 {
  public static void main(String[] args) {
    // Declarar array
    int[] n = new int[10];
    // Llenar array de números random
    for (int i = 0; i < n.length; i++) {
      n[i] = (int) (Math.random() * 100);
    }
    // Mostrar array original
    System.out.println("ARRAY ORIGINAL");
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
    boolean valid = false;
    int l = 0;
    int nIntr;
    do {
      // Pedir número a usuario
      System.out.print("Por favor, indique un número entre 0 y 100: ");
      nIntr = Integer.parseInt(System.console().readLine());
      // Comprobar que se encuentra en el array
      for (int i = 0; i < n.length; i++) {
        if (n[i] == nIntr) {
          valid = true;
        } else if ((n[i] != nIntr) && (!valid)) {
          l++;
        }
      }
      if (!valid) {
        System.out.print("Su número no se encuentra entre los números dados, inténtelo de nuevo.");
        System.out.println();
        l = 0;
      }
    } while (!valid);
    // Rotar el array para que ese número quede primero
    int aux;
    l = n.length - l;
    do {
      for (int i = 0; i < n.length - 1; i++) {
        aux = n[i + 1];
        n[i + 1] = n[0];
        n[0] = aux;
      }
      l--;
    } while (l > 0);
    // Mostramos el array resultante
    System.out.println();
    System.out.println("ARRAY RESULTANTE");
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
  }
}
