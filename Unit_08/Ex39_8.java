public class Ex39_8 {
  public static void main(String[] args) {
    System.out.println(convierteEnPalabras(12));
  }

  public static String convierteEnPalabras(int n) {
    String palabra = "";

    int cifra = n;
    int cogNum = 0;
    int contDigit = 0;

    for (int h = 1; h <= n; h *= 10) {
      contDigit++;
    }

    for (int i = 1; i <= contDigit; i++) {
      int potencia10 = (int) (Math.pow(10, (contDigit - i)));
      cogNum = cifra / potencia10;
      switch (cogNum) {
        case 1:
          palabra += "uno";
          break;
        case 2:
          palabra += "dos";
          break;
        case 3:
          palabra += "tres";
          break;
        case 4:
          palabra += "cuatro";
          break;
        case 5:
          palabra += "cinco";
          break;
        case 6:
          palabra += "seis";
          break;
        case 7:
          palabra += "siete";
          break;
        case 8:
          palabra += "ocho";
          break;
        case 9:
          palabra += "nueve";
          break;
        case 0:
          palabra += "cero";
          break;
      }
      palabra += " ";
      cifra = cifra - (cogNum * potencia10);
    }
    return palabra;
  }
}