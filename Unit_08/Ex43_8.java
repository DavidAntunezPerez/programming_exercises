public class Ex43_8 {
  public static void main(String[] args) {
    System.out.print("Introduce la altura de la pirámide:");
    int altura = Integer.parseInt(System.console().readLine());
    for (int i = 0; i < altura; i++) {
      System.out.print(linea(' ', i));
      System.out.println(linea('*', altura - i));
    }
  }

  public static String linea(char caracter, int repeticiones) {

    String result = "";

    for (int i = 0; i < repeticiones; i++) {
      result += caracter;
    }

    return result;
  }
}