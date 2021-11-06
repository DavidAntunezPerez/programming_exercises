/**
 * @author David Antunez Perez
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
 * do-while.
 */
public class Ex6_5 {
    public static void main(String[] args) {
        int n = 320;
        do {
            System.out.println(n);
            n--;
        }while (n >= 160);
    }
}
