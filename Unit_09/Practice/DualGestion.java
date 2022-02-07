public class DualGestion {
  public static void main(String[] args) {
    System.out.println("DUAL GESTION");
    System.out.println("------------");
    Alumno Juan = new Alumno(1234, "Juan", "Juanez Juanez", "610662934", "Bachillerato", 1983, true);
    Alumno Joseph = new Alumno();
    Alumno Manolo = new Alumno();

    System.out.println(Juan.apellidos);
    Juan.saluda();
    Manolo.saluda();
    Manolo.dimeNumero();
    Juan.saluda("debil");
    System.out.println(Joseph.getNombre()); 
    Manolo.setTelefono("666666666");
    System.out.println(Manolo.getTelefono());
    Sysout.println(profe1.saluda());
  }
}
