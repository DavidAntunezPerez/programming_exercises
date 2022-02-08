public class Pizza {
  private static String tamaño;
  private static String tipo;
  private static String estado = "pedida";
  private static int TotalPedidas = 0;
  private static int TotalServidas = 0;
  public static int getTotalPedidas() {
    return TotalPedidas;
  }
  public void setTotalPedidas(int totalPedidas) {
    TotalPedidas = totalPedidas;
  }
  public static int getTotalServidas() {
    return TotalServidas;
  }
  public void setTotalServidas(int totalServidas) {
    TotalServidas = totalServidas;
  }
  public String getTamaño() {
    return tamaño;
  }
  public void setTamaño(String tamaño) {
    this.tamaño = tamaño;
  }
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public String getEstado() {
    return estado;
  }
  public void setEstado(String estado) {
    this.estado = estado;
  }
  public Pizza(String tamaño, String tipo, String estado) {
    this.tamaño = tamaño;
    this.tipo = tipo;
    this.estado = estado;
    TotalPedidas++;
    if(estado == "servida"){
      TotalServidas++;
    }
  }
  public Pizza(String tamaño, String tipo) {
    this.tamaño = tamaño;
    this.tipo = tipo;
    TotalPedidas++;
  }
}
