/**
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Utiliza
 * funciones para
 * pintar las líneas.
 */
public class Ex42_8 {
  public static void main(String[] args) {
    System.out.println("PINTA PIRAMIDE");
    System.out.println();
    System.out.print("Selecciona el tamaño de la pirámide: ");
    int rep = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print("Selecciona el caracter de la pirámide: ");
    char character = System.console().readLine().charAt(0);
    System.out.println();
    System.out.println(linea(character, String.valueOf(character), rep));
    for (int i = rep-1; i > 0; i--) {
      System.out.println(linea(character, " ", i));
    }
  }

  public static String linea(char lados, String caracter, int repeticiones) {
    String result = "";
    result += String.valueOf(lados);
    for (int i = 0; i < repeticiones - 2; i++) {
      result += String.valueOf(caracter);
    }
    result += String.valueOf(lados);
    return result;
  }
}
