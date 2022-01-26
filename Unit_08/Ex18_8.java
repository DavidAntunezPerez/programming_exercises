/**
 * Escribe un programa que pase de decimal a binario.
 */
public class Ex18_8 {
  public static void main(String[] args) {
    
  }
  public static int decimalBinario(int nIntr){
    int result = 0;
    int aux;
    do{
      aux= nIntr;
      aux %= 2;
      nIntr /= 2;
    }while(nIntr > 0);
    return result;
  }
}
