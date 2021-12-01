/**
 * Escribe un programa que muestre por pantalla 100 números enteros separados
 * por un espacio. Los números deben estar generados de forma aleatoria en
 * un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej.
 * [25]).
 * 
 * @author David Antunez Perez
 */
public class Ex25_6 {
  public static void main(String[] args) {
    // declaramos el número que será aleatorio
    int rn = 0;
    for (int i = 0; i < 100; i++) {
      rn = (int) (Math.random() * 190) + 1;
      // creamos un identificador de primos
      // ponemos la diferenciación de múltiplos de 5
      if ((rn % 5 == 0)&&(rn >= 5)) {
        System.out.print("[" + rn + "]" + " ");
      } else {
        System.out.print(rn + " ");
      }
    }
  }
}
