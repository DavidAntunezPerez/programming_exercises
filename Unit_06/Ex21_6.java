/**
 * Realiza un programa que genere una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 * 
 * @author David Antunez Perez
 */
public class Ex21_6 {
  public static void main(String[] args) {
    // inicializamos las variables
    int c = 0;
    String coinResult = "";
    String coinName = "";
    // mostramos resultado por pantalla
    for (int i = 1; i <= 5; i++) {
      c = (int) (Math.random() * 2 + 1);
      switch (c) {
        case 1:
          coinName = "cara";
          break;
        case 2:
          coinName = "cruz";
          break;
      }
      switch (i) {
        case 1:
          coinResult = "2 cent";
          break;
        case 2:
          coinResult = "20 cent";
          break;
        case 3:
          coinResult = "50 cent";
          break;
        case 4:
          coinResult = "1 eur";
          break;
        case 5:
          coinResult = "2 eur";
          break;
      }
      System.out.println(coinResult + " - " + coinName);
    }
  }
}
