/**
 * @author David Antunez Perez
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
public class Ex7_5 {
    public static void main(String[] args) {
        int comb; // PIN ingresado en la caja fuerte
        int cont = 0; // contador de intentos de la caja fuerte
        do {
            System.out.print("Por favor, ingrese el PIN para abrir la caja fuerte: ");
            comb = Integer.parseInt(System.console().readLine());
            if (comb == 2744){
                System.out.println("La caja fuerte se ha abierto exitosamente.");
                cont = 5;
            }
            else{
                System.out.println("Lo siento, el PIN no es el correcto.");
                cont++; 
                int resting = 4 - cont; // intentos restantes
                System.out.println("Quedan "+resting+" intentos.");
            }
        }while (cont < 4 );
    }
}
