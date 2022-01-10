/**
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos
 * arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa,
 * negro,
 * blanco y morado.
 * 
 * @author David Antunez Perez
 */
public class Ex14_7 {
  public static void main(String[] args) {
    String[] words = new String[8];
    String[] result = new String[8];
    String[] color = {
        "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"
    };
    int j = 0;
    System.out.print("Introduce 8 palabras seguidas cada una de ENTER: \n");
    for (int i = 0; i < words.length; i++) {
      words[i] = System.console().readLine();
      for (String c : color) {
        if (words[i].equals(c)) {
          result[i++] = c;
        }
      }
    }
    System.out.println("ARRAY ORIGINAL");
    for (int i = 0; i < words.length; i++) {
      System.out.printf("%-8d", i);
    }
    System.out.println();
    for (int i = 0; i < words.length; i++) {
      System.out.printf("%-8s", words[i]);
    }

    for (int i = 0; i < 8; i++) {
      boolean esColor = false;

      for (String c : color) {
        if (words[i].equals(c)) {
          esColor = true;
        }
      }

      if (!esColor) {
        result[j++] = words[i];
      }
    }
    System.out.println();
    System.out.println("ARRAY RESULTADO");
    for (int i = 0; i < words.length; i++) {
      System.out.printf("%-8d", i);
    }
    for (String r : result) {
      System.out.printf("%-8s", r);
    }

  }
}
