public class Pizza {
  private String tamaño;
  private String tipo;
  private String estado = "pedida";
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
  }
  public Pizza(String tamaño, String tipo) {
    this.tamaño = tamaño;
    this.tipo = tipo;
  }
}
