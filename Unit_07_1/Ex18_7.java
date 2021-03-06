/**
 * Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
 * ambos incluidos y que los almacene en un array. A continuación, el programa
 * debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente
 * el
 * programa debe colocar de forma alterna y en orden los menores o iguales de
 * 100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
 * mayor… Cuando se acaben los menores o los mayores, se completará con los
 * números que queden.
 * 
 * @author David Antunez Perez
 */
public class Ex18_7 {
  public static void main(String[] args) {
    // Crear array y aleatorizarlo
    int[] n = new int[10];
    int[] aux = new int[10];
    boolean skip = false;
    for (int i = 0; i < n.length; i++) {
      skip = false;
      n[i] = (int) (Math.random() * 201);
      if ((n[i] > 100) && (aux[i] == 0)) {
        aux[i] = n[i];
        skip = true;
      }
      if ((n[i] <= 100) && (aux[i] == 0)&&(!skip)) {
        aux[i] = n[i];
      }
    }
    // Mostrar Indice + Array
    System.out.println("ARRAY ORIGINAL");
    for (int i = 0; i < n.length; i++) {
      System.out.printf(" %-4d", i);
    }
    System.out.println();
    for (int i = 0; i < n.length; i++) {
      System.out.printf("%-5s", n[i]);
    }
    // Mostrar array ordenado
    System.out.println();
    System.out.print("ARRAY ORDENADO\n");
    for (int i = 0; i < n.length; i++) {
      System.out.printf(" %-4d", i);
    }
    System.out.println();
    for (int i = 0; i < n.length; i++) {
      System.out.printf("%-5s", aux[i]);
    }
  }
}
