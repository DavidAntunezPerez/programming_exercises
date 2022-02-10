public class Vehiculo {
  private static int kilometrosTotales;
  private static int vehiculosCreados;
  String nombre;
  private int kilometrosRecorridos;

  // GETTERS AND SETTERS
  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public static void setKilometrosTotales(int kilometrosTotales) {
    Vehiculo.kilometrosTotales = kilometrosTotales;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public static void setVehiculosCreados(int vehiculosCreados) {
    Vehiculo.vehiculosCreados = vehiculosCreados;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }
  // FIN GETTERS AND SETTERS
  public void recorre(int km){
    this.kilometrosRecorridos += km;
    Vehiculo.kilometrosTotales += km;
  }
}
