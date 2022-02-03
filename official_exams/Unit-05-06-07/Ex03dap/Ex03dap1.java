package Ex03dap;

/**
 * @author David Antunez Perez 1º DAM , 14/12/21
 */
public class Ex03dap1 {
  public static void main(String[] args) {
    int ans = 0;
    // Hacemos un bucle para que se muestre siempre el resultado correcto
    do {
      System.out.println();
      System.out.print("Introduzca la eslora del barco (núm. entero may o igual a 3): ");
      ans = Integer.parseInt(System.console().readLine());
      if (ans < 3) {
        System.out.print("\nTamaño no válido, debe ser mayor o igual a 3.");
      }
    } while (ans < 3);
    // Al haber dos posibilidades, una varias variable para que se muestren de forma
    // aleatoria:
    int posibilidad = (int) (Math.random() * 2 + 1);
    // Creamos otra variable para aleatorizar la posición de cada cosa
    int posicion = (int) (Math.random() * 6 + 1);
    // Creamos sus respectivas variables
    String obj1 = "";
    String obj2 = "";
    String obj3 = "";
    // Unimos las variables según la posibilidad
    if (posibilidad == 1) { // caso en el que no está la gallina
      switch (posicion) {
        case 1:
          obj1 = "Z";
          obj2 = "C";
          obj3 = "M";
          break;
        case 2:
          obj1 = "Z";
          obj2 = "M";
          obj3 = "C";
          break;
        case 3:
          obj1 = "M";
          obj2 = "C";
          obj3 = "Z";
          break;
        case 4:
          obj1 = "M";
          obj2 = "Z";
          obj3 = "C";
          break;
        case 5:
          obj1 = "C";
          obj2 = "M";
          obj3 = "Z";
          break;
        case 6:
          obj1 = "C";
          obj2 = "Z";
          obj3 = "M";
          break;
      }
    } else if (posibilidad == 2) { // caso en que está la gallina
      switch (posicion) {
        case 1:
          obj1 = " ";
          obj2 = "C";
          obj3 = "G";
          break;
        case 2:
          obj1 = " ";
          obj2 = "G";
          obj3 = "C";
          break;
        case 3:
          obj1 = "G";
          obj2 = " ";
          obj3 = "C";
          break;
        case 4:
          obj1 = "G";
          obj2 = "C";
          obj3 = " ";
          break;
        case 5:
          obj1 = "C";
          obj2 = " ";
          obj3 = "G";
          break;
        case 6:
          obj1 = "C";
          obj2 = "G";
          obj3 = " ";
          break;
      }
    }
    // Mostramos el barco por pantalla
    if (ans > 5) {
      System.out.print(" ");
    }
    if (ans > 9) {
      System.out.print(" ");
    }
    System.out.print(obj1);
    if (ans > 4) {
      System.out.print(" ");
    }
    if (ans > 9) {
      System.out.print(" ");
    }
    System.out.print(obj2);
    if (ans > 4) {
      System.out.print(" ");
    }
    if (ans > 9) {
      System.out.print(" ");
    }
    System.out.print(obj3);
    System.out.print("\n");
    // Mostramos el barco
    for (int i = 0; i < ans; i++) {
      System.out.print("*");
    }
    System.out.println();
    System.out.print(" ");
    for (int i = 0; i < ans - 2; i++) {
      System.out.print("*");
    }
  }
}
