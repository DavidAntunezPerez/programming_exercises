public class Pecera {
  // Generamos las variables de la pecera
  private String nombre; // nombre de cada pecera
  private int capacidad; // capacidad en litros
  private static int numPec; // número de peces
  // Vamos a crear un array de peces para que nos guarde cada pez
  // private Pez[] pecesEnPecera = new Pez[capacidad * numPec];
  private static String presentaPeces = ""; // String de la presentacion de peces
  // Generamos el toString

  @Override
  public String toString() {
    return nombre + " de " + capacidad + " litros, contiene " + numPec + " peces: \n" + presentaPeces;
    // + pecesEnPecera.toString();
    // + presentaPez(pecesEnPecera);
  }

  // Generamos el constructor de Pecera
  public Pecera(String nombre, int capacidad) {
    this.nombre = nombre;
    this.capacidad = capacidad;
  }

  // Agregamos el método pez
  public void mete(Pez p1) {
    // Si hay más peces que 4 por litro, no lo agrega
    if (numPec >= capacidad * 4) {
      System.out.println("Pecera llena, no se pueden meter más peces");
    } else if (numPec < capacidad * 4) { // Si no, lo agrega al número de peces
      numPec++;
      // Hacemos que se agregue cada pez a la presentación
      presentaPeces += p1.toString() + "\n";
      // pecesEnPecera[numPec] = p1;
    }
  }
}

// // Vamos a crear un método para mostrar los peces de la pecera en el toString
// public void presentaPez(Pez[] p) {
// for (int i = 0; i < capacidad * 4; i++) {
// System.out.println(p[i].toString());
// }
// }
// }
