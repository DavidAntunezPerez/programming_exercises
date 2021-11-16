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
    String day1; // día en letras
    int dayNum; // día en numérico
    int hour1;
    do {
      System.out.print("Dia: ");
      day1 = System.console().readLine();
      switch(day1){
        case "Lunes":
        case "lunes":
        case "LUNES":
        case "1":
        dayNum = 1;
        break;
        case:"martes":
        case "MARTES":
        case "Martes":
        case "2":
        dayNum = 2;
        break;
        case "miercoles":
        case "Miercoles":
        case "MIERCOLES":
        case "Miércoles":
        case "MIÉRCOLES":
        case "miércoles":
        case "3":
        dayNum = 3;
        break;
      }
      System.out.print("Hora: ");
      hour1 = Integer.parseInt(System.console().readLine());
    } while (hour1 > 0);

  }
}
