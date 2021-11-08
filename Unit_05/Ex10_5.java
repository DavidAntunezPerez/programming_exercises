/**
 * @author David Antunez Perez
 * Escribe un programa que calcule la media de un conjunto de números positivos
    introducidos por teclado. A priori, el programa no sabe cuántos números se
    introducirán. El usuario indicará que ha terminado de introducir los datos
    cuando meta un número negativo.
 */
public class Ex10_5 {
    public static void main(String[] args) {
        double i;
        double nIntr = 1; // Número de números introducidos.
        double result = 0;
        
        do{
            
            System.out.print("Escriba un número: ");
            i = Integer.parseInt(System.console().readLine());
            
            System.out.println("La media es " + ((result+i)/nIntr));
            result = i * nIntr;
            nIntr++;
            
            System.out.println("(Para finalizar el programa escriba un número negativo)");
        }while(i > 0);
        System.out.println("Programa finalizado con éxito.");
    }
}
