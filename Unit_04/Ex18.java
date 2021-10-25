/**
 * @author David Antúnez Pérez
 */


public class Ex18 {
  
  public static void main (String[] args) {
          System.out.print("INTRODUCE UN NÚMERO: ");
        String line;
        int cif;
        line = System.console().readLine();
        int num = Integer.parseInt(System.console().readLine());
    if(( num >= 100 ) && ( num < 1000 )) {
      cif = num / 100;
    }
    else if (( num >= 1000 ) && ( num < 10000 )) {
      cif = num / 1000;
    }
    else if ( num >= 10000 ) {
    cif = num / 10000;
    }
   
    System.out.println("La primera cifra del número es " + cif);
    
    
    }
  }


