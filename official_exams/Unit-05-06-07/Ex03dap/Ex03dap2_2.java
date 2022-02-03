package Ex03dap;

/**
 * @author David Antunez Perez 1º DAM , 14/12/21
 */
public class Ex03dap2_2 {
  public static void main(String[] args) {
    // Declaramos el array
    int[] n = new int[20];
    // Aleatorizamos los valores del array y mostramos el array original
    System.out.println("ARRAY ORIGINAL");
    System.out.println("--------------");
    for (int i = 0; i < n.length; i++) {
      n[i] = (int) (Math.random() * 999 + 1);
      System.out.print(n[i] + " ");
    }
    // Mostramos las opciones a elegir
    int ans = 0;
    do {
      System.out.print("\n¿Qué filtro quieres aplicar? \n");
      System.out.println("1. Pares");
      System.out.println("2. Primos");
      System.out.println("3. Capicuas");
      System.out.print("Seleccione la opción : ");
      ans = Integer.parseInt(System.console().readLine());
      if ((ans < 1) || (ans > 3)) {
        System.out.print("\nPor favor, escoja un valor válido.");
      }
    } while ((ans < 1) || (ans > 3));
    switch (ans) {
      case 1:
        System.out.print("Los números filtrados son los siguientes: ");
        for (int i = 0; i < n.length; i++) {
          // Comprobar que sea par y hacer print por pantalla
          if (n[i] % 2 == 0) {
            System.out.print(n[i] + " ");
          }
        }
        break;
      case 2:
        System.out.print("Los números filtrados son los siguientes: ");
        for (int i = 0; i < n.length; i++) {
          // Comprobar que sea primo y hacer print por pantalla
          int numInt = n[i];
          int contDivisores = 2; // No puede ser 1
          boolean pregPrimo = true; // Presupone que el número es primo
          do {
            if (numInt % contDivisores == 0 && numInt != contDivisores) {
              pregPrimo = false; // Si encuentra un divisor: Ya no es primo
            }
            contDivisores++;
          } while (contDivisores < numInt && pregPrimo == true);
          if (pregPrimo == true) {
            System.out.print(n[i] + " ");
          }
        }
        break;
      case 3:
        System.out.print("Los números filtrados son los siguientes: ");
        for (int i = 0; i < n.length; i++) {
          // Comprobar que sea capicua y hacer print por pantalla
          int numIngre = n[i];
          int numVuelta = 0;
          int cifra = numIngre;
          for (int j = 1; j <= numIngre; j *= 10) { // da la vuelta al número
            int cogNum = 0;
            cogNum = cifra % 10;
            numVuelta = (numVuelta * 10) + cogNum;
            cifra = (cifra - cogNum) / 10;
          }
          if (numIngre == numVuelta) { // si el número introducido y su volteado son iguales es capidua
            System.out.print(n[i] + " ");
          }
        }
        break;
    }
  }
}