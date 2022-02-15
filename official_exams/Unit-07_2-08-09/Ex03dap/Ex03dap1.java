/**
 * @author David Antúnez Pérez
 * @date 15/02/2022
 *       Realiza un programa que genere un array cuadrado con números aleatorios
 *       entre el 1 y el 99, ambos
 *       incluidos. La longitud del lado del array (un entero mayor o igual a 1)
 *       se debe pedir al usuario. A
 *       continuación, el usuario podrá extraer un trozo de ese array indicando
 *       la fila y la columna donde se
 *       empieza a extraer y la longitud del lado del trozo.
 *       Tanto el array original como el trozo se deben mostrar con los números
 *       perfectamente alineados,
 *       como se muestra en los ejemplos.
 *       Las filas y las columnas se numeran empezando a contar en la 0
 */
public class Ex03dap1 {
  public static void main(String[] args) {
    // Declaramos las filas y las columnas
    int fila, columna;
    // Pedimos al usuario el tamaño del cuadrado y lo guardamos en una variable
    System.out.print("Introduzca la longitud del lado del array original: ");
    int length = Integer.parseInt(System.console().readLine());
    // Generamos un array a partir de esa longitud
    int[][] original = new int[length][length];
    // Le damos un valor aleatorio a los números del array y
    // los mostramos por pantalla
    System.out.println("ARRAY ORIGINAL:");
    for (fila = 0; fila < original.length; fila++) {
      for (columna = 0; columna < original[0].length; columna++) {
        original[fila][columna] = (int) (Math.random() * 99 + 1);
        System.out.printf("%3d ", original[fila][columna]);
      }
      System.out.println();
    }
    // Pasamos ahora a pedir al usuario los datos para extraer el array
    System.out.println("Vamos a extraer un trozo de ese array");
    System.out.print("Introduzca la fila para comenzar a extraer: ");
    int fExtraida = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la columna para comenzar a extraer: ");
    int cExtraida = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la longitud del lado que se va a extraer: ");
    int lExtraida = Integer.parseInt(System.console().readLine());
    // Ahora con los datos almacenados creamos otro array que sea una parte del
    // original
    int[][] result = new int[lExtraida][lExtraida];
    // Asignamos al array los valores según los indicados y mostramos por pantalla
    for (fila = 0; fila < result.length; fila++) {
      for (columna = 0; columna < result[0].length; columna++) {
        result[fila][columna] = original[fila + fExtraida][columna + cExtraida];
        System.out.printf("%3d ", result[fila][columna]);
      }
      System.out.println();
    }
  }
}
