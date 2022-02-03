package Ex03dap;

/**
 * @author David Antunez Perez 1º DAM , 14/12/21
 */
public class Ex03dap4 {
  public static void main(String[] args) {
    // Declaramos las variables
    int entr = (int) (Math.random() * 3 + 1); // Número aleatoria para el entrante
    int princ = (int) (Math.random() * 3 + 1); // Número para el plato principal
    int post = (int) (Math.random() * 3 + 1); // Número para el postre
    String nomEntr = ""; // Variable nombre del entrante
    String nomPrinc = ""; // Variable nombre del principal
    String nomPost = ""; // Variable nombre del postre
    boolean arroz = false; // Identificar si se repite arroz en el postre
    // Unimos cada valor aleatorio con su nombre
    // Entrantes
    switch (entr) {
      case 1:
        nomEntr = "tomate y mozarella";
        break;
      case 2:
        nomEntr = "rúcula y queso de cabra";
        break;
      case 3:
        nomEntr = "envidias con nueces y miel";
        break;
    }
    // Platos principales
    switch (princ) {
      case 1:
        nomPrinc = "arroz al curry";
        arroz = true;
        break;
      case 2:
        nomPrinc = "quinoa con verduras";
        break;
      case 3:
        nomPrinc = "espagetis al peso";
        break;
    }
    // Postres
    // Hacemos que se cambie el valor de arroz con leche en caso de que salga arroz con curry
    if ((arroz) && (post == 1)) {
      do {
        post = (int) (Math.random() * 3 + 1);
        if (post != 1) {
          arroz = false;
        }
      } while (arroz);
    }
    switch (post) {
      case 1:
        nomPost = "arroz con leche";
        break;
      case 2:
        nomPost = "natillas";
        break;
      case 3:
        nomPost = "tarta de chocolate";
        break;
    }
    // Mostramos los menús aleatorios por pantalla
    System.out.println("Menú del día");
    System.out.println("------------");
    System.out.println(nomEntr);
    System.out.println(nomPrinc);
    System.out.println(nomPost);
  }
}
