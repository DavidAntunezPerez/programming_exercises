/**
 * @author David Antunez Perez
 * @date 15/02/2022
 *       Se quiere implementar una aplicación para la gestión de un acuario. El
 *       primer paso será modelar las
 *       clases necesarias. Crea las clases AnimalDeAcuario (no instanciable),
 *       Pez y Estrella estableciendo
 *       la jerarquía correctamente. De todos los animales del acuario se debe
 *       conocer su nombre y color.
 *       Además, se debe conocer la raza de los peces y el número de brazos de
 *       las estrellas. Si un animal
 *       acuático se aparea con otro, nace un animalillo de la misma especie con
 *       las características de los
 *       padres cogidas de forma aleatoria. Por ejemplo, si se aparean dos
 *       estrellas de mar, una se llama Alicia
 *       y la otra Alfonso, el nombre de la cría podría ser Alicia o Alfonso. Si
 *       Alicia tiene 5 brazos y Alfonso
 *       tiene 6 brazos, la cría puede tener 5 o 6 brazos pero no otra cantidad.
 *       Con los peces sucede lo mismo.
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
