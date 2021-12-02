/**
 * Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
 * partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
 * muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
 * 11, el jugador gana la misma cantidad que apostó y termina la partida. Por
 * ej.
 * si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos
 * dados
 * suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no
 * se
 * da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el
 * juego
 * entra en una segunda etapa. En esta etapa, el jugador buscará volver a
 * obtener
 * ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
 * pierde. Si sale otro número, tiene que seguir tirando.
 * 
 * @author David Antúnez Pérez
 */
public class Ex31_6 {
  public static void main(String[] args) throws Exception {
    System.out.print("Introduce la cantidad de dinero a apostar: ");
    int n = Integer.parseInt(System.console().readLine());
    int dice1 = (int) (Math.random() * 6 + 1);
    int dice2 = (int) (Math.random() * 6 + 1);
    System.out.println();
    do {
      dice1 = (int) (Math.random() * 6 + 1);
      dice2 = (int) (Math.random() * 6 + 1);
      System.out.print("Tirando dados");
      for (int i = 0; i < 7; i++) {
        System.out.printf(".");
        Thread.sleep(200 * i);
      }
      System.out.println();
      System.out.println("El resultado de los dados han sido " + dice1 + " y " + dice2);
      System.out.print("En total, suman " + (dice1 + dice2));
      if (((dice1 + dice2) == 2) || ((dice1 + dice2) == 3) || ((dice1 + dice2) == 12)) {
        System.out.print("\nLo siento, has perdido todo el dinero.");
        n = 0;
      }
      System.out.println("");
    } while (n != 0);
  }
}
