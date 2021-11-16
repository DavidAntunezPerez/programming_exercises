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

    String day1; // día en letras
    int dayNum = 0; // día en numérico
    int hour1; // primera hora
    int dayNum2 = 0; // dia2 en numérico
    String day2; // dia2
    int hour2; // hora2
    //recoger los datos de horas y días
    do {
      System.out.printf("Por favor, introduzca la primera hora.\n");
      do {
        System.out.print("Dia: ");
        day1 = System.console().readLine();
        switch (day1) {
        case "Lunes":
        case "lunes":
        case "LUNES":
        case "1":
          dayNum = 1;
          break;
        case "martes":
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
        case "Jueves":
        case "jueves":
        case "JUEVES":
        case "4":
          dayNum = 4;
          break;
        case "Viernes":
        case "viernes":
        case "VIERNES":
        case "5":
          dayNum = 5;
        case "Sabado":
        case "sabado":
        case "SABADO":
        case "Sábado":
        case "sábado":
        case "SÁBADO":
        case "6":
          dayNum = 6;
          break;
        case "Domingo":
        case "domingo":
        case "DOMINGO":
        case "7":
          dayNum = 7;
          break;
        default:
          System.out.println("Por favor, introduce un día de la semana válido.");
          dayNum = 0;

        }
        System.out.print("Hora: ");
        hour1 = Integer.parseInt(System.console().readLine());
        if ((hour1 < 0) || (hour1 > 24)) {
          System.out.printf("ERROR. Introduzca una hora válida entre 0 y 24.\n");
        }
      } while ((hour1 < 0) || (dayNum == 0) || (hour1 > 24));
      System.out.printf("Por favor, introduzca la segunda hora.\n");
      do {
        System.out.print("Dia: ");
        day2 = System.console().readLine();
        switch (day2) {
        case "Lunes":
        case "lunes":
        case "LUNES":
        case "1":
          dayNum2 = 1;
          break;
        case "martes":
        case "MARTES":
        case "Martes":
        case "2":
          dayNum2 = 2;
          break;
        case "miercoles":
        case "Miercoles":
        case "MIERCOLES":
        case "Miércoles":
        case "MIÉRCOLES":
        case "miércoles":
        case "3":
          dayNum2 = 3;
          break;
        case "Jueves":
        case "jueves":
        case "JUEVES":
        case "4":
          dayNum2 = 4;
          break;
        case "Viernes":
        case "viernes":
        case "VIERNES":
        case "5":
          dayNum2 = 5;
        case "Sabado":
        case "sabado":
        case "SABADO":
        case "Sábado":
        case "sábado":
        case "SÁBADO":
        case "6":
          dayNum2 = 6;
          break;
        case "Domingo":
        case "domingo":
        case "DOMINGO":
        case "7":
          dayNum2 = 7;
          break;
        default:
          System.out.println("Por favor, introduce un día de la semana válido.");
          dayNum = 0;
        }
        System.out.print("Hora: ");
        hour2 = Integer.parseInt(System.console().readLine());
        if ((hour2 < 0) || (hour2 > 24)) {
          System.out.printf("ERROR. Introduzca una hora válida entre 0 y 24.\n");
        }
      } while ((hour2 < 0) || (dayNum2 == 0) || (hour2 > 24));
      if ((dayNum > dayNum2) || ((dayNum == dayNum2) && (hour1 > hour2))) {
        System.out.print("ERROR. El primer día tiene que ser anterior al segundo día.\n");
      }
    } while ((dayNum > dayNum2) || ((dayNum == dayNum2) && (hour1 > hour2)));
    //calcular horas transcurridas
    
    // mostrar resultado en pantalla
    System.out
        .printf("Entre las " + hour1 + ":00h y del " + day1 + " y las " + hour2 + ":00 del " + day2 + " hay hora/s.");
  }
}
