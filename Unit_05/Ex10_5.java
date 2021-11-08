/**
 * @author David Antunez Perez
 * Escribe un programa que calcule la media de un conjunto de números positivos
    introducidos por teclado. A priori, el programa no sabe cuántos números se
    introducirán. El usuario indicará que ha terminado de introducir los datos
    cuando meta un número negativo.
 */
public class Ex10_5 {
    public static void main(String[] args) {
        double i = 0;
        double nIntr = 1; // Número de números introducidos.
        
        do{
            double i2 = i;
            System.out.println("Escriba un número: ");
            i = Integer.parseInt(System.console().readLine());
            i = (i2+i) / nIntr;
            System.out.println("La media es " + i);
            nIntr++;
            System.out.println("(Para finalizar el programa escriba un número negativo)");
        }while(i > 0);
        System.out.println("Programa finalizado con éxito.");
    }
}
