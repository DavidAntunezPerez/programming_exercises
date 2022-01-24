
import functions.Functions_1to14_8;

public class Ex17_8 {
  public static void main(String[] args) {
    System.out.println(binarioDecimal(1111));
  }

  /**
   * Pasa un número de binario a decimal
   * 
   * @param numInt Número introducido en binario
   * @return Valor en decimal
   */
  public static int binarioDecimal(int numInt) {
    int result = 0; // resultado final
    // Separa número del último al primero
    int cifra = numInt;
    int cogNum = 0;
    int elevado = 0;
    int posicion = 0;
    for (int i = 1; i <= numInt; i *= 10) {
      elevado = 0;
      cogNum = cifra % 10;
      elevado = Functions_1to14_8.potencia(2, posicion);
      result += elevado * cogNum;
      cifra = (cifra - cogNum) / 10;
      posicion++;
    }
    return result; // devuelve el resultado de las operaciones
  }
}
