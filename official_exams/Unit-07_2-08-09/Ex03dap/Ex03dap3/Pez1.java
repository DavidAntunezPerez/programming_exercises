public class Pez1 extends AnimalDeAcuario1 {
  // Declaramos las variables específicas para los peces
  private String raza;

  // Generamos los getters and setters
  public String getRaza() {
    return raza;
  }
  // Generamos el toString

  @Override
  public String toString() {
    return "Soy " + nombre + ", de color " + color + " y soy un pez " + raza + ".";
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  // Generamos el constructor
  public Pez1(String nombre, String color, String raza) {
    super(nombre, color);
    this.raza = raza;
  }

  // Declaramos el método de aparear peces
  public Pez1 seApareaCon(Pez1 a1) {
    // Declaramos primero todas las variables
    String criaNombre = "";
    int rNombre = (int) (Math.random() * 2 + 1);
    String criaColor = "";
    int rColor = (int) (Math.random() * 2 + 1);
    String criaRaza = "";
    int rRaza = (int) (Math.random() * 2 + 1);
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
    switch (rRaza) {
      case 1:
        criaRaza = a1.raza;
        break;
      case 2:
        criaRaza = this.raza;
        break;
    }
    // Generamos la cria y la devolvemos
    Pez1 a3 = new Pez1(criaNombre, criaColor, criaRaza);
    return a3;
  }

}
