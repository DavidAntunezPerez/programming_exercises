public class Ameba {
  private int peso = 3; // en microgramos

  @Override
  public String toString() {
    return "Soy una ameba y peso " + this.peso + " microgramos";
  }

  public Ameba() {
    this.peso = 3;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public void come(int n) {
    this.peso += n;
    this.peso -= 1;
  }

  public void come(Ameba a) {
    this.peso += a.peso;
    a.peso = 0;
    this.peso -= 1;
  }

}
