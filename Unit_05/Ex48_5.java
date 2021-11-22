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
    boolean one = false;
    boolean two = false;
    boolean three = false;
    boolean four = false;
    boolean five = false;
    boolean six = false;
    boolean seven = false;
    boolean eight = false;
    boolean nine = false;
    boolean cero = false;
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
      cifra = cifra - (cogNum * potencia11);
      switch (cogNum) {
      case 0:
        cero = true;
        break;
      case 1:
        one = true;
        break;
      case 2:
        two = true;
        break;
      case 3:
        three = true;
        break;
      case 4:
        four = true;
        break;
      case 5:
        five = true;
        break;
      case 6:
        six = true;
        break;
      case 7:
        seven = true;
        break;
      case 8:
        eight = true;
        break;
      case 9:
        nine = true;
        break;
      }
    }
    if (cero == false) {
      System.out.print(0 + " ");
    }
    if (one == false) {
      System.out.print(1 + " ");
    }
    if (two == false) {
      System.out.print(2 + " ");
    }
    if (three == false) {
      System.out.print(3 + " ");
    }
    if (four == false) {
      System.out.print(4 + " ");
    }
    if (five == false) {
      System.out.print(5 + " ");
    }
    if (six == false) {
      System.out.print(6 + " ");
    }
    if (seven == false) {
      System.out.print(7 + " ");
    }
    if (eight == false) {
      System.out.print(8 + " ");
    }
    if (nine == false) {
      System.out.print(9 + " ");
    }
  }
}
