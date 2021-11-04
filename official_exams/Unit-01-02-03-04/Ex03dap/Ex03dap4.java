/**
 * @author David Antunez Perez
 * Realiza un programa que calcule y muestre por pantalla el número de vueltas que da el
 *  planeta Tierra en 400 años en los dos siguientes supuestos:
 *   a) Sin tener en cuenta los años bisiestos.
 *   b) Desde el año 1601 al 2000, ambos incluidos.
 *   Nota: Los años bisiestos tienen 366 días en lugar de 365. Fueron bisiestos los años 1604,
 *   1608, 1612, 1616, …, 1988, 1992, 1996, 2000 (en total 97 años bisiestos).
 */
public class Ex03dap4 {
    public static void main(String[] args) {
            // apartado 1
            int vueltas400; // número de vueltas que dará la tierra en 400 años.
            vueltas400 = 365 * 400; // suponiendo que da una vuelta sobre sí misma cada 24 horas.
            // apartado 2
            // para esto, vamos a sumar las vueltas de los años bisiestos con las de los años no bisiestos.
                int vueltasSinBis; // vueltas sin años bisiestos, teniendo en cuenta que hay 302 años NO bisiestos.
                vueltasSinBis = 303 * 365;
                int vueltasConBis; // vueltas con años bisiestos, teniendo en cuenta que hay 97 años bisiestos.
                vueltasConBis = 97 * 366; // porque cada año son 366 días en vez de 365 días.
                int vueltasTotal; // número total de vueltas dadas entre esos años suponiendo los enunciados.
                vueltasTotal = vueltasConBis + vueltasSinBis;

        System.out.println("APARTADO 1: ");
        System.out.println("-------------");
        System.out.println("Sin tener en cuenta los años bisiestos, la tierra da "+vueltas400+" vueltas en 400 años.");
        System.out.println("APARTADO 2: ");
        System.out.println("-------------");
        System.out.printf("Desde el año 1601 al 2000, La Tierra dio "+ vueltasTotal +" vueltas.\nDe esas vueltas, "+vueltasConBis +" fueron de años bisiestos y "+ vueltasSinBis+" fueron de años NO bisiestos.");
  }   
}
