public class Ex3 {
  public static void main(String[] args) {
    // pintar la línea
    System.out.println(linea(5, 'X', '-'));
    // pintar la pirámide
    System.out.println("Introduzca la altura de la pirámide: ");
    int h = Integer.parseInt(System.console().readLine());
    int imp = 1;
    for (int i = 0; i < h - 1; i++) {
      System.out.println(linea(imp, '*', ' '));
      imp += 2;
    }
    // base pirámide
    System.out.println(linea((2 * h) - 2, '*', '*'));
  }

  public static String linea(int longitud, char extremo, char relleno) {
    String resultado = "";
    if (longitud > 1) {
      resultado += extremo;
    }
    for (int i = 0; i < longitud - 2; i++) {
      resultado += relleno;
    }
    resultado += extremo;
    return resultado;
  }
}
