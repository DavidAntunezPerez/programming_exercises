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
    for (int i = 0; i <= 10; i++) {
      figNum = (int) (Math.random() * 6 + 1);
      switch (figNum) {
      case 1:
        System.out.print("*");
        break;
      case 2:
        System.out.print("-");
        break;
      case 3:
        System.out.print("=");
        break;
      case 4:
        System.out.print(".");
        break;
        case 5:
        System.out.print("|");
        break;
        case 6:
        System.out.print("@");
        break;
      }
    }
  }
}
