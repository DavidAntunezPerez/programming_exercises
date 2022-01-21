package Practice.misfunciones;

/**
 * Realiza figuras
 */

public class Figuras {
  /**
   * Crea una linea de asteriscos de una longitud determinada
   * 
   * @param longitud tamaño de la línea
   * @return una línea de asteriscos
   */
  public static String line(int longitud) {
    String result = "";
    for (int i = 0; i < longitud; i++) {
      result += "*";
    }
    return result;
  }
}// class
