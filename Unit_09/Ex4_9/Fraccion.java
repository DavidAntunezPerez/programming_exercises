public class Fraccion {
  private double numerador;
  private double denominador;

  public double getNumerador() {
    return numerador;
  }

  public void setNumerador(double numerador) {
    this.numerador = numerador;
  }

  public double getDenominador() {
    return denominador;
  }

  public void setDenominador(double denominador) {
    this.denominador = denominador;
  }

  public Fraccion(double numerador, double denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }

  public double invierte() {
    return Math.pow((numerador / denominador), -1);
  }

  public Fraccion multiplica(double nMult) {
    return new Fraccion(this.numerador * nMult, this.denominador);
  }

  public Fraccion multiplica(Fraccion f) {
    return new Fraccion(this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
  }

  public void mostrar() {
    System.out.println("Mi numerador es " + this.numerador + " y mi denominador es " + this.denominador);
  }

  public static void main(String[] args) {
    Fraccion f1 = new Fraccion(5, 4);
    Fraccion f2 = new Fraccion(3, 4);
    System.out.println(f1.invierte());
    f1.multiplica(f2).mostrar();
    System.out.println(f2.multiplica(5));
  }
}
