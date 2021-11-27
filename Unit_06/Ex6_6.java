/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número
 * introducido es menor o mayor que el número secreto.
 * 
 * @author David Antunez Perez
 */
public class Ex6_6 {
  public static void main(String[] args) {
    System.out.println("ADIVINA EL NÚMERO");
    int cont = 5;
    boolean guess = false;
    int random = (int) (Math.random() * 100);
    do {
      System.out.println("Tienes " + cont + " intentos");
      System.out.print("Por favor, introduce un número del 0 al 100: ");
      int n = Integer.parseInt(System.console().readLine());
      if (n == random) {
        guess = true;
      }
      cont--;
    } while ((guess == false) && (cont > 0));
    if (guess == true) {
      System.out.print("ENHORABUENA! Has acertado el número");
    } else if (guess == false) {
      System.out.print("Lo siento, no has acertado el número.");
    }
  }
}
