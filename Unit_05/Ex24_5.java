/**
 * Escribe un programa que lea un número n e imprima una pirámide de números con
 * n filas.
 * 
 * @author David Antunez Perez
 */
public class Ex24_5 {
  public static void main(String[] args) {
    System.out.print("Indica la altura de la pirámide: ");
    int h = Integer.parseInt(System.console().readLine());
    int ch = 1;
    int floor = 1;
    int lenght = 1;
    int spa = h - 1;
    while (floor <= h) {
      // espacios de la pirámide
      for (int i = 1; i <= spa; i++) {
        System.out.print(" ");
      }
      // carácteres de la pirámide
      for (int i = 1; i <= lenght; i++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
      floor++;
      spa--;
      lenght += 2;
    }
  }
}
