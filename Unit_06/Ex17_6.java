
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
import java.util.Scanner;

public class Ex17_6 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Introduce la altura: ");
      int altura = sc.nextInt();
      System.out.print("Introduce la anchura: ");
      int anchura = sc.nextInt();
      String aux = "";
      // Imprimir
      for (int alto = 0; alto < altura; alto++) {
        for (int largo = 0; largo < anchura; largo++) {
          // Primera y Ultima Linea (Todo con *)
          if (alto == 0 | alto == altura - 1) {
            aux = "*";
          } else {
            // Zona media (* o blanco)
            if (largo == 0 | largo == anchura - 1)
              aux = "*";
            if (largo != 0 & largo != anchura - 1)
              aux = " ";
          }
          // Pintamos caracter que corresponda
          System.out.print(aux);
          System.out.print(" ");
          // Si es final de linea un salto
          if (largo == anchura - 1)
            System.out.print("\n");
        }
      }
    }
  }
}
