import functions.Functions_1to14_8;

/**
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal,
 * binario,
 * hexadecimal y octal.
 */
public class Ex19_8 {
  public static void main(String[] args) {
    String resultado = "";
    long numeroIntroducido = 666;

    System.out.println(" 1) Binario -> Octal");
    System.out.println(" 2) Binario -> Decimal");
    System.out.println(" 3) Binario -> Hexadecimal");
    System.out.println(" 4) Octal -> Binario");
    System.out.println(" 5) Octal -> Decimal");
    System.out.println(" 6) Octal -> Hexadecimal");
    System.out.println(" 7) Decimal -> Binario");
    System.out.println(" 8) Decimal -> Octal");
    System.out.println(" 9) Decimal -> Hexadecimal");
    System.out.println("10) Hexadecimal -> Binario");
    System.out.println("11) Hexadecimal -> Octal");
    System.out.println("12) Hexadecimal -> Decimal");
    System.out.print("Elija una opción: ");
    int opcion = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el número que quiere convertir: ");
    String numeroIntroducidoString = System.console().readLine();

    if (opcion < 10) {
      numeroIntroducido = Long.parseLong(numeroIntroducidoString);
    }

    switch (opcion) {
      case 1:
        resultado = Long.toString(binarioOctal(numeroIntroducido));
        break;
      case 2:
        resultado = Long.toString(binarioDecimal(numeroIntroducido));
        break;
      case 3:
        resultado = binarioHexadecimal(numeroIntroducido);
        break;
      case 4:
        resultado = Long.toString(octalBinario(numeroIntroducido));
        break;
      case 5:
        resultado = Long.toString(binarioDecimal(octalBinario(numeroIntroducido)));
        break;
      case 6:
      resultado = binarioHexadecimal(octalBinario(numeroIntroducido));
      break;
      case 7:
        resultado = Long.toString(decimalBinario(numeroIntroducido));
        break;
      case 8:
        resultado = Long.toString(decimalOctal(numeroIntroducido));
        break;
      case 9:
      resultado = binarioHexadecimal(decimalBinario(numeroIntroducido));
      break;
      case 10:
      resultado = Long.toString(hexadecimalBinario(numeroIntroducidoString));
      break;
      case 11:
      resultado =
      Long.toString(binarioAOctal(hexadecimalBinario(numeroIntroducidoString)));
      break;
      case 12:
      resultado =
      Long.toString(binarioDecimal(hexadecimalBinario(numeroIntroducidoString)));
      break;
    }

    System.out.println(resultado);
  }

  /**
   * De decimal a binario
   * 
   * @param nIntr Numero introducido en decimal
   * @return Numero pasado a binario
   */
  public static long decimalBinario(long nIntr) {
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
  public static long binarioDecimal(long numInt) {
    long result = 0; // resultado final
    // Separa número del último al primero
    long cifra = numInt;
    long cogNum = 0;
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
  public static long binarioOctal(long nIntr) {
    // lo convertimos en decimal
    nIntr = (int) binarioDecimal(nIntr);
    long aux = 0;
    int result = 0;
    int digitos = 0;
    int cont = 1;
    // hacer la cuenta mientras sea divisible entre 8
    do {
      digitos = functions.Functions_1to14_8.digitos((int) (nIntr));
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

  /**
   * De decimal a octal
   * 
   * @param nIntr número decimal
   * @return número octal
   */
  public static long decimalOctal(long nIntr) {
    // Igual que el binario a octal pero sin convertir de binario a decimal.
    long aux = 0;
    int result = 0;
    int digitos = 0;
    int cont = 1;
    // hacer la cuenta mientras sea divisible entre 8
    do {
      digitos = functions.Functions_1to14_8.digitos((int) (nIntr));
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

  /**
   * De Octal a Binario
   * 
   * @param numInt número octal
   * @return número en binario
   */
  public static long octalBinario(long numInt) {

    // Separamos un número de la primera cifra a la última:

    int cifra = (int) (numInt);
    int cogNum = 0;
    int contDigit = 0;
    long aux1 = 0;
    String aux2 = "";
    String stringResult = "";
    long result = 0;
    for (int h = 1; h <= numInt; h *= 10) {
      contDigit++;
    }

    for (int i = 1; i <= contDigit; i++) {
      int potencia10 = (int) (Math.pow(10, (contDigit - i)));
      cogNum = cifra / potencia10;
      aux1 = (decimalBinario(cogNum));
      aux2 = String.valueOf(aux1);
      stringResult += aux2;
      cifra = cifra - (cogNum * potencia10);
    }
    result = Long.parseLong(stringResult);
    return result;
  }

  /**
   * Octal a Decimal
   * 
   * @param numInt número octal
   * @return número decimal
   */
  public static long octalDecimal(long numIntr) {
    long result = numIntr;
    // pasamos primero a binario
    result = octalBinario(numIntr);
    // después a decimal
    result = binarioDecimal(result);
    return result;
  }

  /**
   * Binario -> Hexadecimal
   * 
   * @param nIntr numero introducido en binario
   * @return número en hexadecimal
   */
  public static String binarioHexadecimal(long nIntr) {
    String numeroHex = "";
    while (nIntr > 0) {
      String digitoNumeroHex = String.valueOf(binarioDecimal(nIntr % 10000));
      switch (digitoNumeroHex) {
        case "10":
          digitoNumeroHex = "A";
          break;
        case "11":
          digitoNumeroHex = "B";
          break;
        case "12":
          digitoNumeroHex = "C";
          break;
        case "13":
          digitoNumeroHex = "D";
          break;
        case "14":
          digitoNumeroHex = "E";
          break;
        case "15":
          digitoNumeroHex = "F";
          break;
        default:

      }

      numeroHex = digitoNumeroHex + numeroHex;

      nIntr /= 10000;
    }

    return numeroHex;
  }
  public static long hexadecimalBinario(String nIntr){
    if (nIntr.equals("0")) {
      return 0;
    } else {
      String numeroBi = "";
      String digitoABi = "";
      for (int i = 0; i < nIntr.length(); i++) {
        switch(nIntr.charAt(i)) {
          case 'A':
            digitoABi = "10";
            break;
          case 'B':
            digitoABi = "11";
            break;
          case 'C':
            digitoABi = "12";
            break;
          case 'D':
            digitoABi = "13";
            break;
          case 'E':
            digitoABi = "14";
            break;
          case 'F':
            digitoABi = "15";
            break;
          default:
            digitoABi = String.valueOf(nIntr.charAt(i)); 
        } //switch(numeroHex.charAt(i))

        String digitoBi = String.valueOf(decimalBinario(Long.valueOf(digitoABi)));

        if (functions.Functions_1to14_8.digitosLong(Long.valueOf(digitoBi)) == 1) {
          digitoBi = "000" + digitoBi;
        } else if (functions.Functions_1to14_8.digitosLong(Long.valueOf(digitoBi)) == 2) {
          digitoBi = "00" + digitoBi;
        } else if (functions.Functions_1to14_8.digitosLong(Long.valueOf(digitoBi)) == 3) {
          digitoBi = "0" + digitoBi;
        } //if (funciones.funcionesTema801.digitos(Long.valueOf(digitoBi)) == 1)

        numeroBi = numeroBi + digitoBi;
      } //for (int i = 0; i < numeroHex.length(); i++)

      return Long.valueOf(numeroBi); //la función devuelve numeroBi como un long en vez de un String (así no saldrán ceros a la izquierda)
  }
}
