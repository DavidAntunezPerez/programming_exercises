public class Alumno extends Persona{
  int numeroExpediente;
  String apellidos;
  String telefono = String.valueOf((int) (Math.random() * 999999999 + 100000000));
  String estudiosPrevios = "Bachillerato";
  int fechaNacimiento;
  boolean esRepetidor;

  public Alumno() {
  }

  public Alumno(int numeroExpediente, String nombre, String apellidos, String telefono, String estudiosPrevios,
      int fechaNacimiento, boolean esRepetidor) {
    // this significa el objeto al que hace referencia el método
    this.numeroExpediente = numeroExpediente; // lo de a la derecha del punt es el atributo
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.estudiosPrevios = estudiosPrevios;
    this.fechaNacimiento = fechaNacimiento;
    this.esRepetidor = esRepetidor;
    this.nombre = nombre;
  }
  
}
