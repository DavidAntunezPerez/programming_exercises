public class Ex43v2_5 {
  public static void main(String[] args) {
    // Separa número del primero al último
    System.out.print("Por favor, introduzca número: ");
    int numInt = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posición desde la que partir el número: ");
    int pos = Integer.parseInt(System.console().readLine());
    int cifra = numInt;
    int cogNum = 0;
    for (int i = 1; i <= numInt; i *= 10) {
      cogNum = cifra % 10;
      System.out.print(cogNum + "\n");
      cifra = (cifra - cogNum) / 10;
    }
  }
}
