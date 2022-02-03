package Ex03dap;

/**
 * @author David Antunez Perez
 *  Escribe un programa que traduzca cada uno de los números de un PIN de 4 dígitos
 *  introducido por el usuario a su correspondiente palabra. Si el usuario introduce un número de
 *  menos de 4 dígitos, se entiende que el PIN tiene ceros a la izquierda hasta completar esos 4
 *  dígitos.
 */
public class Ex03dap1 {
    public static void main(String[] args) {
        System.out.print("Introduzca un código PIN: ");
        int pin = Integer.parseInt(System.console().readLine());
        String cifCuatro = " cero";
        String cifTres = " cero ";
        String cifDos = " cero ";
        String cifUno = "cero ";
        int cif4 = pin % 10;
        int cif3 = (pin / 10) % 10;
        int cif2 = (pin / 100) % 10;
        int cif1 = pin / 1000;
        
        switch (cif4){
            case 1:
            cifCuatro = " uno";
            break;
            case 2:
            cifCuatro = " dos";
            break;
            case 3:
            cifCuatro = " tres";
            break;
            case 4:
            cifCuatro = " cuatro";
            break;
            case 5:
            cifCuatro = " cinco";
            break;
            case 6:
            cifCuatro = " seis";
            break;
            case 7:
            cifCuatro = " siete";
            break;
            case 8:
            cifCuatro = " ocho";
            break;
            case 9:
            cifCuatro = " nueve";
            break;
            default:
            cifCuatro = " ???";
        }
        switch (cif2){
            case 1:
            cifDos = " uno";
            break;
            case 2:
            cifDos = " dos";
            break;
            case 3:
            cifDos = " tres";
            break;
            case 4:
            cifDos = " cuatro";
            break;
            case 5:
            cifDos = " cinco";
            break;
            case 6:
            cifDos = " seis";
            break;
            case 7:
            cifDos = " siete";
            break;
            case 8:
            cifDos = " ocho";
            break;
            case 9:
            cifDos = " nueve";
            break;
            default:
            cifDos = " ???";
        }
        switch (cif3){
            case 1:
            cifTres = " uno";
            break;
            case 2:
            cifTres = " dos";
            break;
            case 3:
            cifTres = " tres";
            break;
            case 4:
            cifTres = " cuatro";
            break;
            case 5:
            cifTres = " cinco";
            break;
            case 6:
            cifTres = " seis";
            break;
            case 7:
            cifTres = " siete";
            break;
            case 8:
            cifTres = " ocho";
            break;
            case 9:
            cifTres = " nueve";
            break;
            default:
            cifTres = " ???";
        }
        switch (cif1){
            case 1:
            cifUno = " uno";
            break;
            case 2:
            cifUno = " dos";
            break;
            case 3:
            cifUno = " tres";
            break;
            case 4:
            cifUno = " cuatro";
            break;
            case 5:
            cifUno = " cinco";
            break;
            case 6:
            cifUno = " seis";
            break;
            case 7:
            cifUno = " siete";
            break;
            case 8:
            cifUno = " ocho";
            break;
            case 9:
            cifUno = " nueve";
            break;
            default:
            cifUno = " ???";
        }
            

        System.out.println(cifUno+cifDos+cifTres+cifCuatro);
  }
}