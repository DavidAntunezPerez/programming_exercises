public class Alumno {
  int numeroExpediente;
  String nombre;
  String apellidos;
  String telefono;
  String estudiosPrevios = "Bachillerato";
  int fechaNacimiento;
  boolean esRepetidor;

  public Alumno() {

  }

  public Alumno(int numeroExpediente, String nombre, String apellidos, String telefono, String estudiosPrevios,
      int fechaNacimiento, boolean esRepetidor) {
    // this significa el objeto al que hace referencia el método
    this.numeroExpediente = numeroExpediente; // lo de a la derecha del punt es el atributo
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.estudiosPrevios = estudiosPrevios;
    this.fechaNacimiento = fechaNacimiento;
    this.esRepetidor = esRepetidor;
  }

  public void saluda() {
    System.out.println("HOLA SOY " + this.nombre);
  }

  public void saluda(String intensidad) {
    String chain = "HOLA SOY " + this.nombre;
    switch (intensidad) {
      case "fuerte":
        // PONEMOS EN MAYUSCULAS
        chain.toUpperCase();
        break;
      case "debil":
        chain.toLowerCase();
        break;
      default:
    }
  }
}
