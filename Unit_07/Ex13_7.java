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
    for (int i = 0; i < n.length; i++) {
      n[i] = (int) (Math.random() * 500);
      System.out.print(n[i] + "  ");
    }
    System.out.println();
    System.out.print("¿Qué quieres destacar? (1 - max ; 2 - min) : ");
    int dest = Integer.parseInt(System.console().readLine());
  }
}
