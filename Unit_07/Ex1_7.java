/**
 * Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 * 
 * @author David Antunez Perez
 */
public class Ex1_7 {
  public static void main(String[] args) {
    int[] num = new int[12];
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    for (int i = 0; i > 12; i++) {
      System.out.print(num[i] + " ");
    }
    //
  }
}
