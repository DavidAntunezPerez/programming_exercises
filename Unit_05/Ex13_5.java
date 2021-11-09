/**
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * @author David Antunez Perez
 */

public class Ex13_5 {
    public static void main(String[] args) {
        int pos = 0 ; // contador de cuantos son positivos
        int neg = 0; // contador de cuantos son negativos
        for (int n = 10;n > 0 ;n-- ){
            double num;
            System.out.println("Introduzca un número: ");
            num = Double.parseDouble(System.console().readLine());
            if( num > 0){
                System.out.println(num + " es positivo.");
                pos++;
            }
            else if ( num < 0){
                System.out.println(num + " es negativo.");
                neg++;
            }
            else {
                System.out.println(num + " es neutro.");
            }
        }
        System.out.println("En total, hay "+pos+" nº positivos y "+neg+" nº negativos.");
  }
}
