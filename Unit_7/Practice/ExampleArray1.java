public class ExampleArray1 {
  public static void main(String[] args) {
    // Definimos un Array

    // Para definir como array:
    // Definir Estructura
    double[] prices;
    // Reservar memoria
    prices = new double[5];

    /**
     * new nos servirá para crear objetos pero sirve para llamar al constructor,
     * suele ser para inicializar o reservar memoria
     */

    /**
     *LA FORMA CORTA SERÍA: 
     double[] prices = new double[5];
      */ 

    //Para darle un valor
    prices[2]= 4.16;
    prices[0]= 25.127;
    
    System.out.printf("%.2f\n",prices[0]);
    System.out.printf("%.2f$\n", prices[2]);
  }
}
