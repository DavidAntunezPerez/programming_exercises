/**
 * @author David Antunez Perez
 *Escribe un programa que calcule el precio final de un producto según su
 *base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 *reducido o superreducido) y el código promocional. Los tipos de IVA general,
 *reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 *promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 *respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 *se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 *muestran los valores correctos, aunque los números no estén tabulados.
 */

public class Ex23 {
    public static void main(String[] args) {
        System.out.print("Introduzca la base imponible: ");
        double base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String iva = System.console().readLine();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String prom = System.console().readLine();
        double cantProm = 0; // cantidad que descuenta la promoción.
        double cantIva = 0; // cantidad de iva que se agregará.
        int nomIva = 0; // número marcado en el ticket como IVA.
        double desProm = 0; // descuento de la promoción
        
        
        switch(prom){
            case "nopro":
            //no se aplica promoción
            break;
            case "mitad":
                cantProm = 0.5;
            break;
            case "meno5":
                cantProm = 5;
            break;
            case "5porc":
                cantProm = 0.05;
            break;
            default:
            System.out.println("'"+prom+"' no es un código promocional válido. Por favor, ingrese uno válido.");
        }
        
        switch (iva){
            case "general":
                cantIva = 1.21;
                nomIva = 21;

            break;
            case "reducido":
                cantIva = 1.1;
                nomIva = 10;
            break;
            case "superreducido":
                cantIva = 1.04;
                nomIva = 4;
            break;
        }
        double resIva = (cantIva * base) - base; // iva agregado a la base
        double masIva = resIva + base; // base  + iva
        
        if(prom != "meno5"){
            desProm = cantProm * base;
        }
        else if (prom == "meno5"){
            desProm = (base+resIva) - cantProm;
        }
        double result = base + resIva - desProm; // resultado final (total)
        System.out.println("Base imponible             "+ base);
        System.out.println("IVA("+nomIva+"%)         "+ resIva);
        System.out.println("Precio con IVA            "+masIva);
        System.out.println("Cód. promo.("+prom+")   -"+desProm);
        System.out.println("TOTAL                     "+result);
    }
}
