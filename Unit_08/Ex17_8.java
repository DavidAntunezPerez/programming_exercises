
import functions.Functions_1to14_8;

public class Ex17_8 {
  public static void main(String[] args) {
    System.out.println(binarioDecimal(1011));
  }
  /**
   * 
   * @param numInt
   * @return
   */
  public static int binarioDecimal(int numInt) {
    int cont = 1;
    int contDigit = Functions_1to14_8.digitos(numInt); // numero de dígitos
    int result = 0;
    int cifra = numInt;
    int cogNum = 0;
    for (int i = 1; i <= numInt; i *= 10) {
      cogNum = cifra % 10;
      result = (cogNum * Functions_1to14_8.potencia(2, cont));
      cifra = (cifra - cogNum) / 10;
    }
    return result; // devuelve el resultado de las operaciones
  }
}
