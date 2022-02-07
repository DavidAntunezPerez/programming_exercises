public class Persona {
  // métodos públicos y atributos privados
  private String dni;
  private String nombre;
  private String apellidos;
  private String telefono = String.valueOf((int) (Math.random() * 999999999 + 100000000));
  private int fechaNacimiento;
  private String domicilio;

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
  }

  public void saluda() {
    System.out.println("Hola soy " + this.nombre);
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