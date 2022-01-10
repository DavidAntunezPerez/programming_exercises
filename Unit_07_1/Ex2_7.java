/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los
 * elementos
 * que no han sido inicializados?
 * 
 * @author David Antunez Perez
 */
public class Ex2_7 {
  public static void main(String[] args) {
    String[] simbolo = new String[9];
    simbolo[0] = "'a'";
    simbolo[1] = "'x'";
    simbolo[4] = "'@'";
    simbolo[6] = "''";
    simbolo[7] = "'+'";
    simbolo[8] = "'Q'";
    for (int i = 0; i < 9; i++) {
      System.out.print(simbolo[i] + " ");
    }
    // vemos que en el array de String al hacer un print de algo muestra "null"
    // cuando el valor no esta inicializado.
  }
}
