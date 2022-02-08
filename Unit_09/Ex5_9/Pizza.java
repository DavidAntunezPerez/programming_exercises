public class Pizza {
  private String tamano;
  private String tipo;
  private String estado = "pedida";
  private static int TotalPedidas = 0;
  private static int TotalServidas = 0;

  public String toString() {
    return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
  }
  public static int getTotalPedidas() {
    return Pizza.TotalPedidas;
  }
  
  public String getTamano() {
    return tamano;
  }
  public void setTamano(String tamano) {
    this.tamano = tamano;
  }
  public static void setTotalPedidas(int totalPedidas) {
    TotalPedidas = totalPedidas;
  }
  public int getTotalServidas() {
    return TotalServidas;
  }

  public void setTotalServidas(int totalServidas) {
    TotalServidas = totalServidas;
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
    this.tamano = tamaño;
    this.tipo = tipo;
    this.estado = estado;
    TotalPedidas++;
    if (estado == "servida") {
      TotalServidas++;
    }
  }

  public Pizza(String tamaño, String tipo) {
    this.tamano = tamaño;
    this.tipo = tipo;
    TotalPedidas++;
  }

  public void sirve() {
    if (this.estado == "servida") {
      System.out.println("La pizza ya ha sido servida antes.");
    } else {
      System.out.println("La pizza se ha servido.");
      this.estado = "servida";
      TotalServidas++;
    }
  }
}
