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
        // this significa el objeto al que hace referencia el método
    this.numeroExpediente = numeroExpediente; // lo de a la derecha del punt es el atributo
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.estudiosPrevios = estudiosPrevios;
    this.fechaNacimiento = fechaNacimiento;
    this.esRepetidor = esRepetidor;
  }

  
}
