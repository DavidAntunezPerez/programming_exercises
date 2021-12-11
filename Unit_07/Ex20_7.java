/**
 * Implementa un programa que calcule la denominación ordinal de los reyes de
 * una secuencia histórica. El programa solicitará la cantidad de reyes que se
 * van a introducir, y a continuación recibirá los nombres de los reyes.
 * Presentará
 * por pantalla dichos nombres, pero colocándoles el ordinal correspondiente.
 * Así,
 * por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero
 * debería
 * aparecer como Felipe 1º y el segundo como Felipe 2º.
 * 
 * @author David Antunez Perez
 */
public class Ex20_7 {
  public static void main(String[] args) {
    System.out.print("Introduzca el número de reyes:  ");
    int n = Integer.parseInt(System.console().readLine());
    String[] name = new String[n];
    System.out.println();
    System.out.print("Vaya introduciendo nombres de reyes y pulsando ENTER: \n");
    for (int i = 0; i < name.length; i++) {
      name[i] = System.console().readLine();
    }
    for (int i = 0; i < n; i++) {
      int orden = 1;
      
      for (int j = 0; j < i; j++) {
        if (name[i].equals(name[j])) {
          orden++;
        }
      }
      System.out.println(name[i] + " " + orden + "º");
    }
  }
}
