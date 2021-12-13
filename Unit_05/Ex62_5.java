/**
 * Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8
 * y el 9.
 * Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el
 * 6. Un
 * número es afortunado si contiene más números de la suerte que de la mala
 * suerte. Realiza un programa que diga si un número introducido por el usuario
 * es afortunado o no
 * 
 * @author David Antunez Perez
 */
public class Ex62_5 {
  public static void main(String[] args) {
    int lucky = 0;
    int unlucky = 0;
    // Separa número del último al primero
    System.out.print("Por favor, introduzca número: ");
    int numInt = Integer.parseInt(System.console().readLine());
    int cifra = numInt;
    int cogNum = 0;
    for (int i = 1; i <= numInt; i *= 10) {
      cogNum = cifra % 10;
      if ((cogNum == 3) || (cogNum == 7) || (cogNum == 8)) {
        lucky++;
      } else {
        unlucky++;
      }
      cifra = (cifra - cogNum) / 10;
    }
    // Comparar las cifras afortunadas con las desafortunadas, en caso de empate, el
    // sistema dirá que es afortunado
    String result;
    if (lucky >= unlucky) {
      result = "afortunado";
    } else {
      result = "desafortunado";
    }
    // Mostramos el resultado
    System.out.println("El número " + numInt + " es un número " + result);
  }
}
