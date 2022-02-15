public class Acuario {
  // Contenido del main
  public static void main(String[] args) {
    Pez pepe = new Pez("Pepe", "azul", "globo");
    Pez casilda = new Pez("Casilda", "naranja", "tropical");
    System.out.println(pepe);
    System.out.println(casilda);
    Estrella lola = new Estrella("Lola", "violeta", 6);
    Estrella rodolfo = new Estrella("Rodolfo", "verde", 7);
    System.out.println(lola);
    System.out.println(rodolfo);
    // Apareamiento
    Pez pececillo = pepe.seApareaCon(casilda);
    Estrella estrellita = lola.seApareaCon(rodolfo);
    System.out.println(pececillo);
    System.out.println(estrellita);

  }
}
