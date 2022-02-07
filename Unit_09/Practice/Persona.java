public class Persona {
  String dni;
  String nombre;
  String apellidos;
  String telefono = String.valueOf((int) (Math.random() * 999999999 + 100000000));
  int fechaNacimiento;
  String domicilio;

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
}