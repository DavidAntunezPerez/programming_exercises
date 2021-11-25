/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 * 
 * @author David Antunez Perez
 */
public class Ex7_6 {
  public static void main(String[] args) {
    String result1 = "?  ";
    String result2 = "?  ";
    String result3 = "?  ";
    int n1;
    int n2;
    int n3;
    for (int i = 0; i < 14; i++) {
      n1 = (int) (Math.random() * 3);
      switch (n1) {
      case 0:
        result1 = "1  ";
        break;
      case 1:
        result1 = " X ";
        break;
      case 2:
        result1 = "  2";
        break;
      }
      n2 = (int) (Math.random() * 3);
      switch (n2) {
      case 0:
        result2 = "1  ";
        break;
      case 1:
        result2 = " X ";
        break;
      case 2:
        result2 = "  2";
        break;
      }
      n3 = (int) (Math.random() * 3);
      switch (n3) {
      case 0:
        result3 = "1  ";
        break;
      case 1:
        result3 = " X ";
        break;
      case 2:
        result3 = "  2";
        break;
      }
      System.out.println("|" + result1 + "|" + result2 + "|" + result3 + "|");
    }
    String local = "?";
    String vis = "?";
    int plen15loc = (int) (Math.random() * 3);
    switch (plen15loc) {
    case 0:
      local = "1";
      break;
    case 1:
      local = "2";
      break;
    case 2:
      local = "M";
      break;
    }
    int plen15vis = (int) (Math.random() * 3);
    switch (plen15vis) {
    case 0:
      vis = "1";
      break;
    case 1:
      vis = "2";
      break;
    case 2:
      vis = "M";
      break;
    }
    System.out.print("PLENO AL 15: \nLocal: " + local + " Visitante: " + vis);
  }
}
