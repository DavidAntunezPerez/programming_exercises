/**
 * @author David Antunez Perez
 * 
 *         Realiza una programa que calcule las horas transcurridas entre dos
 *         horas de dos días de la semana. No se tendrán en cuenta los minutos
 *         ni los segundos. El día de la semana se puede pedir como un número
 *         (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se debe
 *         comprobar que el usuario introduce los datos correctamente y que el
 *         segundo día es posterior al primero.
 */
public class Ex30_5 {
  public static void main(String[] args) {
    System.out.printf("Por favor, introduzca la primera hora.\n");
    System.out.print("Dia: ");
    String day = System.console().readLine();
    System.out.print("Hora: ");
    int hour = Integer.parseInt(System.console().readLine());
    
  }
}
