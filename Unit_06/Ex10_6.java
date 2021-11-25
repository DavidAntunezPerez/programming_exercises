/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por
 * caracteres. El carácter con el que se pinta cada línea se elige de forma
 * aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben
 * tener una longitud aleatoria entre 1 y 40 caracteres.
 * 
 * @author David Antunez Perez
 */
public class Ex10_6 {
  public static void main(String[] args) {
    int figNum;
    String fig = "?";
    for (int f = 0; f < 10; f++) {
      int lon = (int) (Math.random() * 40 + 1);
      for (int i = 0; i <= lon; i++) {
        figNum = (int) (Math.random() * 6 + 1);
        switch (figNum) {
        case 1:
          fig = "*";
          break;
        case 2:
          fig = "-";
          break;
        case 3:
          fig = "=";
          break;
        case 4:
          fig = ".";
          break;
        case 5:
          fig = "|";
          break;
        case 6:
          fig = "@";
          break;
        }
        System.out.print(fig);
      }
      System.out.print("\n");
    }
  }
}
