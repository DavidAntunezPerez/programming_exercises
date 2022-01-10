/**
 * Escribe un programa que rellene un array de 100 elementos con números
 * enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A
 * continuación el programa mostrará el array y preguntará si el usuario quiere
 * destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos
 * 
 * @authr DavidAntunezPerez
 */
public class Ex13_7 {
  public static void main(String[] args) {
    int[] n = new int[100];
    int max = 0;
    int min = 500;
    for (int i = 0; i < n.length; i++) {
      n[i] = (int) (Math.random() * 500);
      System.out.print(n[i] + "  ");
      if (n[i] > max) {
        max = n[i];
      }
      if (n[i] < min) {
        min = n[i];
      }
    }
    System.out.println();
    int dest;
    do {
      System.out.print("¿Qué quieres destacar? (1 - max ; 2 - min) : ");
      dest = Integer.parseInt(System.console().readLine());
    } while ((dest < 1) || (dest > 2));
    System.out.println();
    switch (dest) {
      case 1:
        for (int i = 0; i < n.length; i++) {
          if (n[i] == min) {
            System.out.print("***" + n[i] + "***" + "  ");
          } else {
            System.out.print(n[i] + "  ");
          }
        }
        break;
      case 2:
        for (int i = 0; i < n.length; i++) {
          if (n[i] == max) {
            System.out.print("***" + n[i] + "***" + "  ");
          } else {
            System.out.print(n[i] + "  ");
          }
        }
        break;
    }
  }
}
