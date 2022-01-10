package Practice;
public class ExampleArray1 {
  public static void main(String[] args) {
    // Definimos un Array

    // Para definir como array:
    // Definir Estructura
    double[] price;
    // Reservar memoria
    price = new double[6];

    /**
     * new nos servirá para crear objetos pero sirve para llamar al constructor,
     * suele ser para inicializar o reservar memoria
     */

    /**
     * LA FORMA CORTA SERÍA:
     * double[] prices = new double[5];
     */
    /**
     * TAMBIEN SE PODRIA PONER:
     * double[] price = {25.127, 500, 4.16, 350, 400, 20};
     */
    // Para darle un valor

    price[0] = 25.127;
    price[1] = 500;
    price[2] = 4.16;
    price[3] = 350;
    price[4] = 400;
    price[5] = 20;

    for (int i = 0; i < price.length; i++) {
      System.out.printf("%.2f\n", price[i]);
    }
  }
}
