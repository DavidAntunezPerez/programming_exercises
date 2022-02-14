public class TarjetaRegalo {
  // Para que la tarjeta tenga un número aleatorio de 5 cifras (contando
  // decimales)
  private double saldo;
  private int id = (int) (Math.random() * 99999 + 10000);

  public double getSaldo() {
    return saldo;
  }

  @Override
  public String toString() {
    return "Nº: " + id + ", saldo: " + saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;
  }

  public void gasta(double n) {
    if (n > this.saldo) {
      System.out.println("ERROR, no queda dinero suficiente");
    } else {
      this.saldo -= n;
    }
  }

  public TarjetaRegalo fusionaCon(TarjetaRegalo t2) {
    TarjetaRegalo t3 = new TarjetaRegalo(this.saldo + t2.saldo);
    return t3;
  }
}