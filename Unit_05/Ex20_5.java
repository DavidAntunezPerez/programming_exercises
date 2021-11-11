/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide
 * hueca.
 * 
 * @author David Antunez Perez
 */
public class Ex20_5 {
  public static void main(String[] args) {
    System.out.print("Indica la altura de la pirámide: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Indica el carácter que quieres que lleve la pirámide: ");
    String ch = System.console().readLine();
    int floor = 1;
    int spa = h - 1;
    int midSpa = 0; // espacios del medio
    while (floor <= h - 1) {
      // espacios de la pirámide
      for (int i = 1; i <= spa; i++) {
        System.out.print(" ");
      }
      System.out.print(ch);
      // espacios internos
      for (int i = 2; i <= midSpa; i++) {
        System.out.print(" ");
      }
      if (floor > 1) {
        System.out.print(ch);

      }
      // for (int i = 1; i <= spa; i++) { ((POR FUERA DE LA PIRÁMIDE RELLENAR ALL))
      // System.out.print(ch);
      // }
      System.out.println();
      floor++;
      spa--;
      midSpa += 2;
    }
    if (h > 1) {
      for (int i = 2; i <= h * 2; i++) {
        System.out.print(ch);
      }
    }
  }
}
