/**
 * @author David Antunez Perez
 *  Mejora el programa anterior de tal forma que se compruebe la validez de todos los datos
    introducidos. Si alguno de los datos es incorrecto, el programa debe seguir preguntando hasta
    que el usuario meta un dato correcto.
 */
public class Ex3_validate {
    public static void main(String[] args) {
        int color = 0; // nº de colores de la taza
        int keyring = 0; // tipo de llavero (1 o 2)
        double keyringPric = 0; // precio por llavero
        double cupPric = 0; // precio por taza
        int cant = 0; // cantidad de paquetes
        System.out.print("Introduzca la cantidad de paquetes que desea: ");
          cant = Integer.parseInt(System.console().readLine());
          if (cant < 20){
            System.out.println("ERROR. No es posible hacer un pedido de menos de 20 ud.");
            System.out.print("Introduzca la cantidad de paquetes que desea: ");
            cant = Integer.parseInt(System.console().readLine());
          }
          else if ((cant >= 20)&&(cant < 40)){
            cupPric = 4.90;
          }
          else if ((cant >= 40)&&(cant < 100)){
            cupPric = 3.90;
          }
          else if (cant >= 100) {
            cupPric = 3.20;
          }
  
        System.out.print("Número de colores de la impresión de la taza: ");
          color = Integer.parseInt(System.console().readLine());
          if (color <= 0){
            System.out.println("ERRROR, Por favor, introduzca un valor válido de color.");
            System.out.print("Número de colores de la impresión de la taza: ");
            color = Integer.parseInt(System.console().readLine());
          }
        System.out.printf("1) Llavero de plástico.\n2) Llavero metálico\n");
          keyring = Integer.parseInt(System.console().readLine()); 
          switch (keyring){
            case 1:
              if ( cant < 50){
                keyringPric = 2;
              }
              else{
                keyringPric = 1.50;
              }
            break;
            case 2:
              if ( cant < 50){
                keyringPric = 3;
              }
              else{
                keyringPric = 2.50;
              }
            break;
            default:
            System.out.println("Por favor, selecciona un tipo de llavero válido.");
            System.out.printf("1) Llavero de plástico.\n2) Llavero metálico\n");
            keyring = Integer.parseInt(System.console().readLine()); 
              switch (keyring){
                case 1:
                  if ( cant < 50){
                    keyringPric = 2;
                  }
                  else{
                    keyringPric = 1.50;
                  }
                break;
                case 2:
                  if ( cant < 50){
                    keyringPric = 3;
                  }
                  else{
                    keyringPric = 2.50;
                  }
                  default:
                  System.out.println("Por favor, selecciona un tipo de llavero válido.");
                }
        }
        System.out.println("PRESUPUESTO: ");
        System.out.println("--------------");
        
        if (color > 3){ 
          cupPric = 1.20 * cupPric; // para agregar el 20% más si hay más de 3 colores
        }
        double cupTotal = cupPric * cant; // total de tazas en euros
        double keyringTotal = keyringPric * cant; // total de llaveros en euros
        double noIva = keyringTotal + cupTotal; // total de tazas y llaveros
        double iva = noIva * 0.21;
        double total = noIva * 1.21;
        System.out.println("Taza ("+color+" col.): "+cant+" ud.");
        System.out.println("Precio unitario: "+cupPric+" €");
        System.out.println("Total tazas: "+cupTotal+" €");
        System.out.println("Llaveros (c.u.): "+keyringPric+" €");
        System.out.println("Total llaveros :"+keyringTotal+" €");
        System.out.println("Tazas + llaveros: "+noIva+" €");
        System.out.println("IVA: "+iva+" €");
        System.out.println("TOTAL: "+total+" €");
  }
}

