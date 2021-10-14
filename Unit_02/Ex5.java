/**
 *@author David Antúnez Pérez
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 */


public class Ex5 {
  
  public static void main (String[] args) {
    double numPesetas = 1;
    double numEuros = numPesetas * 0.006;
    System.out.println( numPesetas + " pesetas son " + numEuros + " euros" );
  }
}
