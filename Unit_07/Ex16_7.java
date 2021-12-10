/**
 * Escribe un programa que rellene un array de 20 elementos con números enteros
 * aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
 * programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
 * array
 * escribiendo los números que se quieren resaltar entre corchetes.
 * 
 * @author David Antunez Perez
 */
public class Ex16_7 {
  public static void main(String[] args) {
    // Declaramos el array
    int[] n = new int[20];
    // Aleatorizamos el array
    for (int i = 0; i < n.length; i++) {
      n[i] = (int) (Math.random() * 400);
    }
    // Mostramos el array
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
    // Pregunta al usuario
    System.out.println();
    int res;
    do {
      System.out.print("¿Quieres resaltar multiplos de 5 o de 7? (5 / 7): ");
      res = Integer.parseInt(System.console().readLine());
      if ((res != 5) && (res != 7)) {
        System.out.println("Escribe un valor válido (5 o 7).");
      }
    } while ((res != 5) && (res != 7));
    // Remarcar según lo elegido
    if (res == 5) {
      for (int i = 0; i < n.length; i++) {
        if (n[i] % 5 == 0) {
          System.out.print("[" + n[i] + "]" + " ");
        } else {
          System.out.print(n[i] + " ");
        }
      }
    } else if (res == 7) {

      for (int i = 0; i < n.length; i++) {
        if (n[i] % 7 == 0) {
          System.out.print("[" + n[i] + "]" + " ");
        } else {
          System.out.print(n[i] + " ");
        }
      }
    }
  }
}
