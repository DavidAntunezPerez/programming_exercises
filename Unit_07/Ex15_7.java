/**
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto,
 * si
 * un cliente dice por ejemplo que son un grupo de 6, el programa dará el
 * mensaje
 * “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como
 * máximo e intente de nuevo”. Para el grupo que llega, se busca siempre
 * la primera mesa libre (con 0 personas). Si no quedan mesas libres, se busca
 * donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos
 * personas, se podrá colocar donde haya una o dos personas. Inicialmente, las
 * mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
 * nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
 * pueden romper aunque haya huecos sueltos suficientes.
 * 
 * @author David Antunez Perez
 */
public class Ex15_7 {
  public static void main(String[] args) {
    int people;
    int[] n = new int[10];
    // print del número de mesas
    System.out.print("Nº Mesa : ");
    for (int i = 0; i < n.length; i++) {
      System.out.print(i + "  ");
    }
    System.out.println();
    System.out.print("Ocupación : ");
    for (int i = 0; i < n.length; i++) {
      n[i] = (int) (Math.random() * 4);
      System.out.print(n[i] + "  ");
    }
    do {
      System.out.println();
      System.out.print("¿Cuántos son? : ");
      people = Integer.parseInt(System.console().readLine());
      if (people > 4) {
        System.out.println();
        System.out
            .print("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo.");
      }
    } while (people > 4);
    for (int i = 0; i < n.length; i++) {
      if (n[i] == 0) {
        n[i] = people;
        System.out.println("Tu grupo ha sido agregado a la mesa " + i + ", disfrute la comida.");
      }

    }
  }
}
