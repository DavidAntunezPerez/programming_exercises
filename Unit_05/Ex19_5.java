/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se
 * debe pedir por teclado
 * 
 * @author David Antunez Perez
 */
public class Ex19_5 {
  public static void main(String[] args) {
    System.out.print("Indica la altura de la pirámide: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Indica el carácter que quieres que lleve la pirámide: ");
    String ch = System.console().readLine();
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
      }
      System.out.println();
      floor++;
      spa--;
      lenght += 2;
    }
  }
}
