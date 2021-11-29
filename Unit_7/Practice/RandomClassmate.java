public class RandomClassmate {
  public static void main(String[] args) {
    // Hacemos un Array con la lista de la clase
    String[] classmates = { "Aguilera Martín, Diego", "Andrés Domínguez, Javier", "Antúnez Pérez, David",
        "Benítez Ruíz, Jose Antonio", "Castillo Muñoz, Natalia", "Cueto Jiménez, Alejandro", "Dominguez Gomez, Sergio",
        "Egea Hermoso, Adrián", "García Campoy, Daniel", "González Pons, Verónica", "Linero Fernández, Álvaro",
        "Morales García, Sergio", "Moreno González, Alberto", "Moreno Rodríguez, Javier", "Parra Toval, Alberto",
        "Rodríguez Barcos, Diego", "Servia Morales, David", "San Juan Thomnmpson, Joseph Luca",
        "Sicilia Pérez, Francisco Javier" };
    // Hacemos que se muestre en pantalla el alumno de forma aleatoria
    System.out.print("El alumno seleccionado es ");
    Thread.sleep(1000);
    System.out.print(classmates[(int) (Math.random() * classmates.length)]);
  }
}
