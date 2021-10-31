/**
 * 
 * @author David Antúnez Pérez
 */


public class Ex11 {
  
  public static void main (String[] args) {
    System.out.println(" ¿CUÁNTOS SEGUNDOS QUEDAN PARA QUE SEA MEDIANOCHE?");
     System.out.println("--------------------------------------------------");
      String line;
      System.out.print(" Escriba la hora actual \n (Excluyendo los minutos y en formato 24 horas): ");
      line = System.console().readLine();
      int hours;
      hours = Integer.parseInt(line);
      String line2;
      System.out.print(" Escriba los minutos de la hora actual \n (Por ejemplo, si son las 22:36 escriba 36): ");
      line2 = System.console().readLine();
      int mins;
      mins = Integer.parseInt(line2);
      double result = 86400 - ((hours * 3600) + (mins * 60));
      if((result>0)&&(result< 86400)){
        System.out.println(" Si son las " + hours +":"+ mins +" , quedan " + result + " segundos para que sea medianoche");
        }
         else if(result == 86400){
          System.out.println(" Justo ahora es medianoche.");
        }
        else {
          System.out.println(" Este formato horario no es válido, ¡no pueden ser las "+ hours +":"+ mins +"! .Porfavor, escriba una hora válida siguiendo las instrucciones. ");
          }
      
  }
}

