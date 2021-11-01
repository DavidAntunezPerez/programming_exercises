/**
 * @author David Antunez Perez
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
 * incorrecta, el programa deberá mostrar un mensaje de error.
 */
public class Ex28 {
    public static void main(String[] args) {
        System.out.println("PIEDRA, PAPEL O TIJERAS");
        System.out.println("-----------------------");
        System.out.print("Turno del jugador 1 (Introduzca piedra, papel o tijeras): ");
            String turn1 = System.console().readLine();
         System.out.print("Turno del jugador 2 (Introduzca piedra, papel o tijeras): ");
            String turn2 = System.console().readLine();
        String result = "";
        switch (turn1){
            case "piedra":
            switch (turn2){
                case "piedra":
                result="Empate.";
                break;
                case "papel":
                result="Gana el jugador 2";
                break;
                case "tijeras":
                result="Gana el jugador 1";
                break;
                default:
                result = "ERROR, realiza un movimiento válido";

            }
            break;
            case "papel":
                switch (turn2){
                    case "piedra":
                    result="Gana el jugador 1";
                    break;
                    case "papel":
                    result="Empate";
                    break;
                    case "tijeras":
                    result="Gana el jugador 2";
                    break;
                    default:
                    result = "ERROR, realiza un movimiento válido";

                }
            break;
            case "tijeras":
                switch (turn2){
                    case "piedra":
                    result="Gana el jugador 2";
                    break;
                    case "papel":
                    result="Gana el jugador 1";
                    break;
                    case "tijeras":
                    result="Empate";
                    break;
                    default:
                    result = "ERROR, realiza un movimiento válido";
                }
            break;
            default:
            result = "ERROR, realiza un movimiento válido";

        }
        System.out.println(result);
    }
}
