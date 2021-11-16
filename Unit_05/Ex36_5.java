/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita el
 * tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 * long en lugar de int ya que el primero admite números más largos.
 * 
 * @author David Antúnez Pérez
 */
public class Ex36_5 {
  public static void main(String[] args) {
    System.out.print("\n"); // Salto de Línea
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numIngre =Integer.parseInt(System.console().readLine());
    int numVuelta = 0;
    int cifra = numIngre;
    for (int i = 1; i <= numIngre; i *= 10) { // da la vuelta al número
      int cogNum = 0;
      cogNum = cifra % 10;
      numVuelta = (numVuelta * 10) + cogNum;
      cifra = (cifra - cogNum) / 10;
    }
    if (numIngre == numVuelta) { // si el número introducido y su volteado son iguales es capidua
      System.out.print(numIngre + " es Capicua");
    } else {
      System.out.print(numIngre + " no es Capicua");
    }
  }
}
