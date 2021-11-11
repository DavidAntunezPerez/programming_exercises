/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo
 * 
 * @author David Antunez Perez
 */
public class Ex21_5 {
  public static void main(String[] args) {
    double i = 1;
    double cont = 0; // Número de números introducidos.
    
    while(i > 0){
        System.out.print("Escriba un número: ");
        i = Double.parseDouble(System.console().readLine());
        if (i > 0){
                result += i;
                cont++;
            System.out.println("(Para finalizar la introducción de datos escriba un número negativo)");
        }
      
    }
  }
}
