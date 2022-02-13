public class Ex44_9 {
  public static void main(String[] args) {
    System.out.print("Introduce la altura de la pirámide:");
    int altura = Integer.parseInt(System.console().readLine());
    for (int i = 1; i < altura; i++) {
      System.out.print(linea(' ', i));
      System.out.print("*" + linea(' ', altura - i - 2));
      if (i < altura - 1) {
        System.out.println("*");
      }
    }
    System.out.println();
  }
  public static String linea(char caracter, int repeticiones) {

    String resultado = "";

    for (int i = 0; i < repeticiones; i++) {
      resultado += caracter;
    }

    return resultado;
  }
}
