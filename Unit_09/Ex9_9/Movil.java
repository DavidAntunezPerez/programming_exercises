public class Movil extends Terminal {
  private String tarifa;
  private double costeTotal;

  public Movil(String id, String tarifa) {
    super(id);
    this.tarifa = tarifa;
  }

  @Override
  public String toString() {
    return "Nº " + getId() + " - " + getTiempo() + "s de conversación"+ " - tarificados "+ getCosteTotal();
  }

  public String getTarifa() {
    return tarifa;
  }

  public void setTarifa(String tarifa) {
    this.tarifa = tarifa;
  }

  public double getCosteTotal() {
    if (this.tarifa.equals("rata")) {
      costeTotal = 0.06 * getTiempo();
    } else if (this.tarifa.equals("mono")) {
      costeTotal = 0.12 * getTiempo();
    } else if (this.tarifa.equals("bisonte")) {
      costeTotal = 0.30 * getTiempo();
    }
    return costeTotal;
  }

}
