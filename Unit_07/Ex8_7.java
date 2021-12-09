/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 * 
 * @author David Antunez Perez
 */
public class Ex8_7 {
  public static void main(String[] args) {
    int[] m = new int[12];
    String mName = "";
    for (int i = 0; i < 12; i++) {
      switch (i) {
        case 0:
          mName = "Enero";
          break;
        case 1:
          mName = "Febrero";
          break;
        case 2:
          mName = "Marzo";
          break;
        case 3:
          mName = "Abril";
          break;
        case 4:
          mName = "Mayo";
          break;
        case 5:
          mName = "Junio";
          break;
        case 6:
          mName = "Julio";
          break;
        case 7:
          mName = "Agosto";
          break;
        case 8:
          mName = "Septiembre";
          break;
        case 9:
          mName = "Octubre";
          break;
        case 10:
          mName = "Noviembre";
          break;
        case 11:
          mName = "Diciembre";
          break;
      }
      System.out.print("Introduzca la temperatura de media de " + mName + " (ºC): ");
      m[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println();
    System.out.println(" GRÁFICO ILUSTRATIVO");
    System.out.println(" -------------------");
    for(int i = 0; i < m.length; i++) {
      System.out.print("|");
      for(int j = 0; j < m[i]; j++) {
        System.out.print("-");
      }
      System.out.print(" "+m[i]+"ºC");
      System.out.println();
    }
  }
}
