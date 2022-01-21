
import functions.Functions_1to14_8;

public class Ex17_8 {
  public static void main(String[] args) {
    System.out.println(binarioDecimal(101));
  }

  public static int binarioDecimal(int numInt) {
    int contDigit = Functions_1to14_8.digitos(numInt); // numero de dígitos
    int cifra = numInt;
    int cogNum = 0;
    for (int i = 1; i <= numInt; i *= 10) {
      cogNum = cifra % 10;
      System.out.print(cogNum + "\n");
      cifra = (cifra - cogNum) / 10;
    }
    return result;
  }
}
