/**
 * @author David Antunez Perez
    Realiza un programa que calcule el precio de un desayuno. El programa
    preguntará primero qué ha tomado el usuario de comer: palmera, donut o
    pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
    programa debe preguntar además si era con aceite o con tortilla; el primero
    vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
    café a 1’50 y 1’20 respectivamente.
 */
public class Ex29 {
    public static void main(String[] args) {
        double eatPric = 0; // valor comida
        double drnkPric = 0; // valor bebida
        String eatNm = ""; // Nombre de la comida tomada
        String drinkNm = ""; // Nombre de la bebida tomada
        double total = 0; // Total a pagar
        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
            String eat = System.console().readLine();
            String ing = "";
            switch (eat){
                case "palmera":
                eatNm = "Palmera: ";
                eatPric = 1.40;
                break;
                case "donut":
                eatPric = 1.00;
                eatNm = "Donut: ";
                break;
                case "pitufo":
                System.out.print("¿Con qué se ha tomado el pitufo (aceite o tortilla)?: ");
                ing = System.console().readLine();
                    switch (ing){
                        case "aceite":
                        eatNm = "Pitufo con aceite: ";
                        eatPric = 1.20;
                        break;
                        case "tortilla":
                        eatNm = "Pitufo con tortilla: ";
                        eatPric = 1.60;
                        break;
                        default:
                    }
                default:
                System.out.println("Por favor, seleccione una comida válida");
            }
        System.out.print("¿Qué ha tomado de beber? (zumo o cafe): ");
            String drink = System.console().readLine();
            switch (drink){
                case "zumo":
                drinkNm = "Zumo: ";
                drnkPric = 1.50;
                break;
                case "cafe":
                drinkNm = "Cafe: ";
                drnkPric =1.20;
                break;
                default:
                System.out.println("Por favor, seleccione una bebida válida");
            }
            total = eatPric + drnkPric;
            System.out.println(eatNm+eatPric+" €");
            System.out.println(drinkNm+drnkPric+" €");
            System.out.println("Total: "+ total+" €");
  }  
}
