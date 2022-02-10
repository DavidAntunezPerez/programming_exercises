public class Coche extends Vehiculo{
  private static String matricula;

  public static String getMatricula() {
    return matricula;
  }

  public static void setMatricula(String matricula) {
    Coche.matricula = matricula;
  }

  public Coche() {
  }

  public void derrape(){
    System.out.println("FIUMMMM");
  }
}
