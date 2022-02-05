package functions;

public class Functions_36_8 {
  public static void main(String[] args) {
    int[] numeros = Functions_20to28_8.generaArrayInt(20, 1, 100);

    System.out.println("Array original: ");
    Functions_20to28_8.muestraArrayInt(numeros);
    System.out.println("Primos: ");
    Functions_20to28_8.muestraArrayInt(filtraPrimos(numeros));
  }
  }
  public static int[] filtraPrimos(int x[]) {
    int[] primos = new int[x.length];

    int cuentaPrimos = 0;
    for (int numero : x) {
      if (Functions_1to14_8.esPrimo(numero)) {
        primos[cuentaPrimos++] = numero;
      }
    }

    int[] resultado = new int[cuentaPrimos];

    for (int i = 0; i < cuentaPrimos; i++) {
      resultado[i] = primos[i];
    }

    return resultado;
  }
}
