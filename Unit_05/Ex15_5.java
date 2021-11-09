/**
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. P
 * @author David Antunez Perez
 */
public class Ex15_5 {
    public static void main(String[] args) {
        System.out.print("Escribe una base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Escribe un exponente: ");
        int exp = Integer.parseInt(System.console().readLine());
        for (int n = base;exp > 0 ;exp--){
            System.out.print(base + "^"+exp+" ");
        }
    }
}
