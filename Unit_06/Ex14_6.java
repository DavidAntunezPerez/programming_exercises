/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número entre
 * 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor que
 * el que te acaba de decir.
 * 
 * @author David Antunez Perez
 * 
 */
public class Ex14_6 {
  public static void main(String[] args) {
    System.out.print("PIENSA UN NÚMERO DEL 0 AL 100\n");
    System.out.print("Una vez pensado, este programa intentará adivar el número\n");
    int cont = 5;
    boolean correct = false;
    int range = 100;
    int n = (int) (Math.random());
    int add = 0;
    do {
      n = (int) (Math.random() * range + add);
      System.out.print("¿Es tu número el " + n + "? (s/n) ");
      String ans = System.console().readLine();
      if ("s".equals(ans)) {
        correct = true;
      } else {
        cont--;
        if (cont > 0) {
          System.out.print("\nQuedan " + cont + " intentos.\n");
          System.out.print("¿Es el número mayor o menor que " + n + "? (mayor/menor) ");
          String ans2 = System.console().readLine();
          if ("mayor".equals(ans2)) {
            range = 100 - n;
            add = n;
          } else if ("menor".equals(ans2)) {
            range = (100 + n) - 101;
          }
        }
      }
    } while ((!correct) && (cont > 0));
  }
}
