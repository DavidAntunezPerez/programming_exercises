/**
 * @author David Antúnez Pérez
 *  Una empresa textil que realiza polos personalizados para trabajadores, asociaciones y clubes
 *  nos ha pedido hacer un programa que sea capaz de elaborar presupuestos. El precio de cada
 *  polo depende de si se piden en blanco o en color, de la cantidad que se pida y del tipo de
 *  técnica que se emplee para el logotipo, que puede ser serigrafía o bordado. En un
 *  presupuesto no se mezclan distintos colores o técnicas. El pedido mínimo son 20 polos.
 *  Suponemos que el usuario introduce correctamente todos los datos. En este ejercicio no hay
 *  que comprobar la validez de los mismos. A la cantidad final hay que sumarle el IVA del 21%.
 */
public class Ex03dap3 {
    public static void main(String[] args) {
        int polos; // número de polos 
        int color; // tipo de polo (a color o blanco)
        int type; // tipo de polo (bordado o serigrafía)
        String nomColor = "?"; // nombre del tipo de polo (o blanco o color).
        double precPolo = 0; // precio por cada unidad de polo.
        double typePric = 0; // precio del tipo de polo (bordador o serigrafía)
        double typeUd = 0; // precio tipo de polo (bordador o serigrafía) por ud.
        String nomTipo = "?"; // nombre del tipo de polo (bordador o serigrafía)
        
        
        System.out.print("Introduzca el número de polos que desea: ");
            polos = Integer.parseInt(System.console().readLine());
        
            if (polos >= 100){
                precPolo = 3.20;
            }
            else if ((polos < 100)&&(polos >= 40)){
                precPolo = 3.90;
            }
            else if ((polos < 40)&&(polos >= 20)){
                precPolo = 4.90;
            }
            else {
                System.out.println("ERROR. El encargo no puede ser menor de 20 ud. Su presupuesto no séra válido.");
            }
        System.out.printf("\n1) blanco\n2) color\n");
            color = Integer.parseInt(System.console().readLine());
            switch (color){
                case 1:
                    nomColor = "blanco";
                break;
                case 2:
                    nomColor = "color";
                    precPolo = 1.20 * precPolo;
                break;
                default:
                System.out.println("Por favor, seleccione un valor para el tipo de polo válido. Su presupuesto no será válido.");
            }
        System.out.printf("\n1) serigrafía\n2) bordado\n");
            type = Integer.parseInt(System.console().readLine());
            
            switch (type){
                case 1:
                    nomTipo = "Serigrafía";
                    if (polos < 50) {
                        typePric = 2 * polos;
                        typeUd = 2;
                    }
                    else if (polos >=50){
                        typePric = 1.5 * polos;
                        typeUd = 1.5;
                    }
                break;
                case 2:
                    nomTipo = "Bordado";
                    if (polos <50){
                        typePric = 3 * polos;
                        typeUd = 3;
                    }
                    else if (polos >= 50){
                        typePric = 2.5 * polos;
                        typeUd = 2.5;
                    }

                break;
                default:
                System.out.println("Por favor, seleccione un valor para el tipo de polo válido. Su presupuesto no será válido.");
            }


          double totalPolo = polos * precPolo; // precio total solo del valor textil
          double poloMasTipo = typePric + totalPolo;
          double iva = 0.21 * poloMasTipo;
          double total = poloMasTipo * 1.21;
        System.out.println("EL POLO BONITO - PRESUPUESTO: ");
        System.out.println("Polo en "+ nomColor+" (ud.): "+polos);
        System.out.println("Precio unitario: "+ precPolo +" €");
        System.out.println("Total textil: "+ totalPolo );
        System.out.println(nomTipo+" (ud.): "+typeUd+" €");
        System.out.println(nomTipo+" : "+typePric+" €");
        System.out.println("Polo más logotipo: "+poloMasTipo+" €");
        System.out.println("IVA: "+iva+" €");
        System.out.println("TOTAL: "+total+" €");
        
  }
}
