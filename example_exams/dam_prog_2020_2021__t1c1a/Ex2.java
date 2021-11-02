/**
 * @author David Antunez Perez
 * Una empresa de promociones comerciales nos ha pedido hacer un programa que sea capaz
    de elaborar presupuestos de paquetes de regalo compuestos por tazas y llaveros
    personalizados. Todos los paquetes promocionales llevan una taza y un llavero. Los precios
    dependen de la cantidad de paquetes que se pidan, del número de colores del logotipo
    impreso en las tazas y del material del llavero. En un presupuesto no se mezclan llaveros de
    distintos materiales ni tazas con distinto número de colores. El pedido mínimo son 20
    paquetes. Suponemos que el usuario introduce correctamente todos los datos. En este
    ejercicio no hay que comprobar la validez de los mismos. A la cantidad final hay que sumarle
    el IVA del 21%. Las tarifas se detallan a continuación:
    • El precio de cada taza es de 4,90 € para pedidos de entre 20 y 39 paquetes.
    • El precio de cada taza es de 3,90 € para pedidos de entre 40 y 99 paquetes.
    • El precio de cada taza es de 3,20 € para pedidos de 100 o más paquetes.
    • Los precios anteriores se aplican si la taza va impresa con 1, 2 o 3 colores. Si la taza se
    imprime con más de 3 colores sale un 20% más cara, dando igual que sean 4, 5, 6 o
    más colores.
    • Cada llavero de plástico cuesta 2 € para pedidos de menos de 50 unidades y 1,50 €
    para pedidos de 50 o más unidades.
    • Cada llavero metálico cuesta 3 € para pedidos de menos de 50 unidades y 2,50 € para
    pedidos de 50 o más unidades.
 */
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Introduzca la cantidad de paquetes que desea: ");
          int cant = Integer.parseInt(System.console().readLine());
        System.out.println("Número de colores de la impresión de la taza: ");
          int color = Integer.parseInt(System.console().readLine());
        System.out.printf("1) Llavero de plástico.\n2) Llavero metálico.");
          int keyring = Integer.parseInt(System.console().readLine()); 
        System.out.println("PRESUPUESTO: ");
        System.out.println("--------------");
        
        

        System.out.println("Taza ("+color+" col.): "+);
        System.out.println("Precio unitario: "+);
        System.out.println("Total tazas: "+);
        System.out.println("Llaveros (c.u.): "+);
        System.out.println("Tazas + llaveros: "+);
        System.out.println("IVA: "+);
        System.out.println("TOTAL: "+);
  }
}
