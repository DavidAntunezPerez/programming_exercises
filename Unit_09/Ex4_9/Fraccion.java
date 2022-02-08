public class Fraccion {
  private double numerador;
  private double denominador;
  
  public Fraccion(double numerador, double denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }
  public double invierte(double numerador, double denominador) {
    return Math.pow((numerador / denominador), -1);
  }
  public static void main(String[] args) {
    Fraccion f1 = new Fraccion(5 , 4);
    System.out.println(f1.invierte(5, 4));
  }
}
