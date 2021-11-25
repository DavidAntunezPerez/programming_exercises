/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 * 
 * @author David Antunez Perez
 */
public class Ex7_6 {
  public static void main(String[] args) {
    String result = "?  ";
    int n;
    for (int i = 0; i > 14; i++) {
      n = (int) (Math.random() * 3);
      switch (n) {
      case 0:
        result = "1  ";
        break;
      case 1:
        result = " X ";
        break;
      case 2:
        result = "  2";
        break;
      }
      System.out.println("|" + result + "|" + result + "|" + result + "|");
    }
  }
}
