/**
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 * 
 * @author David Antunez Perez
 */
public class Ex18_6 {
  public static void main(String[] args) {
    // Inicializamos los tres números que aleatorizaran los colores
    int color1 = (int) (Math.random() * 6 + 1);
    int color2 = (int) (Math.random() * 6 + 1);
    int color3 = (int) (Math.random() * 6 + 1);
    // Inicializamos ahora las variables que contienen cada color
    String c = "";
    switch (color1) {
      case 1:
        c = "rojo";
        break;
      case 2:
        c = "azul";
        break;
      case 3:
        c = "verde";
        break;
      case 4:
        c = "amarillo";
        break;
      case 5:
        c = "violeta";
        break;
      case 6:
        c = "naranja";
        break;
    }
    // Mostramos por pantalla el primer color y el título
    System.out.print("Los colores generados son: ");
    System.out.print(c + " ");
    switch (color2) {
      case 1:
        c = "rojo";
        break;
      case 2:
        c = "azul";
        break;
      case 3:
        c = "verde";
        break;
      case 4:
        c = "amarillo";
        break;
      case 5:
        c = "violeta";
        break;
      case 6:
        c = "naranja";
        break;
    }
    System.out.print(c + " y ");
    switch (color3) {
      case 1:
        c = "rojo";
        break;
      case 2:
        c = "azul";
        break;
      case 3:
        c = "verde";
        break;
      case 4:
        c = "amarillo";
        break;
      case 5:
        c = "violeta";
        break;
      case 6:
        c = "naranja";
        break;
    }
    System.out.print(c);
  }
}
