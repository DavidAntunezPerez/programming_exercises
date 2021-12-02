/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
 * jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
 * introduce una opción incorrecta, el programa deberá mostrar un mensaje de
 * error.
 * 
 * @author David Antunez Perez
 */

public class Ex27_6 {
  public static void main(String[] args) throws Exception {
    int ansNum = 0;
    String ansName = "";
    System.out.println("PIEDRA PAPEL TIJERA");
    System.out.println("-------------------");
    do {
      System.out.print("Turno del jugador (Piedra , Papel , Tijeras): ");
      String ans = System.console().readLine();
      switch (ans) {
        case "Piedra":
        case "piedra":
        case "PIEDRA":
          ansNum = 1;
          ansName = "piedra";
          break;
        case "Papel":
        case "papel":
        case "PAPEL":
          ansNum = 2;
          ansName = "papel";
          break;
        case "Tijeras":
        case "tijeras":
        case "TIJERAS":
        case "tijera":
        case "Tijera":
        case "TIJERA":
          ansNum = 3;
          ansName = "tijeras";
          break;
        default:
          System.out.print("ERROR. Por favor, ingrese un valor válido.\n");
      }
    } while (ansNum == 0);
    System.out.println();
    System.out.print("Cargando respuesta de la máquina");
    for (int i = 0; i < 7; i++) {
      System.out.printf(".");
      Thread.sleep(200 * i);
    }
    System.out.println();
    int machNum = (int) (Math.random() * 3 + 1);
    String machName = "";
    switch (machNum) {
      case 1: // caso de que le salga piedra
        machName = "piedra";
        System.out.println("Has escogido "+ ansName + " y la máquina ha escogido "+ machName);
        // planteamos las posibilidades
        if (machNum == ansNum){
          System.out.println("El resultado es EMPATE. ");
          }
        else if (ansNum == 2){
          System.out.println("El resultado es GANA EL JUGADOR. ");
          }
          else {  
            System.out.println("El resultado es GANA LA MÁQUINA. ");
          }
        break;
      case 2: // caso de que salga papel
        machName = "papel";
        System.out.println("Has escogido "+ ansName + " y la máquina ha escogido "+ machName);
        // planteamos las posibilidades
        if (machNum == ansNum){
          System.out.println("El resultado es EMPATE. ");
          }
          else if (ansNum == 3){
            System.out.println("El resultado es GANA EL JUGADOR. ");
            }
            else {  
              System.out.println("El resultado es GANA LA MÁQUINA. ");
            }
        break;
      case 3: // caso de que salga tijeras
        machName = "tijeras";
        System.out.println("Has escogido "+ ansName + " y la máquina ha escogido "+ machName);
        // planteamos las posibilidades
        if (machNum == ansNum){
          
          System.out.println("El resultado es EMPATE. ");
          }
          else if (ansNum == 1){
            System.out.println("El resultado es GANA EL JUGADOR. ");
            }
            else {  
              System.out.println("El resultado es GANA LA MÁQUINA. ");
            }
        break;
    }
  }
}
