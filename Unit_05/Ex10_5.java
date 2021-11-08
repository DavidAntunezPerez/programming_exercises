/**
 * @author David Antunez Perez
 *  Escribe un programa que calcule la media de un conjunto de números positivos
    introducidos por teclado. A priori, el programa no sabe cuántos números se
    introducirán. El usuario indicará que ha terminado de introducir los datos
    cuando meta un número negativo.
 */
public class Ex10_5 {
    public static void main(String[] args) {
        double i = 1;
        double nIntr = 0; // Número de números introducidos.
        double result = 0;
        
        while(i > 0){
            System.out.print("Escriba un número: ");
            i = Double.parseDouble(System.console().readLine());
            if (i > 0){
                    result += i;
                    nIntr++;
                System.out.println("(Para finalizar la introducción de datos escriba un número negativo)");
            }
        }

        System.out.println("La media es " + (result / nIntr));
        System.out.println("Programa finalizado con éxito.");
    }
}
