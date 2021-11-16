/**
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
 * El programa pedirá la altura. El palo horizontal de la L tendrá una longitud
 * de la mitad (división entera entre 2) de la altura más uno.
 * 
 * @author David Antunez Perez
 */
public class Ex31_5 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura de la L: ");
    int h = Integer.parseInt(System.console().readLine());
    String c = "*";
    for(int i = h; i > 1; i--){
      System.out.printf(c+ " \n");
    }
    for(int i = (h/2)+1;i > 0;i--){
    System.out.printf(c);
  }
  }
}
