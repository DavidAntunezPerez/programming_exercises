/**
 * @author David Antunez Perez
 * 
 *   Realiza un programa que calcule el precio de unas entradas de cine en función
 *   del número de personas y del día de la semana. El precio base de una entrada
 *   son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
 *   jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
 *   Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
 *   grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
 *   que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
 *   1 individual que son 41 euros (33 + 8).
 */
public class Ex26 {
    public static void main(String[] args) {
        System.out.println("COMPRE SU ENTRADA");
        System.out.println("------------------");
        System.out.print("Nº de entradas: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.print("Día de la semana: ");
        String day = System.console().readLine();
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        String ticket = System.console().readLine();
        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        double ticketPric = 8;
        String nomDis = "No";
        double dis = 0;
        switch(day){
            case "miercoles":
            case "Miercoles":
            case "MIERCOLES":
            case "miércoles":
            case "MIÉRCOLES":
            case "Miércoles":
            ticketPric = 5;
            break;
            case "Jueves":
            case "jueves":
            case "JUEVES":
                
            break;
        }
        double total = num * ticketPric;
        switch (ticket){
            case "s":
            dis = total * 0.1;
            nomDis = "10%";
                break;
                default:
                nomDis = "No";
        }
        
        double toPay = total - dis;
        System.out.println("Nº entradas: "+num);
        System.out.println("Precio por entrada: "+ticketPric+" €");
        System.out.println("Total: "+total+" €");
        System.out.println("Descuento("+nomDis+"): "+dis+" €");
        System.out.println("A pagar: "+toPay+" €");
    }
}
