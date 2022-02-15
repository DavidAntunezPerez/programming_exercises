public class Estrella extends AnimalDeAcuario {
  // Declaramos las variables específicas para las Estrellas
  private int numBrazos;

  @Override
  public String toString() {
    return "Soy " + nombre + ", de color " + color + ", una estrella con " + numBrazos + " brazos.";
  }

  // Generamos el constructor
  public Estrella(String nombre, String color, int numBrazos) {
    super(nombre, color);
    this.numBrazos = numBrazos;
  }

  // Generamos los getters and setters
  public int getNumBrazos() {
    return numBrazos;
  }

  public void setNumBrazos(int numBrazos) {
    this.numBrazos = numBrazos;
  }

  // Declaramos el método de aparear estrellas
  public Estrella seApareaCon(Estrella a1) {
    // Declaramos primero todas las variables
    String criaNombre = "";
    int rNombre = (int) (Math.random() * 2 + 1);
    String criaColor = "";
    int rColor = (int) (Math.random() * 2 + 1);
    int criaBrazos = 0;
    int rBrazos = (int) (Math.random() * 2 + 1);
    // Aleatorizamos todos los datos
    switch (rNombre) {
      case 1:
        criaNombre = a1.nombre;
        break;
      case 2:
        criaNombre = this.nombre;
        break;
    }
    switch (rColor) {
      case 1:
        criaColor = a1.color;
        break;
      case 2:
        criaColor = this.color;
        break;
    }
    switch (rBrazos) {
      case 1:
        criaBrazos = a1.numBrazos;
        break;
      case 2:
        criaBrazos = this.numBrazos;
        break;
    }
    // Generamos la cria y la devolvemos
    Estrella a3 = new Estrella(criaNombre, criaColor, criaBrazos);
    return a3;
  }

}
