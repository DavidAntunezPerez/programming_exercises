/**
 * @author David Antunez Perez
 *         Realiza un generador de melodía con las siguientes condiciones:
 *         a) Las notas deben estar generadas al azar. Las 7 notas son do, re,
 *         mi, fa, sol,
 *         la y si.
 *         b) Una melodía está formada por un número aleatorio de notas mayor o
 *         igual
 *         a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 *         c) Cada grupo de 4 notas será un compás y estará separado del
 *         siguiente
 *         compás mediante la barra vertical “|” (Alt + 1). El final de la
 *         melodía se marca
 *         con dos barras.
 *         d) La última nota de la melodía debe coincidir con la primera.
 */
public class Ex15_6 {
  public static void main(String[] args) {
    // Creamos variables para cada nota de la melodía
    String not1 = "do";
    String not2 = "re";
    String not3 = "mi";
    String not4 = "fa";
    String not5 = "sol";
    String not6 = "la";
    String not7 = "si";
    // Creamos variables para cada nota escrita por grupo
    int randomNot = (int) (Math.random() * 7 + 1);
    // Creamos un bucle aleatorio para que repita cada grupo de notas
    int n = (int) (Math.random() * 5); // El rango son los 5 primeros múltiplos de 4 (más de esto sería demasiado)
    for (int i = n * 4; i > 0; i--) {
      for (int j = 4; j > 0; j--) {
        if (j < 4) {
          System.out.print(" ");
        }
        switch (randomNot) {
          case 1:
            System.out.print(not1 + " ");
            randomNot = (int) (Math.random() * 7 + 1);
            break;
          case 2:
            System.out.print(not2 + " ");
            randomNot = (int) (Math.random() * 7 + 1);
            break;
          case 3:
            System.out.print(not3 + " ");
            randomNot = (int) (Math.random() * 7 + 1);
            break;
          case 4:
            System.out.print(not4 + " ");
            randomNot = (int) (Math.random() * 7 + 1);
            break;
          case 5:
            System.out.print(not5 + " ");
            randomNot = (int) (Math.random() * 7 + 1);
            break;
          case 6:
            System.out.print(not6 + " ");
            randomNot = (int) (Math.random() * 7 + 1);
            break;
          case 7:
            System.out.print(not7 + " ");
            randomNot = (int) (Math.random() * 7 + 1);
            break;
        }
      }
      if (i > 1) {
        System.out.print(" | ");
      }
    }
    System.out.print("||");
  }
}
