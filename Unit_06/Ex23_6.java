/**
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y
 * 8.
 * Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 * 
 * @author David Antunez Perez
 */
public class Ex23_6 {
  public static void main(String[] args) {
    int n;
    String result ="";
    for (int i = 0; i < 5; i++) {
      n = (int) (Math.random() * 6 + 1);
      switch (n) {
        case 1:
          result = "As";
          break;
        case 2:
          result = "K";
          break;
        case 3:
          result = "Q";
          break;
        case 4:
          result = "J";
          break;
        case 5:
          result = "7";
          break;
        case 6:
          result = "8";
          break;
      }
      System.out.print(result + " ");
    }
  }
}
