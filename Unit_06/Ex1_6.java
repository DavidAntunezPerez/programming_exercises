/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author David Antunez Perez
 */
public class Ex1_6 {
  public static void main(String[] args) {
    int add = 0;
    for (int i = 0; i < 3; i++) {
      System.out.print((int) (Math.random() * 6) + " ");
    }
  }
}
