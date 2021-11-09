/**
 * Escribe un programa que muestre los n primeros términos de la serie de
    Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
    el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
    términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
    introducir por teclado.
 *
 * @author David Antúnez Pérez
 */
public class Ex12_5 {
    public static void main(String[] args) {
        int n; // número de números introducidos
        int f = 0; // primer número de la serie
        int f2 = 1; // segundo número de la serie
        int f3 = 1;
        int sto = f3;
        System.out.print("Introduce el número de números de la serie de Fibonacci que quieres ver: ");
        n = Integer.parseInt(System.console().readLine());
        if ( n == 1 ){
            System.out.println(f);
        }
        else if (n >= 2){
            System.out.println(f);
            System.out.println(f2);
        }
       while (n > 3){
        System.out.println(sto);
        sto = 
        

        n--;
       }
    }
}
