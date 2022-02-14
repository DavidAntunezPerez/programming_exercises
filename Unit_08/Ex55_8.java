public class Ex55_8 {
  public static void main(String[] args) {
    String[] a = { "casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol",
        "CASA" };
    for (int i = 0; i < sinRepetir(a).length; i++) {
      System.out.print(sinRepetir(a)[i] + " ");
    }

  }

  public static String[] sinRepetir(String[] s) {
    String[] arraySinRepeticionesAux = new String[s.length];
    int k = 0;
    for (int i = 0; i < s.length; i++) {
      boolean repetido = false;
      for (int j = 0; ((j < s.length) && (!repetido)); j++) {
        if (s[i].equals(arraySinRepeticionesAux[j])) {
          repetido = true;
        }
      }
      if (!repetido) {
        arraySinRepeticionesAux[k] = s[i];
        k++;
      }
    }
    String[] arraySinRepeticiones = new String[k];
    for (int i = 0; i < k; i++) {
      arraySinRepeticiones[i] = arraySinRepeticionesAux[i];
    }
    return arraySinRepeticiones;
  }
}
