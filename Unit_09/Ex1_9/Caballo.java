/**
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos
 */
public class Caballo {
  private String nombre;
  private String raza;
  private String fechNac;

  public void review() {
    System.out
        .println("Hola, soy el caballo " + this.nombre + ", soy de raza " + this.raza + " y nací el " + this.fechNac);
  }

  public void darCarrera() {
    // El caballo camina una distancia aleatoria
    System.out.println("El caballo ha caminado " + (int) (Math.random() * 1000 + 1) + "m");
  }

  public Caballo(String nombre, String raza, String fechNac) {
    this.nombre = nombre;
    this.raza = raza;
    this.fechNac = fechNac;
  }

  public Caballo() {

  }

  public static void main(String[] args) {
    Caballo Juan = new Caballo();
    Juan.darCarrera();
    Caballo Pepe = new Caballo("Pepito", "puro", "2018");
    Pepe.review();
  }
}
