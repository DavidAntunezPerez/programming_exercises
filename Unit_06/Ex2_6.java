/**
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A
 * (que sería el 1). Para convertir un número en una cadena de caracteres
 * podemos usar String.valueOf(n).
 * 
 * 
 * @author David Antunez Perez
 */

public class Ex2_6 {
  public static void main(String[] args) {
    String number = "?";
    int n = (int) (Math.random() * 13 + 2);
    switch (n) {
    case 11:
      number = "J";
      break;
    case 12:
      number = "Q";
      break;
    case 13:
      number = "K";
      break;
    case 14:
      number = "A";
    }
    String palo = "?";
    int p = (int) (Math.random() * 4 + 1);
    switch (p) {
    case 1:
      palo = "picas";
      break;
    case 2:
      palo = "corazones";
      break;
    case 3:
      palo = "diamantes";
      break;
    case 4:
      palo = "tréboles";
      break;
    }
    if (n < 11) {
      System.out.print("La carta obtenida es el " + n + " de " + palo);
    } else if (n >= 11) {
      System.out.print("La carta obtenida es el " + number + " de " + palo);
    }
  }
}
