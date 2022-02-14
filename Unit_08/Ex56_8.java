public class Ex56_8 {
  public static void main(String[] args) {
    int[][] x = generaArrayBiInt(10, 10, 100, 100);
  }

  public static int[] corteza(int[][] n) {

  }

  // GENERA ARRAY BIDIMENSIONAL
  public static int[][] generaArrayBiInt(int xlength, int ylength, int min, int max) {
    int[][] x = new int[xlength][ylength];
    for (int i = 0; i < xlength; i++) {
      for (int j = 0; j < ylength; j++) {
        x[i][j] = (int) (Math.random() * (max - min)) + min;
      }
    }
    return x;
  }

}
