/**
 * @author David Antunez Perez
 * Realiza un programa que trocee un número introducido por teclado en otros dos números. Un trozo se
    formará con los dígitos de las posiciones pares y otro trozo con los dígitos de las posiciones impares.
    Se debe conservar el orden de los dígitos. Da igual el trozo que se muestre primero con tal de que
    cada trozo esté bien formado.
 */
public class Exam_Ex2 {
    public static void main(String[] args) {
        System.out.print("Escriba un número: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println(n);
        
    }
}
