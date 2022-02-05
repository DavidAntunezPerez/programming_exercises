import functions.Functions_20to28_8;

public class Ex38_8 {
  public static void main(String[] args) {
    int[] numeros = Functions_20to28_8.generaArrayInt(1, 200);

    System.out.println("Array original: ");
    Functions_20to28_8.muestraArrayInt(numeros);
    System.out.println("Capicuas: ");
    Functions_20to28_8.muestraArrayInt(filtraCapicuas(numeros));
  }

  public static int[] filtraCapicuas(int x[]) {
    int[] c = new int[x.length];
    int capicuaCont = 0;
    for (int i = 0; i < x.length; i++) {
      if (functions.Functions_1to14_8.esCapicua(x[i])) {
        c[capicuaCont] = x[i];
        capicuaCont++;
      }
    }
    int[] result = new int[capicuaCont];
    capicuaCont = 0;
    for (int i = 0; i < result.length; i++) {
      result[capicuaCont] = c[i];
      capicuaCont++;
    }
    return result;
  }
}
