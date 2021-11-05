/**
 * @author David Antunez Perez
 *  La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
 *  máxima calidad y nos ha pedido hacer un configurador que calcule el precio
 *   según el alto y el ancho. El precio base de una bandera es de un céntimo de
 *  euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
 *  se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
 *  son 3.25 €. El IVA ya está incluido en todas las tarifas.

*/
public class Ex25_4 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la bandera en cm: ");
        double height = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la anchura de la bandera en cm: ");
        double width = Integer.parseInt(System.console().readLine());
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        String shield = System.console().readLine();
        System.out.println("Gracias por su colaboración. Aquí tiene el desglose de su compra: ");
        double area = height * width;
        String nomShield = "Sin";
        double pricShield = 0;
        switch(shield){
            case "s":
            case "S":
            case "si":
            case "SI":
            case "Si":
                nomShield = "Con";
                pricShield = 2.50;
            break;
            case "n":
            case "N":
            case "No":
            case "no":
            case "NO":
                nomShield = "Sin";
                pricShield = 0;
            break;
            default:
            System.out.println("Por favor, seleccione una opción válida. Al no ser válido interpretamos un no.");
        }
            double pricFlag = area * 0.01;
            double total = pricFlag + pricShield+3.25;
        System.out.println(" ");
        System.out.println("Bandera de "+area+" cm2: "+pricFlag+" €");
        System.out.println(nomShield+" escudo: "+pricShield+" €");
        System.out.println("Gastos de envio: 3.25 €");
        System.out.println("Total: "+total+" €");

 }
}
