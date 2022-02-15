/**
 * @author David Antunez Perez
 * @date 15/02/2022
 *       a) Crea la función linea para pintar lineas de caracteres que tienen un
 *       determinado carácter en los
 *       extremos y otro carácter de relleno. Prueba esta función en un programa
 *       con, al menos, los ejemplos
 *       que se proporcionan a continuación.
 *       public static String linea(int longitud, char extremo, char relleno)
 *       b) Utiliza esta función para pintar una pirámide hueca cuya altura se
 *       pide por teclado. Podemos
 *       suponer que el usuario va a introducir un número mayor o igual a 1.
 * 
 */
public class Ex03dap2 {
  public static void main(String[] args) {
    // a) pintar las lineas de prueba indicadas en el ejercicio
    System.out.println(linea(5, '*', ' '));
    System.out.println(linea(5, '*', '*'));
    System.out.println(linea(6, 'X', '-'));
    System.out.println(linea(3, '&', '$'));
    System.out.println(linea(2, '&', '$'));
    System.out.println(linea(1, '&', '$'));
    System.out.println(linea(0, '&', '$'));
    System.out.println(linea(-3, '&', '$'));
    // b) pintar la pirámide hueca indicada
    System.out.print("Introduzca la altura de la pirámide: ");
    int h = Integer.parseInt(System.console().readLine());
    int imp = 1;
    for (int i = 0; i < h - 1; i++) {
      System.out.print(linea(h - i, ' ', ' '));
      System.out.println(linea(imp, '*', ' '));
      imp += 2;
    }
    // base pirámide
    System.out.println(" " + linea((2 * h) - 1, '*', '*'));
  }

  /**
   * Pinta una línea indicando la longitud, el caracter de relleno y los extremos
   * 
   * @param longitud longitud de la línea
   * @param extremo  carácter extremos de la línea
   * @param relleno  carácter de la parte de dentro de la línea
   * @return String con la línea al completo
   */
  public static String linea(int longitud, char extremo, char relleno) {
    String resultado = "";
    if (longitud > 1) {
      resultado += extremo;
    }
    for (int i = 0; i < longitud - 2; i++) {
      resultado += relleno;
    }
    resultado += extremo;
    return resultado;
  }
}
