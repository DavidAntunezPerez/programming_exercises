/**
 * @author David Antúnez Pérez
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 */
public class Ex22_4 {
    public static void main(String[] args) {
        System.out.print("Introduzca un día de la semana (de Lunes a Viernes) ");
        String day = System.console().readLine();
        System.out.print("Introduzca la hora (Excluyendo minutos) ");
        int hour = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca los minutos: ");
        int min = Integer.parseInt(System.console().readLine());
        int dayNum = 0;
        switch(day){
            case "Lunes" ,"LUNES","lunes":
                 dayNum = 0;
            break;
            case "Martes", "martes", "MARTES":
                 dayNum = 1;
            break;
            case "Miercoles", "Miércoles", "MIERCOLES", "MIÉRCOLES", "miercoles", "miércoles":
                dayNum = 2;
            break;
            case "Jueves", "jueves", "JUEVES":
                dayNum = 3;
            break;
            case "viernes", "Viernes", "VIERNES":
                dayNum = 4;
            break;
            default:
            System.out.println("Por favor, introduzca los datos correctamente.");
        }
        int hourSec = hour * 3600;
        int minSec= min * 60;
        int result = 399600- (86400 * dayNum + (hourSec + minSec));
        if(result>=0){
            System.out.println("Quedan "+ result + " segundos para que sea Viernes a las 15:00.");
        }
        else{
            System.out.println("Por favor, introduzca un valor válido anterior al Viernes a las 15:00.");
        }
        
 }
}