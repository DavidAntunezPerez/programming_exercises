/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 * 
 * @author David Antunez Perez
 */
public class Ex11_6 {
  public static void main(String[] args) {
    String notLet = "?";
    int contSus = 0;
    int contSuf = 0;
    int contBn = 0;
    int contNt = 0;
    int contSb = 0;
    System.out.println("Las notas son: ");
    for (int i = 0; i < 20; i++) {
      int notNum = (int) (Math.random() * 5 + 1);
      switch (notNum) {
      case 1:
        notLet = "suspenso";
        contSus++;
        break;
      case 2:
        notLet = "suficiente";
        contSuf++;
        break;
      case 3:
        notLet = "bien";
        contBn++;
        break;
      case 4:
        notLet = "notable";
        contNt++;
        break;
      case 5:
        notLet = "sobresaliente";
        contSb++;
        break;
      }
      System.out.print(notLet + " ");
    }
    System.out.println();
    System.out.println("-------------------------");
    System.out.println("CONTADOR DE RESULTADOS: ");
    System.out.println("SUSPENSO: " + contSus);
    System.out.println("SUFICIENTE: " + contSuf);
    System.out.println("BIEN: " + contBn);
    System.out.println("NOTABLE: " + contNt);
    System.out.println("SOBRESALIENTE: " + contSb);

  }
}
