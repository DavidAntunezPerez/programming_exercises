import java.util.Date;

public class Alumno {
  int numeroExpediente;
  String nombre;
  String apellidos;
  String telefono;
  String estudiosPrevios = "Bachillerato";
  Date fechaNacimiento;
  boolean esRepetidor;
  
  public Alumno(int numeroExpediente, String nombre, String apellidos, String telefono, String estudiosPrevios,
      Date fechaNacimiento, boolean esRepetidor) {
    this.numeroExpediente = numeroExpediente;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.estudiosPrevios = estudiosPrevios;
    this.fechaNacimiento = fechaNacimiento;
    this.esRepetidor = esRepetidor;
  }

  
}
