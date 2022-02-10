package Ex7_9;

public class Entrada {
  public static void main(String[] args) {
    Zona principal = new Zona(1000);
    Zona compraventa = new Zona(200);
    Zona vip = new Zona(25);
    boolean salir = false;
    do {
      salir = false;
      System.out.println("1. Mostrar número de entradas libres \n2. Vender entradas \n3. Salir");
      int option = Integer.parseInt(System.console().readLine());
      System.out.println();
      switch (option) {
        case 1:
          System.out.println("Sala principal: " + principal.getEntradasPorVender());
          System.out.println("Sala compra-venta: " + compraventa.getEntradasPorVender());
          System.out.println("Sala VIP: " + vip.getEntradasPorVender());
          break;
        case 2:
          System.out.print("¿Cuántas entradas quieres comprar?");
          int n = Integer.parseInt(System.console().readLine());
          System.out.println("¿De que zona quieres comprar?");
          System.out.println("1. Principal\n2. Compra-Venta\n3. VIP");
          int zona = Integer.parseInt(System.console().readLine());
          switch (zona) {
            case 1:
              principal.vender(n);
              break;
            case 2:
              compraventa.vender(n);
              break;
            case 3:
              vip.vender(n);
              break;
          }
          break;
        case 3:
          System.out.println("Nos vemos!");
          salir = true;
          break;
      }
    } while (!salir);
  }
}
