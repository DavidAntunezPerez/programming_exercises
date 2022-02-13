public class Ex46_9 {
  public static void main(String[] args) {
    System.out.print("Introduce la altura:");
    int altura = Integer.parseInt(System.console().readLine());
    for (int i = 1; i < altura; i++) {
      System.out.println();
      System.out.print(linea('*',"*", i));
      System.out.print(linea(' '," ",altura-i));
      System.out.print(linea(' '," ",altura-i));
      System.out.print(linea('*',"*", i));
    }
  }

  public static String linea(char lados, String caracter, int repeticiones) {
    String result = "";
    result += String.valueOf(lados);
    for (int i = 0; i < repeticiones - 2; i++) {
      result += String.valueOf(caracter);
    }
    result += String.valueOf(lados);
    return result;
  }
}
