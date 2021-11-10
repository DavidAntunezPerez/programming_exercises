/**
 * Realiza un programa que sume los 100 números siguientes a un número entero y
 * positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 * @author David Antunez Perez
 * 
 */
public class Ex17_5 {
  public static void main(String[] args) {
    int n= 0; // número introducido
    do{
      System.out.print("Escribe un número entero positivo: ");
        n = Integer.parseInt(System.console().readLine());
      if (n < 0){
        System.out.println("ERROR, número no válido. Asegurese de que el número sea entero y positivo.");
      }
    }while(n < 0);
    int add = 0; // suma de todos los números
    for(int i = n; i < n + 100; i++){
      add += i;
    }
    System.out.println("La suma de los 100 números posteriores a "+n+" es: "+add);
  }
}
