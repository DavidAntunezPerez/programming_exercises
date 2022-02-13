public class Ex46_9 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(System.console().readLine());

    for (int i = 1; i < altura; i++) {
      System.out.print(vertices('*', i));
      System.out.print(linea(' ', altura * 2 - i * 2 - 1));
      System.out.println(vertices('*', i));
    }

    System.out.println(linea('*', altura * 2 - 1));

  }

  public static String linea(char caracter, int longitud) {

    String resultado = "";

    for (int i = 0; i < longitud; i++) {
      resultado += caracter;
    }

    return resultado;
  }

  public static String vertices(char caracter, int longitud) {

    if (longitud == 1) {
      return "*";
    }

    return "*" + linea(' ', longitud - 2) + "*";
  }
}
