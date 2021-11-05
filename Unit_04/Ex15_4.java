/**
 * @author David Antúnez Pérez
 */


public class Ex15_4 {
  
  public static void main (String[] args) {
    System.out.println("CREA TU PIRÁMIDE A MEDIDA");
    System.out.println("--------------------------");
    System.out.println("- Carácter que rellena la pirámide");
    String ch;
      System.out.print(" Escriba el carácter que quieres que rellene la pirámide: ");
      ch = System.console().readLine();
      System.out.println("- Dirección de la pirámide");
      System.out.printf(" 1) Arriba \n 2) Abajo \n 3) Izquierda \n 4) Derecha \n");
      String line;
      System.out.print(" Seleccione una opción: ");
      line = System.console().readLine();
      int dir;
      dir = Integer.parseInt(line);
      System.out.println("Generando pirámide...");
      System.out.println(" ");
          if (dir == 1){
            System.out.println("          "+ch);
            System.out.println("         "+ch+ch+ch);
            System.out.println("        "+ch+ch+ch+ch+ch);
            System.out.println("       "+ch+ch+ch+ch+ch+ch+ch);
            System.out.println("      "+ch+ch+ch+ch+ch+ch+ch+ch+ch);
            System.out.println("     "+ch+ch+ch+ch+ch+ch+ch+ch+ch+ch+ch);
            }
          else if (dir == 2){
            System.out.println("     "+ch+ch+ch+ch+ch+ch+ch+ch+ch+ch+ch);
            System.out.println("      "+ch+ch+ch+ch+ch+ch+ch+ch+ch);
            System.out.println("       "+ch+ch+ch+ch+ch+ch+ch);
            System.out.println("        "+ch+ch+ch+ch+ch);
            System.out.println("         "+ch+ch+ch);
            System.out.println("          "+ch);
          }
          else if (dir == 3){
            System.out.println("     "+ch);
            System.out.println("     "+ch+ch);
            System.out.println("     "+ch+ch+ch);
            System.out.println("     "+ch+ch+ch+ch);
            System.out.println("     "+ch+ch+ch);
            System.out.println("     "+ch+ch);
            System.out.println("     "+ch);
            }
          else {
            System.out.println("        "+ch);
            System.out.println("       "+ch+ch);
            System.out.println("      "+ch+ch+ch);
            System.out.println("     "+ch+ch+ch+ch);
            System.out.println("      "+ch+ch+ch);
            System.out.println("       "+ch+ch);
            System.out.println("        "+ch);
          }
  }
}

