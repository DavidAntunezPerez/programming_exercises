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
  public static void main(String[] args) {
    System.out.println("PINTA PIRAMIDE");
    System.out.println();
    System.out.print("Selecciona el tamaño de la pirámide: ");
    int rep = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print("Selecciona el caracter de la pirámide: ");
    char character = System.console().readLine().charAt(0);
    System.out.println();
    for (int i = rep; i > 0;i--){
    System.out.println(linea(character,i));
  }
  }

  public static String linea(char caracter, int repeticiones) {
    String result = "";
    for (int i = 0; i < repeticiones; i++) {
      result += String.valueOf(caracter);
    }
    return result;
  }
}
