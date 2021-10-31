/**
 * @author David Antunez Perez
 *  Una pastelería nos ha pedido realizar un programa que haga presupuestos de
    tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
    manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
    16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
    además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
    segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
    nombre; la nata suma 2.50 y la escritura del nombre 2.75.

 */
public class Ex27 {
    public static void main(String[] args) {
        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
            String flavor = System.console().readLine();
            String type = ""; 
            switch (flavor){
                case "chocolate":
                System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
                    type = System.console().readLine();
                    break;
                default:
            }

        System.out.print("¿Quiere nata? (si o no): ");
            String cream = System.console().readLine();
        System.out.print("¿Quiere ponerle un nombre? (si o no): ");
            String name = System.console().readLine();
            double price = 0; // precio de la tarta sin adiciones
            String cake = "???"; // nombre de la tarta en el ticket
        switch (flavor){
            case "manzana":
            price = 18;
            cake = "manzana";
            break;
            case "fresa":
            price = 16;
            cake = "fresa";
            break;
            case "chocolate":
                switch (type){
                    case "negro":
                    cake = "chocolate negro";
                    price = 14;
                    break;
                    case "blanco":
                    price = 15;
                    cake = "chocolate blanco";
                    break;
                    default:
                    System.out.println("Seleccione un sabor válido.");
                }
            break;
            default:
            System.out.println("Por favor, seleccione un sabor válido.");
        }
        System.out.println("Tarta de "+cake+": "+price);
        switch(cream){
            case "si":
            System.out.println("Con nata: 2.50 €");
            price = price + 2.50;
            break;
            default:
        }
        switch (name){
            case "si":
            System.out.println("Con nombre: 2.75 €");
            price = price + 2.75;
            break;
            default:
        }
        System.out.println("Total: "+price);
    }
}