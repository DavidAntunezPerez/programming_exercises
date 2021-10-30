/**
 * @author David Antúnez Pérez
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 */
public class Ex22 {
    public static void main(String[] args) {
        System.out.print("Introduzca un día de la semana (de Lunes a Viernes) ");
        String day = System.console().readLine();
        System.out.print("Introduzca la hora (Excluyendo minutos) ");
        int hour = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca los minutos: ");
        int min = Integer.parseInt(System.console().readLine());
        int numDay;
        switch(day){
            case "Lunes" ,"LUNES","lunes":
                 numDay = 1;
            break;
            case "Martes", "martes", "MARTES":
                numDay = 2;
            break;
            case "Miercoles", "Miércoles", "MIERCOLES", "MIÉRCOLES", "miercoles", "miércoles":
                numDay = 3;
            break;
            case "Jueves", "jueves", "JUEVES":
                numDay = 4;
            break;
            case "viernes", "Viernes", "VIERNES":
                numDay = 5;
            break;
            default:
            System.out.println("Por favor, introduzca los datos correctamente.");
        }
 }
}