package Practice;
public class RandomClassmate {
  public static void main(String[] args) throws Exception {
    // Hacemos un Array con la lista de la clase
    String[] classmates = { "Aguilera Martín, Diego", "Andrés Domínguez, Javier", "Antúnez Pérez, David",
        "Benítez Ruíz, Jose Antonio", "Castillo Muñoz, Natalia", "Cueto Jiménez, Alejandro", "Dominguez Gomez, Sergio",
        "Egea Hermoso, Adrián", "García Campoy, Daniel", "González Pons, Verónica", "Linero Fernández, Álvaro",
        "Morales García, Sergio", "Moreno González, Alberto", "Moreno Rodríguez, Javier", "Parra Toval, Alberto",
        "Rodríguez Barcos, Diego", "Servia Morales, David", "San Juan Thomnmpson, Joseph Luca",
        "Sicilia Pérez, Francisco Javier" };
    // Hacemos que se muestre en pantalla el alumno de forma aleatoria
    System.out.print("El alumno seleccionado es ");
    for (int i = 0; i < 7; i++) {
      System.out.printf(".");
      Thread.sleep(200 * i);
    }
    String[] colors = { "\033[32m", "\033[33m", "\033[34m", "\033[35m", "\033[36m", "\033[37m", "\033[38m" };
    String color = colors[(int) (Math.random() * colors.length)];
    System.out.print("" + color + classmates[(int) (Math.random() * classmates.length)]);
  }
}
