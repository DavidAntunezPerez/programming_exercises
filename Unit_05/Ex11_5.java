/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * @author David Antúnez Pérez
 */
public class Ex11_5 {
    public static void main(String[] args) {
        int n = 0; // contador de números consecutivos
        int i; // número ingresado
        int sq; // cuadrado del número
        int cb; // cubo del número
        System.out.print("Introduce un número: ");
            i = Integer.parseInt(System.console().readLine());
        while(n <= 5){
            
            sq = i * i;
            cb = i * i * i;
            System.out.println("NÚMERO : "+i+"| CUADRADO: "+sq+"| CUBO: "+cb);
            i++;
            n++;
            
        }
    }
}
