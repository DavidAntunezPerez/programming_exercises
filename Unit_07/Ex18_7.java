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
    for (int i = 0; i < n.length; i++) {
      n[i] = (int) (Math.random() * 201);
      if (n[i] <= 100) {
        if (aux[0] == 0) {
          aux[0] = n[i];
        } else if (aux[2] == 0) {
          aux[2] = n[i];
        } else if (aux[4] == 0) {
          aux[4] = n[i];
        } else if (aux[6] == 0) {
          aux[6] = n[i];
        } else if (aux[8] == 0) {
          aux[8] = n[i];
        }
      }
      if (n[i] > 100) {
        if (aux[1] == 0) {
          aux[1] = n[i];
        } else if (aux[3] == 0) {
          aux[3] = n[i];
        } else if (aux[5] == 0) {
          aux[5] = n[i];
        } else if (aux[7] == 0) {
          aux[7] = n[i];
        } else if (aux[9] == 0) {
          aux[9] = n[i];
        }
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
