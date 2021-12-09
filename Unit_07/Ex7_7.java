/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer
 * valor por el segundo en la lista generada anteriormente. Los números que se
 * han cambiado deben aparecer entrecomillados.
 * 
 * @author David Antunez Perez
 */
public class Ex7_7 {
  public static void main(String[] args) {
    int[] n = new int[100];
    for (int i = 0; i < 100; i++) {
      n[i] = (int) (Math.random() * 20);
      System.out.printf("%4d", n[i]);
    }
    System.out.println();
    System.out.print("Escribe un número que haya sido mostrado: ");
    int numChosen = Integer.parseInt(System.console().readLine());
    System.out.print("Escribe el número por el que quieras cambiarlo: ");
    int character = Integer.parseInt(System.console().readLine());
    for (int i = 0; i < 100; i++) {
      if (n[i] == numChosen) {
        n[i] = character;
      }
      if (n[i] == character) {
        System.out.printf(" \033[92m %4d", n[i]);
      } else {
        System.out.printf("\033[37m %4d", n[i]);
      }
    }
  }
}
