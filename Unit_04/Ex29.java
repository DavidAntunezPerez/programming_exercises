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
        
        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
            String eat = System.console().readLine();
            String ing = "";
        if (eat == "pitufo"){
            System.out.println("¿Con qué se ha tomado el pitufo (aceite o tortilla)?: ");
            ing = System.console().readLine();
        }
        System.out.print("¿Qué ha tomado de beber? (zumo o cafe): ");
            String drink = System.console().readLine();
        double eatPric = 0; // valor comida
        double drnkPric = 0; // valor bebida
        String eatNm = ""; // Nombre de la comida tomada
        String drinkNm = ""; // Nombre de la bebida tomada
            switch (eat){
                case "palmera":
                eatNm = "palmera";
                eatPric = 1.40;
                break;
                case "donut":
                eatPric = 1.00;
                eatNm = "donut";
                break;
                case "pitufo":
                    switch (ing){
                        case "aceite":
                        eatNm = "pitufo con aceite";
                        eatPric = 1.20;
                        break;
                        case "tortilla":
                        eatNm = "pitufo con tortilla";
                        eatPric = 1.60;
                        break;
                        default:
                    }
                default:
                System.out.println("Por favor, seleccione una comida válida");
            }
            switch (drink){
                case "zumo":
                drinkNm = "zumo";
                drnkPric = 1.50;
                break;
                case "cafe":
                drinkNm = "cafe";
                drnkPric =1.20;
                break;
                default:
                System.out.println("Por favor, seleccione una bebida válida");
            }
  }  
}
