/**
 * Realiza un programa que muestre la previsión del tiempo para mañana en
 * Málaga. Las temperaturas máxima y mínima se deben generar de forma
 * aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
 * últimas décadas para cada estación. La probabilidad de que esté soleado
 * o nublado en cada estación se proporciona a continuación. Obviamente, la
 * temperatura mínima deberá ser menor o igual que la temperatura máxima.
 * 
 * @author David Antunez Perez
 */
public class Ex29_6 {
  public static void main(String[] args) {
    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    int n = 0;
    // damos la opción de ingresar la estación
    do {
      System.out.print("Seleccione la estación del año (1-4): ");
      n = Integer.parseInt(System.console().readLine());
      if ((n != 1) && (n != 2) && (n != 3) && (n != 4)) {
        System.out.print("ERROR. Por favor, ingrese un valor válido.\n");
      }
    } while ((n != 1) && (n != 2) && (n != 3) && (n != 4));
    // declaramos las variables que nos harán falta
    int temp = 0;
    int weatherProb = (int) (Math.random() * 100);
    String weather = "";
    // definimos las condiciones de que ocurra cada cosas
    if (n == 1) {
      temp = (int) (Math.random() * 11 + 15);
      if (weatherProb <= 60) {
        weather = "Soleado";
      }
      if (weatherProb > 60) {
        weather = "Nublado";
      }
    } else if (n == 2) {
      temp = (int) (Math.random() * 21 + 25);
      if (weatherProb <= 80) {
        weather = "Soleado";
      }
      if (weatherProb > 80) {
        weather = "Nublado";
      }
    } else if (n == 3) {
      temp = (int) (Math.random() * 11 + 20);
      if (weatherProb <= 60) {
        weather = "Nublado";
      }
      if (weatherProb > 60) {
        weather = "Soleado";
      }
    } else {
      temp = (int) (Math.random() * 26);
      if (weatherProb <= 60) {
        weather = "Soleado";
      }
      if (weatherProb > 60) {
        weather = "Nublado";
      }
    }

    // mostramos los datos por pantalla
    System.out.println("Previsión para el tiempo de mañana");
    System.out.println("----------------------------------");

  }
}
