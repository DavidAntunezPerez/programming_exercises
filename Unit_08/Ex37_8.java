import functions.Functions_1to14_8;
import functions.Functions_20to28_8;

public class Ex37_8 {
  public static void main(String[] args) {
    int[] numeros = Functions_20to28_8.generaArrayInt(1 , 100);

    for (int numero : numeros) {
      System.out.print("El " + numero + " es el " + convierteEnMorse(numero));
      System.out.println(" en morse.");
    }
  }

  public static String convierteEnMorse(int n) {
    String[] morse = {
        "_ _ _ _ _", ". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _",
        ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ ."
    };

    String resultado = "";

    for (int i = 0; i < Functions_1to14_8.digitos(n); i++) {
      resultado += morse[Functions_1to14_8.digitoN(n, i)];
    }

    return resultado;
  }
}
