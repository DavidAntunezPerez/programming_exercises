import functions.Functions_1to14_8;

/**
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal,
 * binario,
 * hexadecimal y octal.
 */
public class Ex19_8 {
  public static void main(String[] args) {
    System.out.println(binarioOctal(101));
  }

  /**
   * De decimal a binario
   * 
   * @param nIntr Numero introducido en decimal
   * @return Numero pasado a binario
   */
  public static long decimalBinario(int nIntr) {
    String binario = "";
    while (nIntr > 0) {
      if (nIntr % 2 == 0) {
        binario = "0" + binario;
      } else {
        binario = "1" + binario;
      }
      nIntr = nIntr / 2;
    }
    long result = Long.parseLong(binario);
    return result;
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

  /**
   * De binario a octal
   * 
   * @param nIntr número introducido en binario
   * @return resultado en octal
   */
  public static long binarioOctal(int nIntr) {
    // lo convertimos en decimal
    nIntr = binarioDecimal(nIntr);
    int aux = 0;
    int result = 0;
    int digitos = 0;
    int cont = 1;
    // hacer la cuenta mientras sea divisible entre 8
    do {
      digitos = functions.Functions_1to14_8.digitos(nIntr);
      aux = (nIntr % 8) * (functions.Functions_1to14_8.potencia(10, cont - 1));
      result += aux;
      if (cont < digitos) {
        cont++;
      }
      if (cont == digitos) {
        aux = (nIntr / 8) * 10;
        result += aux;
      }
      nIntr = nIntr / 8;
    } while (nIntr / 8 > 0);
    // devuelve el resultado
    return result;
  }
}
