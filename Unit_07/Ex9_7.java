/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 * 
 * @author David Antunez Perez
 */
public class Ex9_7 {
  public static void main(String[] args) {
    int[] n = new int[8];
    for (int i = 0; i < n.length; i++) {
      System.out.print("Escribe un número: ");
      n[i] = Integer.parseInt(System.console().readLine());
    }
    
  }
}
