public class Ex43v2_5 {
  public static void main(String[] args) {
    // Separa número del primero al último
    System.out.print("Por favor, introduzca número: ");
    int numInt = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posición desde la que partir el número: ");
    int pos = Integer.parseInt(System.console().readLine());
    int cifra = numInt;
    int cogNum = 0;
    // primera mitad
    System.out.print("Los números partidos son el ");
    for (int i = 1; i <= numInt*(int)(Math.pow(10, pos)); i *= 10) {
      cogNum = cifra / 10;
      System.out.print(cogNum + " ");
      cifra = (cifra - cogNum) / 10;
      i = 1+(numInt*(int)(Math.pow(10, pos)));
    }
    for (int i = 1; i <= numInt*(int)(Math.pow(10, pos)); i *= 10) {
      cogNum = cifra % 10;
      System.out.print(cogNum + " ");
      // cifra = (cifra - cogNum) / 10;
      i = 1+(numInt*(int)(Math.pow(10, pos)));
    }
  }
}
