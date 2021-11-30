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
    String coin = "";
    // mostramos resultado por pantalla
    c = (int) (Math.random() * 2 + 1);
    System.out.println("2 cents - " + coin);
    System.out.print("20 cents - " + coin);
    System.out.println("50 cents - " + coin);
    System.out.println("1 eur - " + coin);
    System.out.println(" 2 eur - " + coin);
  }
}
