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
            if (flavor == "chocolate"){
                System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
                    String type = System.console().readLine();
            }
        
        System.out.print("¿Quiere nata? (si o no): ");
            String cream = System.console().readLine();
        System.out.println("¿Quiere ponerle un nombre? (si o no): ");
            String name = System.console().readLine();
            double price = 0; // precio de la tarta sin adiciones
        switch (flavor){
            case "manzana":
            price = 18;
            break;
            case "fresa":
            price = 16;
            break;
            case "chocolate":
                
            break;
            default:
            System.out.println("Por favor, seleccione un sabor válido.");
        }
    }
    
}
