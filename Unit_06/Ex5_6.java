/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media de
 * esos números.
 * 
 * @author David Antunez Perez
 */
public class Ex5_6 {
  public static void main(String[] args) {
    int max = 0; 
    int min = 199;
    double add = 0;
    int n;
    for (int i = 0; i < 50; i++) {
      n= (int) (Math.random() * 100 + 100);
      System.out.print(n + " ");
      add += n;
      if (n > max){  
        max = n;
      }
      if ( n < min){  
        min = n;
      }
    }
    System.out.println();
    System.out.println("El máximo es " + max);
    System.out.println("El minimo es " + min);
    System.out.println("La media es " + (add / 50));
  }
}
