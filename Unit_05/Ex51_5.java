/**
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y
 * el 8 (todos los que encuentre). Realiza un programa que muestre un número
 * antes y después de haber sido comido por el gusano. Si el animalito no se ha
 * comido ningún dígito, el programa debe indicarlo.
 * 
 * @author David Antunez Perez
 * 
 */
public class Ex51_5 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero (mayor que cero): ");
    int numInt = Integer.parseInt(System.console().readLine());
    int n = numInt;
    int contDig = 1;
    int cifra = numInt;
    int cogNum = 0;
    boolean eat = false;
    // contamos los dígitos
    do {
      n /= 10;
      contDig++;
    } while (n > 0);
    for (int i = 2; i <= contDig; i++) {
      int potencia11 = (int) (Math.pow(10, (contDig - i)));
      cogNum = cifra / potencia11;
      if ((cogNum == 8) || (cogNum == 0)) {
        eat = true;
      }
      cifra = cifra - (cogNum * potencia11);
    }
    cifra = numInt;
    if (eat) {
      System.out.print("La serpiente se ha alimentado, quedando el número: ");
      for (int i = 2; i <= contDig; i++) {
        int potencia10 = (int) (Math.pow(10, (contDig - i)));
        cogNum = cifra / potencia10;
        if ((cogNum != 8) && (cogNum != 0)) {
          System.out.print(cogNum + "");
          cifra = cifra - (cogNum * potencia10);
        } else {
        }
      }
    } else if (!eat) {
      System.out.print("La serpiente no se ha comido ningún número.");
    }
  }
}
