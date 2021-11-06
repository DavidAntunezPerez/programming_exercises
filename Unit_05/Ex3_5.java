/**
 * @author David Antunez Perez
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while
 */
public class Ex3_5 {
    public static void main(String[] args) {
        int n = 0;
        do{
            System.out.println(n);
            n= n + 5;
        }while(n <= 100);
    }    
}
