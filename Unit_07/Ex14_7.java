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
    System.out.print("Introduce 8 palabras seguidas cada una de ENTER: \n");
    for(int i = 0; i < words.length; i++){
      words[i] = System.console().readLine();
    }
  }
}
