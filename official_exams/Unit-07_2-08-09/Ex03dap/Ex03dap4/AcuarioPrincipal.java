public class AcuarioPrincipal {
  // Contenido del main
  public static void main(String[] args) {
    Pez pepe = new Pez("Pepe", "azul", "globo");
    Pez casilda = new Pez("Casilda", "naranja", "tropical");
    Pecera miPecerilla = new Pecera("Pecerilla", 2);
    miPecerilla.mete(pepe);
    miPecerilla.mete(casilda);
    for (int i = 0; i < 6; i++) {
      miPecerilla.mete(new Pez("Sara", "amarillo", "guppy"));
    }
    System.out.println(miPecerilla);
    miPecerilla.mete(new Pez("Intruso", "rosa", "gurami"));

  }
}
