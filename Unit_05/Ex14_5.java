/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 * @author David Antunez Perez
 */
public class Ex14_5 {
    public static void main(String[] args) {
        System.out.print("Escribe una base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Escribe un exponente: ");
        int exp = Integer.parseInt(System.console().readLine());
        for (int n = base;exp > 1 ;exp--){
            base = base * n;
        }
        System.out.println("El resultado es: "+base);
    }
}
