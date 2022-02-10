public class Persona {
  // métodos públicos y atributos privados
  public String nombre;
  private String telefono = String.valueOf((int) (Math.random() * 999999999 + 100000000));
  private static int saludosTotal = 0;

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public static int getSaludosTotal() {
    return saludosTotal;
  }

  public static void setSaludosTotal(int saludosTotal) {
    Persona.saludosTotal = saludosTotal;
  }

  public void saluda(String intensidad) {
    String chain = "Hola soy " + this.nombre;
    switch (intensidad) {
      case "fuerte":
        // PONEMOS EN MAYUSCULAS
        chain = chain.toUpperCase();
        break;
      case "debil":
        chain = chain.toLowerCase();
        break;
      default:
    }
    System.out.println(chain);
    Persona.saludosTotal++;
  }

  public void saluda() {
    System.out.println("Hola soy " + this.nombre);
    Persona.saludosTotal++;
  }

  public void dimeNumero() {
    System.out.println("Mi número es " + this.telefono);
  }

  // getter
  public String getNombre() {
    return this.nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
}