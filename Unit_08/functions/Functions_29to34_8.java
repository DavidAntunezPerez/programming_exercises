package functions;

public class Functions_29to34_8 {
  public static void main(String[] args) {

  }

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
