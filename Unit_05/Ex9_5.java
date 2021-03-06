/** 
 * @author David Antúnez Pérez
 *  Realiza un programa que nos diga cuántos dígitos tiene un número introducido
    por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
    la salvedad de que el anterior estaba limitado a números de 5 dígitos como
    máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
    esta manera, la única limitación en el número de dígitos la establece el tipo de
    dato que se utilice (int o long).
*/
public class Ex9_5 {
    public static void main(String[] args) {
        int numDig = 1;
        int n;
        int numIntrod;
        System.out.print("Introduce un número: ");
        numIntrod = Math.abs(Integer.parseInt(System.console().readLine()));
        n = numIntrod;
        while (n > 10){
            n /= 10;
            numDig++;
        }
    System.out.println(numIntrod + " tiene "+ numDig + " dígito/s.");
  }
}
