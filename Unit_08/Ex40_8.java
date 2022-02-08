public class Ex40_8 {
  public static int[] filtraCon7(int x[]) {
    // Devuelve el array con todos los numeros que contengan 7
    int[] c = new int[x.length];
    int cont = 0;
    for (int i = 0; i < c.length; i++) {
      // Separa número del último al primero
      int cifra = x[i];
      int cogNum = 0;
      for (int j = 1; j <= x[i]; j *= 10) {
        cogNum = cifra % 10;
        if (cogNum == 7) {
          c[i] = x[i];
          cont++;
        }
        cifra = (cifra - cogNum) / 10;
      }
    }
    int[] result = new int[cont];
    cont = 0;
    for (int i = 0; i < c.length; i++) {
      if (c[i] == 7) {
        result[cont] = c[i];
        cont++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] x = functions.Functions_20to28_8.generaArrayInt(0, 10);
    System.out.println("ARRAY ORIGINAL:");
    functions.Functions_20to28_8.muestraArrayInt(x);
    System.out.println("ARRAY CON 7:");
    functions.Functions_20to28_8.muestraArrayInt(filtraCon7(x));

  }
}
