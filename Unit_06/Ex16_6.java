/**
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje
 * “Lo siento,has perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje
 * “Bien,ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar
 * “Enhorabuena, ha ganado 10 monedas”.
 * 
 * @author David Antunez Perez
 */
public class Ex16_6 {
  public static void main(String[] args) throws Exception {
    // Inicio del juego
    System.out.print("PRESIONE ENTER PARA COMENZAR A JUGAR: ");
    System.console().readLine();
    System.out.print("Girando las ruedas");
    for (int i = 0; i < 7; i++) {
      System.out.printf(".");
      Thread.sleep(100 * i);
    }
    // Declaramos las variables necesarias con sus correspondientes variables String
    int fig1 = (int) (Math.random() * 5 + 1);
    int fig2 = (int) (Math.random() * 5 + 1);
    int fig3 = (int) (Math.random() * 5 + 1);
    String f1 = "";
    String f2 = "";
    String f3 = "";
    switch (fig1) {
      case 1:
        f1 = "corazón";
        break;
      case 2:
        f1 = "diamante";
        break;
      case 3:
        f1 = "herradura";
        break;
      case 4:
        f1 = "campana";
        break;
      case 5:
        f1 = "limón";
        break;
    }
    switch (fig2) {
      case 1:
        f2 = "corazón";
        break;
      case 2:
        f2 = "diamante";
        break;
      case 3:
        f2 = "herradura";
        break;
      case 4:
        f2 = "campana";
        break;
      case 5:
        f2 = "limón";
        break;
    }
    switch (fig3) {
      case 1:
        f3 = "corazón";
        break;
      case 2:
        f3 = "diamante";
        break;
      case 3:
        f3 = "herradura";
        break;
      case 4:
        f3 = "campana";
        break;
      case 5:
        f3 = "limón";
        break;
    }
    System.out.print("\nEl resultado obtenido es: ");
    System.out.print(f1 + " " + f2 + " " + f3);
    if ((f1 == f2) && (f1 == f3) && (f2 == f3)) {
      System.out.print("\nENHORABUENA, has ganado 10 monedas.");
    } else if ((f1 == f2) || (f1 == f3) || (f2 == f3)) {
      System.out.print("\nBien, ha recuperado su moneda.");
    } else if ((f1 != f2) && (f1 != f3) && (f2 != f3)) {
      System.out.println("\nLo siento, ha perdido.");
    }
  }
}
