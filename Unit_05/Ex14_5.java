/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 * 
 * @author David Antunez Perez
 */
public class Ex14_5 {
  public static void main(String[] args) {
    System.out.print("Escribe una base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Escribe un exponente: ");
    int exp = Integer.parseInt(System.console().readLine());
    int baseCalc = base;
    int expCalc = exp;
    for (int n = baseCalc; expCalc > 1; expCalc--) {
      baseCalc = baseCalc * n;
    }
    System.out.println("El resultado de " + base + "^" + exp + " es: " + baseCalc);
  }
}
