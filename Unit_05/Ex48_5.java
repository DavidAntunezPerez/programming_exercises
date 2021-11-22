/**
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir
 * números largos.
 * 
 * @author David Antunez Perez
 */
public class Ex48_5 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero: ");
    int numInt = Integer.parseInt(System.console().readLine());
    int n = numInt;
    int contDig = 1;
    int cifra = numInt;
    int cogNum = 0;
    // contamos los dígitos
    do {
      n /= 10;
      contDig++;
    } while (n > 0);

    System.out.print("Dígitos que aparecen en el número: ");
    for (int i = 2; i <= contDig; i++) {
      int potencia10 = (int) (Math.pow(10, (contDig - i)));
      cogNum = cifra / potencia10;
      System.out.print(cogNum + " ");
      cifra = cifra - (cogNum * potencia10);
    }
    cifra = numInt;
    System.out.print("\nDígitos que no aparecen: ");
    for (int i = 2; i <= contDig; i++) {
      int potencia11 = (int) (Math.pow(10, (contDig - i)));
      cogNum = cifra / potencia11;
      switch (cogNum) {
        case 0:
          System.out.print(0 + " ");
          break;
        case 1:
          System.out.print(1 + " ");
          break;
        case 2:
          System.out.print(2 + " ");
          break;
        case 3:
          System.out.print(3 + " ");
          break;
        case 4:
          System.out.print(4 + " ");
          break;
        case 5:
          System.out.print(5 + " ");
          break;
        case 6:
          System.out.print(6 + " ");
          break;
        case 7:
          System.out.print(7 + " ");
          break;
        case 8:
          System.out.print(8 + " ");
          break;
        case 9:
          System.out.print(9 + " ");
          break;
        }
      cifra = cifra - (cogNum * potencia11);
    }
  }
}
