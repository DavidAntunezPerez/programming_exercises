/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
 * jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
 * introduce una opción incorrecta, el programa deberá mostrar un mensaje de
 * error.
 * 
 * @author David Antunez Perez
 */

public class Ex27_6 {
  public static void main(String[] args) {
    int ansnum = 0;
    System.out.println("PIEDRA PAPEL TIJERA");
    System.out.println("-------------------");
    do {
      System.out.print("Turno del jugador (Piedra , Papel , Tijeras): ");
      String ans = System.console().readLine();
      switch (ans) {
        case "Piedra":
        case "piedra":
        case "PIEDRA":
          ansnum = 1;
          break;
        case "Papel":
        case "papel":
        case "PAPEL":
          ansnum = 2;
          break;
        case "Tijeras":
        case "tijeras":
        case "TIJERAS":
        case "tijera":
        case "Tijera":
        case "TIJERA":
          ansnum = 3;
          break;
        default:
          System.out.print("ERROR. Por favor, ingrese un valor válido.\n");
      }
    } while (ansnum == 0);

  }
}
