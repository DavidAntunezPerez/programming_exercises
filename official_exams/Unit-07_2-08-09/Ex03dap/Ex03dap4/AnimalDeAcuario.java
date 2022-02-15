/**
 * @author David Antunez Perez
 * @date 15/02/2022
 *       Se van a utilizar las clases AnimalDeAcuario y Pez creadas en el
 *       ejercicio anterior por lo que
 *       deberás hacer una copia de dichas clases en la carpeta correspondiente
 *       a este ejercicio. Además de
 *       hacer la copia, crea la clase Pecera. De una pecera se debe saber su
 *       nombre o identificador y los
 *       litros de capacidad. En una pecera se pueden meter peces. Para
 *       determinar la cantidad máxima de
 *       peces que caben en una pecera, se ha de tener en cuenta que no se deben
 *       meter más de 4 peces por
 *       litro de capacidad. En cualquier momento se podrá mostrar información
 *       sobre la pecera: nombre, litros
 *       de capacidad, número de peces que contiene y un listado con todos
 *       ellos.
 * 
 * 
 */
public abstract class AnimalDeAcuario {
  // Declaramos las clases genéricas para todos los animales de acuario
  // Vamos a ponerlas protected para así tengan visibilidad en Pez y Estrella
  protected String nombre;
  protected String color;

  // Generamos el constructor genérico de Animales de Acuario
  public AnimalDeAcuario(String nombre, String color) {
    this.nombre = nombre;
    this.color = color;
  }

}
