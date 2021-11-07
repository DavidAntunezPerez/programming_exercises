/**
 * @author David Antunez Perez
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */
public class Ex8_5 {
    public static void main(String[] args) {
        int numMul = 0; // número por el que se multiplica
        int n; // número seleccionado para la tabla de multiplicar
        int n2;
        System.out.print("Ingrese el número que desea multiplicar: ");
        n = Integer.parseInt(System.console().readLine());
        do{
            n2 = numMul * n;
            System.out.println(n2);
            numMul++;
            
        }while(numMul <= 10);
    }   
}
