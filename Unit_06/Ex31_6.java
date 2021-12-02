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
  public static void main(String[] args) {
    System.out.print("Introduce la cantidad de dinero a apostar: ");
    int n = Integer.parseInt(System.console().readLine());
    
  }
}
