/**
 * @author David Antunez Perez
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
 * de proyecto), los días que ha estado de viaje visitando clientes durante el
 * mes y su estado civil (1 - Soltero, 2 - Casado).
 * • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 * si se trata de un prog. junior, un prog. senior o un jefe de proyecto
 * respectivamente.
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en
 * concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
 * un 25% en caso de estar soltero y un 20% en caso de estar casado.
 */
public class Ex24 {
    public static void main(String[] args) {
        System.out.println("1 - Prog. Junior");
        System.out.println("2 - Prog. Senior");
        System.out.println("3 - Jefe Proyecto");
        System.out.print("Introduzca el cargo del empleado(1 - 3): ");
            int job = Integer.parseInt(System.console().readLine());
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
            int day = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el estado civil (1 - Soltero, 2 - Casado): ");
            int stat = Integer.parseInt(System.console().readLine());
            double base = 0;
            double diet = day * 30;
            double irpf = 0;
            double neto = 0;
        switch (job){
            case 1:
                base = 950;
            break;
            case 2:
                base = 1200;
            break;
            case 3:
                base = 1600;
            break;
            default:
            System.out.println("Por favor, introduzca un valor válido.");
        }
        switch (stat){
            case 1:
                irpf = 0.25 * base;
            break;
            case 2:
                irpf = 0.2 * base;
            break;
            default:
            System.out.println("Porfavor, introduzca un valor válido.");
        }
            double bruto = base + diet;
            neto = bruto - irpf;
            System.out.println("--------------------------------------");
            System.out.println("Sueldo base: "+base );
            System.out.println("Dietas ("+day+" viajes): "+diet);
            System.out.println("--------------------------------------");
            System.out.println("Sueldo bruto: "+bruto);
            System.out.println("Retención IRPF: "+irpf);
            System.out.println("--------------------------------------");
            System.out.println("Sueldo neto: "+neto);
  }
}
