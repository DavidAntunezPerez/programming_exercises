/**
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en
 * los ejemplos. El usuario debe introducir la altura de la figura. Este
 * ejercicio
 * ya se realizó en el tema de bucles, ahora se trata de usar una función para
 * que la implementación sea más sencilla. Por ejemplo, se puede crear una
 * función linea(char caracter, int repeticiones) que pinte una línea con el
 * carácter
 * especificado.
 * 
 */
public class Ex41_8 {
  public static String linea(char caracter, int repeticiones) {
    String result = "";
    for (int i = 0; i < repeticiones; i++) {
      result += String.valueOf(caracter);
    }
    return result;
  }
}
