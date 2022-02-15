public class Movil extends Terminal {
  private String tarifa;
  private double costeTotal;

  public Movil(String id, String tarifa) {
    super(id);
    this.tarifa = tarifa;
    this.costeTotal = 0;
  }

  @Override
  public String toString() {
    return "Nº " + getId() + " - " + getTiempo() + "s de conversación" + " - tarificados " + this.costeTotal + " euros";
  }

  @Override
  public void llama(Terminal t, int time) {
    super.llama(t, time);
    double minutos = (double) time / 60;

    switch (this.tarifa) {
      case "rata":
        this.costeTotal += minutos * 0.06;
        break;
      case "mono":
        this.costeTotal += minutos * 0.12;
        break;
      case "bisonte":
        this.costeTotal += minutos * 0.30;
        break;
      default:
    }
  }
}
