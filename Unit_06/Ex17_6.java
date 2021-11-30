/**
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo
 * 
 * @author David Antunez Perez
 */
public class Ex17_6 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura del pez (min 4): ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print("Introduzca la anchura (min 4): ");
    int a = Integer.parseInt(System.console().readLine());
    // Parte superior
    for (int i = a - 1; i > 0; i--) {
      System.out.print("* ");
    }
    // Parte media
    for (int i = h - 2; i > 0; i--) {
      System.out.println("*");
    }

    // Parte inferior
    for (int i = a; i > 0; i--) {
      System.out.print("* ");
    }

  }
}
