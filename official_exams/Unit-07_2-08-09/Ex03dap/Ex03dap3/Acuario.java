public class Acuario {
  // Contenido del main
  public static void main(String[] args) {
    Pez1 pepe = new Pez1("Pepe", "azul", "globo");
    Pez1 casilda = new Pez1("Casilda", "naranja", "tropical");
    System.out.println(pepe);
    System.out.println(casilda);
    Estrella lola = new Estrella("Lola", "violeta", 6);
    Estrella rodolfo = new Estrella("Rodolfo", "verde", 7);
    System.out.println(lola);
    System.out.println(rodolfo);
    // Apareamiento
    Pez1 pececillo = pepe.seApareaCon(casilda);
    Estrella estrellita = lola.seApareaCon(rodolfo);
    System.out.println(pececillo);
    System.out.println(estrellita);

  }
}
