/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la
 * baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as
 * 
 * @author David Antunez Perez
 */
public class Ex3_6 {
  public static void main(String[] args) {
    String number = "?";
    int n = (int) (Math.random() * 10 + 2);
    switch (n) {
    case 7:
      number = "sota";
      break;
    case 8:
      number = "caballo";
      break;
    case 9:
      number = "rey";
      break;
    case 10:
      number = "as";
    }
    String palo = "?";
    int p = (int) (Math.random() * 4 + 1);
    switch (p) {
    case 1:
      palo = "oros";
      break;
    case 2:
      palo = "bastos";
      break;
    case 3:
      palo = "espadas";
      break;
    case 4:
      palo = "copas";
      break;
    }
    if (n < 7) {
      System.out.print("La carta obtenida es el " + n + " de " + palo);
    } else if (n >= 7) {
      System.out.print("La carta obtenida es el " + number + " de " + palo);
    }
  }
}
